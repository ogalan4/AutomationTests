import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    private WebDriver driver;//initializing variables
    private LogInPage logInPage;
private MainPage mainPage;
//method, working before each test-method
@Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","E:\\софт\\Testing\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://booking.com");
mainPage=new MainPage(driver);
mainPage.loginClick();
logInPage=new LogInPage(driver);
    }
    //testing typing logIn fields
    @Test
    public void loginTyping(){
logInPage.typingLoginForm("Bob");
String headd=logInPage.getHeader();
        Assert.assertEquals("Вход",headd);
    }
//method, working after each test-method
    @After
    public void tearDown(){
        driver.quit();
    }
}

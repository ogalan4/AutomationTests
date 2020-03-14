import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {
    private WebDriver driver;//initializing variables
    private MainPage mainPage;
//method, that work before each test-metod
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","E:\\софт\\Testing\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://booking.com");
         mainPage=new MainPage(driver);
    }
//testing logIn
    @Test
    public  void logIn(){
        LogInPage logInPage=mainPage.loginClick();
        String head=logInPage.getHeader();
        Assert.assertEquals("Вход",head);
    }
//testing find results of searh
    @Test
    public  void selectHotel(){
        PricePage pricePage=mainPage.findResults("Турция");
String head=pricePage.getHead();
        Assert.assertEquals("Найти",head);
    }
    //testing shale link
    @Test
    public void clickShale(){
        ShalePage shalePage=mainPage.clickShale();
                for (String wh:driver.getWindowHandles())
        {
            driver.switchTo().window(wh);
        }
        String head=shalePage.getHeader();
        Assert.assertEquals("Шале",head);
    }
//method, work after each test-method
    @After
    public void tearDown(){
        driver.quit();
    }
}

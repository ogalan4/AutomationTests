import Facebook.FacebookPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FacebookPagetest {
    private WebDriver driver;
    private MainPage mainPage;
    private FacebookPage facebookPage;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\софт\\Testing\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http:\\allo.ua");
        mainPage = new MainPage(driver);
        facebookPage=mainPage.getFacebookPage();
    }
    @Test
    public void getFacebookPageHeading(){
String heading=facebookPage.getFBH();
        Assert.assertEquals("Открыть Страницу «Алло» на Facebook",heading);
    }

    @Test
    public void getErrorMessegeFromFBLPage(){
        String error=facebookPage.invalidLogin().getErrorMessege();
        Assert.assertEquals("Вы ввели неверный пароль. Забыли пароль?",error);
    }

    @After
    public void TearDown(){
        driver.quit();
    }
}
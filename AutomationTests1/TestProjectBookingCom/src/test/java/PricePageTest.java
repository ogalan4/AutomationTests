import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PricePageTest {
    private WebDriver driver;//initializing variables
    private PricePage pricePage;
//method, working before each test-method
    @Before
public void setUp(){
        System.setProperty("webdriver.chrome.driver","E:\\софт\\Testing\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://booking.com");
        MainPage mainPage=new MainPage(driver);
        mainPage.findResults("Египет");
pricePage=new PricePage(driver);
    }
    //testing of selecting checkboxes and getting the resullt
    @Test
    public void selHot(){
        pricePage.selectHotels();
    }
//testing of getting true header
    @Test
    public void getHead(){
        String head=pricePage.getHead();
        Assert.assertEquals("Найти",head);
    }
//testing of click emailButton
    @Test
    public void email(){
        EmailPage emailPage=pricePage.clickEmailButton("email@com");
    }
    //method, working after each test-method
    @After
    public void tearDown(){
        driver.quit();
    }
}

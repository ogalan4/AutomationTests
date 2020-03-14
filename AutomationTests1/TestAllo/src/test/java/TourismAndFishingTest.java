import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tourism.MetalDetector;
import tourism.TourismAndFishing;

import java.util.concurrent.TimeUnit;

public class TourismAndFishingTest {
    private WebDriver driver;
    private TourismAndFishing tourismAndFishing;
private MainPage mainPage;
    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\софт\\Testing\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http:\\allo.ua");
         mainPage = new MainPage(driver);
        tourismAndFishing = mainPage.clickTourismAF();
    }

    @Test
    public void getMetalDetectorPage(){
        MetalDetector metalDetector=tourismAndFishing.clickMetalDetector();
            }

    @Test
    public void inputPriceIntoMDPage(){
        MetalDetector metalDetector=tourismAndFishing.clickMetalDetector();
        metalDetector.typingPrice("200","5000");
    }
    @Test
    public void selectMetalDetector(){
        MetalDetector metalDetector=tourismAndFishing.clickMetalDetector();
        metalDetector.checkFieldsMetDetect("100","7000");
    }

    @After
    public void TearDown(){
        driver.quit();
    }
}
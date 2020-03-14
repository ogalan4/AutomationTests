import Facebook.FacebookPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import recovery.RecoveryPage;
import tourism.TourismAndFishing;

import java.util.concurrent.TimeUnit;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","E:\\софт\\Testing\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http:\\allo.ua");
         mainPage=new MainPage(driver);
    }

    @Test
    public void getHeading(){
      String heading=  mainPage.getHeader();
        Assert.assertEquals("Каталог товарів",heading);
    }

    @Test
    public void getSearchPageInput(){
        SearchInput searchInput=mainPage.typingSearch();
       String heading= searchInput.getbyHeader();
        Assert.assertEquals("НОВИНКИ",heading);
    }

    @Test
    public void getDeliveryAndPaymantsHeading(){
        DeliveryAndPaymants deliveryAndPaymants=mainPage.clickDAP();
        String heading=deliveryAndPaymants.getHeaderDAP();
        Assert.assertEquals("Доставка та оплата",heading);
    }

    @Test
    public void alertOnHTPage(){
HomeTehnik homeTehnik=mainPage.clickHT();
homeTehnik.jsVorker();
    }

    @Test
    public void closeOpenedOnDAPage(){
    DeliveryAndPaymants deliveryAndPaymants=mainPage.clickDAP();
    deliveryAndPaymants.closesweep();
}

    @Test
    public void getToTAFPage(){
       TourismAndFishing tourismAndFishing=mainPage.clickTourismAF();
        }

        @Test
        public void getToFBPage(){
        FacebookPage facebookPage=mainPage.getFacebookPage();
        }

        @Test
        public  void getRecoveryPage(){
        RecoveryPage recoveryPage=mainPage.clickRP();
        }

            @After
    public void TearDown(){
        driver.quit();
    }
}

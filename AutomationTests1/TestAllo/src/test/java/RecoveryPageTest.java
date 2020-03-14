import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import recovery.PlamberTechnikPage;
import recovery.RecoveryPage;

import java.util.concurrent.TimeUnit;

public class RecoveryPageTest {
    private WebDriver driver;
    private MainPage mainPage;
    private RecoveryPage recoveryPage;
    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","E:\\софт\\Testing\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http:\\allo.ua");
        mainPage=new MainPage(driver);
       recoveryPage= mainPage.clickRP();
    }

    @Test
    public void getRPageHeader(){
        String heading=recoveryPage.getRecPageHeader();
        Assert.assertEquals("РОЗПРОДАЖ ТОВАРІВ З УЦІНКОЮ",heading);
    }

    @Test
    public void sortElementsPlamPage(){
        PlamberTechnikPage plamberTechnikPage=recoveryPage.linkPTP().sortElements();
    }

    @Test
    public void getPTPageHeader(){
        PlamberTechnikPage plamberTechnikPage=recoveryPage.linkPTP();
        String  heading=plamberTechnikPage.getPlamberHeader();
        Assert.assertEquals("Популярні",heading);
    }

@After
    public void TearDown(){
        driver.quit();
}
}

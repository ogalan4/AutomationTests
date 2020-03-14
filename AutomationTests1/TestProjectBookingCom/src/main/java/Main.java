import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    static WebDriver driver;
    public static void main(String[] args) {
//set persistance
        System.setProperty("webdriver.chrome.driver","E:\\софт\\Testing\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://booking.com");
//testing of mainPage, LoginPage,PricePage,ShalePage and EmailPage with using pageObjectPattern
        MainPage mainPage=new MainPage(driver);

        mainPage.findResults("Египет");
PricePage pricePage=new PricePage(driver);
pricePage.selectHotels();
pricePage.clickEmailButton("mlll");
        mainPage.loginClick();
        LogInPage logInPage=new LogInPage(driver);
        logInPage.getHeader();
        logInPage.typingLoginForm("souse");
        driver.get("http://booking.com");
    mainPage.clickShale();
    ShalePage shalePage=new ShalePage(driver);
for (String wh:driver.getWindowHandles())//switch to the last page
{
    driver.switchTo().window(wh);
}
    shalePage.getHeader();

    }
}

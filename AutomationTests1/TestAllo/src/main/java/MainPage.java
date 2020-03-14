import org.openqa.selenium.*;
import Facebook.FacebookPage;
import recovery.RecoveryPage;
import tourism.TourismAndFishing;

import java.io.File;
import java.io.IOException;

import static com.sun.deploy.cache.Cache.copyFile;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By mainHeder = By.xpath("//span[text()='Каталог товарів']");
    private By tourismAndFishing = By.xpath("//span[text()='Туризм та риболовля']");
    private By deliveryAndPay = By.xpath("//a[text()='Доставка та оплата']");

    private By searchInput = By.xpath("//input[@id='search']");
    private By clickInputButton = By.xpath("//button[@class='button']");

    private By homeTechnick = By.xpath("//a[text()='Побутова техніка']");
    private By recovery = By.xpath("//span[text()='Уцінка']");

    private By facebookLink= By.xpath("//li[@id='promotions_weinsocial_li_first']/a");
//get some heder on this page
        public String getHeader(){
        String head=driver.findElement(mainHeder).getText();
            System.out.println(head);
        return head;
    }
//insert some value in inputField, make screenshot and press searchButton
    public SearchInput typingSearch() {
        driver.findElement(searchInput).sendKeys(Keys.chord(Keys.SHIFT, "samsung"));
        File scr2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            copyFile(scr2,new File("d:\\scr2"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.findElement(clickInputButton).click();
        return new SearchInput(driver);
    }
//get to the TourismAndFishingPage using doubleClick
    public TourismAndFishing clickTourismAF() {
        driver.findElement(tourismAndFishing).click();
        driver.findElement(tourismAndFishing).click();
 return new TourismAndFishing(driver);
    }
//get to the DeliveryAndPaymantsPage
    public DeliveryAndPaymants clickDAP(){
        driver.findElement(deliveryAndPay).click();
        return new DeliveryAndPaymants(driver);
    }
//get to the HomeTehnikPage
    public HomeTehnik clickHT(){
        driver.findElement(homeTechnick).click();
        return new HomeTehnik(driver);
    }
//get to the RecoveryPage
    public RecoveryPage clickRP(){
        driver.findElement(recovery).click();
        for (String windowHandle:driver.getWindowHandles()){driver.switchTo().window(windowHandle);}
        return new RecoveryPage(driver);
    }
//get to the FacebookLoginPage
    public FacebookPage getFacebookPage(){
        driver.findElement(facebookLink).click();
        for (String windowHandle:driver.getWindowHandles()){driver.switchTo().window(windowHandle);}
        return new FacebookPage(driver);
    }
}


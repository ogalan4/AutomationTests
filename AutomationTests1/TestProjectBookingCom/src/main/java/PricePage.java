import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
using page object pattern
finding elements on page by xpath
using 2 methods for testing this page
 */
public class PricePage {
    private WebDriver driver;//initializing webdriver

    public PricePage(WebDriver driver) {
        this.driver = driver;
    }
    //finding elements
    private By header= By.xpath("//span[@class='geo_sr_hbe-title']");
    private By check1=By.xpath("//a[@data-id='pri-3']//div");
    private By check2=By.xpath("//div[@class='filterbox_options_content']/div[4]/div[2]/a[3]");
    private By check3=By.xpath("//div[@class='filterbox_options_content']/div[7]//div[2]/a[3]");
    private By check4=By.xpath("//div[@class='filterbox_options_content']/div[13]//div[2]/a[4]");
    private By buttonSearch=By.xpath("//button[@class='sb-searchbox__button  js-sb-submit-button']");
private By email=By.xpath("//input[@type='email']");
private By emailButton=By.xpath("//button[@id='newsletter_button_footer']");
private By head=By.xpath("//div[@class='sb-searchbox__row u-clearfix -title']//span");
//method of selecting different check-boxes on the page and get resullt
public PricePage selectHotels(){
    System.out.println(driver.findElement(header).getText());
    driver.findElement(check1).click();
    driver.findElement(check2).click();
    driver.findElement(check3).click();
    driver.findElement(check4).click();
    driver.findElement(buttonSearch).click();
    return new PricePage(driver);
}
//method of clicking email-button and getting to the emailPage
public EmailPage clickEmailButton(String emaill){
    driver.findElement(email).sendKeys(emaill);
    driver.findElement(emailButton).click();
    return new EmailPage(driver);
}
//method of getting some header on the page
public String getHead(){
    return driver.findElement(head).getText();
}
}

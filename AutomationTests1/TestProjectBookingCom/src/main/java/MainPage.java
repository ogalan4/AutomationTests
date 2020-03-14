import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/* Using PageObjectPattern
all elements are finded by Xpath
there are three test metods in this class
 */
public class MainPage {
    private WebDriver driver; //initializing webdriver

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

//elements on mainPage

    private By place=By.xpath("//input[@id='ss']");
    private By dateIn1=By.xpath("//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']");
   private By dateIn2=By.xpath("//div[@class='bui-calendar__content']/div[2]/table//tr[2]/td[3]");
    private By person1=By.xpath("//span[@class='xp__guests__count']");
    private By person2=By.xpath("//button[@class='bui-button bui-button--secondary bui-stepper__add-button ']");
    private By button=By.xpath("//button[@data-sb-id='main']");
private By signInButton=By.xpath("//li[@id='current_account']");
private By typeOfApart=By.xpath("//div[@data-ats='44']//ul/li[4]");

//method of choising place, date and count of clients and finding resullt
    public PricePage findResults(String Place) {
        driver.findElement(place).sendKeys(Place);
        driver.findElement(dateIn1).click();
        driver.findElement(dateIn2).click();
        driver.findElement(person1).click();
        driver.findElement(person2).click();
        driver.findElement(button).click();

    return new PricePage(driver);
    }
//method of clicking on signIn button and LoginPage
    public LogInPage loginClick(){
        driver.findElement(signInButton).click();
        return new LogInPage(driver);
    }
//method of clicking on shale link and get ShalePage
    public ShalePage clickShale(){
        driver.findElement(typeOfApart).click();
        return new ShalePage(driver);
    }

}

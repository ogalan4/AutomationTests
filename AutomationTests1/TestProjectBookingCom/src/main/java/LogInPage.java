import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
using page object pattern
finding elements by xpath
using 2 methods to testinh this page
 */
public class LogInPage {
    private WebDriver driver;//initializing webdriver

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }
    //finding elements
    private By username=By.xpath("//input[@id='username']");
    private By button=By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']");
    private By header=By.xpath("//h1[text()='Вход']");
private  By error=By.xpath("//div[text()='Проверьте правильность ввода.']");
//method of typing loginForm
public LogInPage typingLoginForm(String Username){
    driver.findElement(username).sendKeys(Username);
    driver.findElement(button).click();
    String err=driver.findElement(error).getText();
    System.out.println(err);
    return new LogInPage(driver);
}
//method of getting some header on the page
public String getHeader(){
    String head=driver.findElement(header).getText();
    System.out.println(head);
    return head;
}
}

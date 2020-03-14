import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {
    private WebDriver driver;

    public LogIn(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameField = By.xpath("//input[@type='text']");
    private By passField=By.xpath("//input[@type='password']");
    private By signInButton=By.xpath("//input[@type='submit']");
    private By heading=By.xpath("//div[@class='auth-form-header p-0']");
private By errorMessege=By.xpath("//div[@class='container-lg px-2']");
private By createAccLink=By.xpath("//a[text()='Create an account']");
    public LogIn typingUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
        return this;
    }
    public LogIn typingPass(String pass){
        driver.findElement(passField).sendKeys(pass);
        return this;
    }

    public LogIn invalidFieldTyping(String username,String pass){
        this.typingUsername(username);
        this.typingPass(pass);
        driver.findElement(signInButton).click();
        return new LogIn(driver);
    }

    public String getHeadingText(){
        return driver.findElement(heading).getText();
    }

    public String getErrorMessege(){
        return driver.findElement(errorMessege).getText();
    }

    public SignupPage createAcc(){
        driver.findElement(createAccLink).click();
        return new SignupPage(driver);
    }
}

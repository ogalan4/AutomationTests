import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    private WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    private By heading =By.xpath("//h1");
    private By errormesege=By.xpath("//div[@class='flash flash-error my-3']");
    private By usernameField=By.xpath("user_login");
    private By emailField=By.xpath("//input[@id='user_email']");
    private By passField=By.xpath("//input[@id='user_password']");
    private By createAcountButton=By.xpath("//button[@class='btn-mktg signup-btn  js-octocaptcha-form-submit width-full']");
private By userNameError=By.xpath("//dd[@id='description_c68ab8edf6e3']");
private By emailError=By.xpath("//dd[@id='description_d2d51b757492']");
private By passError=By.xpath("description_43f6bde0b6e4");

    public SignupPage typingUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
        return  this;
    }
    public SignupPage typingEmail(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }
    public SignupPage typingPass(String pass){
        driver.findElement(passField).sendKeys(pass);
        return  this;
    }

    public String getHeadingField(){
        return driver.findElement(heading).getText();
    }

    public SignupPage register(String username, String email, String pass){
        this.typingUsername(username);
        this.typingEmail(email);
        this.typingPass(pass);
driver.findElement(createAcountButton).click();
return this;
    }

    public String getErrorMessege(){
        return driver.findElement(errormesege).getText();
    }

    public String getUserNameError(){
        return driver.findElement(userNameError).getText();
    }
    public  String getemailError(){
        return driver.findElement(emailError).getText();
    }
    public String getPassError(){
        return driver.findElement(passError).getText();
    }
}

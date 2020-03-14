import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By signInButton=By.xpath("//a[@href='/login'");
    private By signUpButton=By.xpath("//a[@href='/join?source=header-home']");
    private By userNameFild=By.xpath("");
    private By emailField=By.xpath("");
    private By passField=By.xpath("");
    private By signUpForGithub=By.xpath("");

public LogIn clickSingIn(){
    driver.findElement(signInButton).click();
    return new LogIn(driver);
}

public SignupPage signUpButton(){
    driver.findElement(signUpButton).click();
    return new SignupPage(driver);
}
public SignupPage clickSignUpForGithub(){
    driver.findElement(signUpForGithub).click();
    return new SignupPage(driver);
    }

    public MainPage typingUsername(String username){
    driver.findElement(userNameFild).sendKeys(username);
    return new MainPage(driver);
        }

        public MainPage typingEmail(String email){
    driver.findElement(emailField).sendKeys(email);
    return new MainPage(driver);
        }
        public MainPage typingPass(String pass){
    driver.findElement(passField).sendKeys(pass);
    return new MainPage(driver);
        }

        public SignupPage register(String username,String email, String pass){
    this.typingUsername(username);
    this.typingEmail(email);
    this.typingPass(pass);
    this.clickSignUpForGithub();
    return new SignupPage(driver);
        }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    static WebDriver driver;
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\софт\\Testing\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://github.com");

MainPage mainPage=new MainPage(driver);
//mainPage.register("Bob","bobr","123");

//    mainPage.typingEmail("asdf");

//        LogIn login=new LogIn(driver);
//        login.typingPass("dddddd");
//        login.getErrorMessege();
//        login.getHeadingText();
//        login.invalidFieldTyping("","d");

    SignupPage signupPage=new SignupPage(driver);
//    signupPage.getErrorMessege();
    signupPage.register("sd","ee","rtr");
    }
}

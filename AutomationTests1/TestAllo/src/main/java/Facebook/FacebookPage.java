package Facebook;

import Facebook.FacebookLoginPage;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

import static com.sun.deploy.cache.Cache.copyFile;

public class FacebookPage {
    private WebDriver driver;

    public FacebookPage(WebDriver driver) {
        this.driver = driver;
    }
    private By facebookHeader= By.xpath("//div[text()='Открыть Страницу «Алло» на Facebook']");
    private By facebookLogin=By.xpath("//input[@id='email']");
    private By facebookButton=By.xpath("//input[@id='u_0_3']");
//get header from facebookPage
    public String getFBH(){
        String fbh=driver.findElement(facebookHeader).getText();
        return fbh;
    }
//input some values in login fields, make screenshot and press login button
    public FacebookLoginPage invalidLogin(){
        driver.findElement(facebookLogin).sendKeys(Keys.chord(Keys.LEFT_SHIFT,"alibaba"));
        File screen1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            copyFile(screen1,new File("d:\\scr1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.findElement(facebookButton).click();
        for (String windowHandle:driver.getWindowHandles()){driver.switchTo().window(windowHandle);}
                return new FacebookLoginPage(driver);
    }
}

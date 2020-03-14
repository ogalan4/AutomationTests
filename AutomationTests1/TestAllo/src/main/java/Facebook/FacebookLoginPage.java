package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage {
    private WebDriver driver;

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By errorMessege=By.xpath("//div[text()='Вы ввели неверный пароль. ']");
// get error messege after wrong login
    public String getErrorMessege(){
        String em=driver.findElement(errorMessege).getText();
        return em;
    }
}

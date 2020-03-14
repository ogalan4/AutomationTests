import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomeTehnik {
    private WebDriver driver;

    public HomeTehnik(WebDriver driver) {
        this.driver = driver;
    }
    //scrolldown on some pixels and return on main position, execute some js screpts
    public void jsVorker(){
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)","");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jse.executeScript("window.scrollBy(0,-1000)","");
        jse.executeScript("confirm('Are you see this?');");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();}
            driver.switchTo().alert().accept();
        }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchInput {
    private WebDriver driver;

    public SearchInput(WebDriver driver) {
        this.driver = driver;
    }
private By byHeader= By.xpath("//b[text()='НОВИНКИ']");
//get some header on this page
    public String getbyHeader(){
        String byHed=driver.findElement(byHeader).getText();
        return byHed;
    }
}

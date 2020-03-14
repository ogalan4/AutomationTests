import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShalePage {
    private WebDriver driver;

    public ShalePage(WebDriver driver) {
        this.driver = driver;
    }
    private By header=By.xpath("//div[@class='lp-hero__searchbox xpi__searchbox ']//h1/span"); //finding of element on the page
//method of getting of some header on page
    public String getHeader(){
        String headr=driver.findElement(header).getText();
        System.out.println(headr);
        return headr;
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DeliveryAndPaymants {
    private WebDriver driver;

    public DeliveryAndPaymants(WebDriver driver) {
        this.driver = driver;
    }
    private By deliveryHeader= By.xpath("//h1[text()='Доставка та оплата']");
    private By closePlace =By.xpath("//div[@class='close-button-icon']");
private  By closePlace2=By.xpath("//span[@class='close-prompt']");
//get some header on this page
    public String getHeaderDAP(){
        String hederDAP=driver.findElement(deliveryHeader).getText();
        return hederDAP;
    }
//close some opened list of fields
    public DeliveryAndPaymants closesweep(){
        driver.findElement(closePlace2).click();
        driver.findElement(closePlace).click();
        return new DeliveryAndPaymants(driver);
    }
}

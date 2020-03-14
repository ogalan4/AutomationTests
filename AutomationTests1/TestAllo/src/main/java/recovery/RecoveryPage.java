package recovery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecoveryPage {
    private WebDriver driver;

    public RecoveryPage(WebDriver driver) {
        this.driver = driver;
    }
    private By recoveryHeader= By.xpath("//h1[text()='РОЗПРОДАЖ ТОВАРІВ З УЦІНКОЮ']");
    private By plumberTechnik= By.xpath("//span[text()='Сантехніка та ремонт']");

    public String getRecPageHeader(){
        String recPageHeder=driver.findElement(recoveryHeader).getText();
        return recPageHeder;
    }
//click and get to PlamberTechnikPage
    public PlamberTechnikPage linkPTP(){
        driver.findElement(plumberTechnik).click();

        for (String windowHandle:driver.getWindowHandles()){driver.switchTo().window(windowHandle);}
        return new PlamberTechnikPage(driver);
    }

}

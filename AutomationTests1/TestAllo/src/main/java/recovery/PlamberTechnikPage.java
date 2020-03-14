package recovery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlamberTechnikPage {//from recovery
    private WebDriver driver;

    public PlamberTechnikPage(WebDriver driver) {
        this.driver = driver;
    }
    private By plamberHeader= By.xpath("//div[text()='Популярні']");
    private By plamberSweep=By.xpath("//div[@id='select-sort']//div[@class='a']");
    private By plamberSort=By.xpath("//li[text()='Від дорогих до дешевих']");
//get some header from PlamberPage
    public String getPlamberHeader(){
        String plamHed=driver.findElement(plamberHeader).getText();
        return plamHed;
    }
//click on opened list, select one from them
    public PlamberTechnikPage sortElements(){
        driver.findElement(plamberSweep).click();
        driver.findElement(plamberSort).click();
        return new PlamberTechnikPage(driver);
    }
}

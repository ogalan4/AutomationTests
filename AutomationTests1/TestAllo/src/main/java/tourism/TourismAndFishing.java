package tourism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tourism.MetalDetector;

public  class TourismAndFishing {
    private WebDriver driver;

    public TourismAndFishing(WebDriver driver) {
        this.driver = driver;
    }

    private By metalDetector= By.xpath("//a[@title='Металошукачі']");
//click and get to MetalDetectorPage
    public MetalDetector clickMetalDetector(){
        driver.findElement(metalDetector).click();
        return new MetalDetector(driver);
    }
}

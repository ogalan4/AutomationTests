package tourism;

import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

import static com.sun.deploy.cache.Cache.copyFile;

public  class MetalDetector {
    private WebDriver driver;

    public MetalDetector(WebDriver driver) {
        this.driver = driver;
    }
    private By check1= By.xpath("//label[text()='TREKER']");
    private By openedList= By.xpath("//dl[@id='narrow-by-list']/dt[8]/div[2]");
    private By checkByOpen= By.xpath("//label[text()='80']");
    private By priceFrom= By.xpath("//input[@name='price_from']");
    private By priceTo= By.xpath("//input[@name='price_to']");
//typing price in priceFields
    public MetalDetector typingPrice(String firatPrice, String  lastPrice){
        driver.findElement(priceFrom).sendKeys(Keys.END);
        driver.findElement(priceFrom).sendKeys(Keys.chord(Keys.SHIFT,Keys.HOME));
        driver.findElement(priceFrom).sendKeys(Keys.DELETE);
        driver.findElement(priceFrom).sendKeys(firatPrice);
        driver.findElement(priceTo).sendKeys(Keys.chord(Keys.SHIFT,Keys.HOME));
        driver.findElement(priceTo).sendKeys(Keys.DELETE);
        driver.findElement(priceTo).sendKeys(lastPrice);
        return this;
    }
//typing price, check some checkboxes, and press findButton
    public MetalDetector checkFieldsMetDetect(String firatPrice, String lastPrice)
    {
        driver.findElement(check1).click();
                this.typingPrice(firatPrice,lastPrice);
        driver.findElement(openedList).click();
                driver.findElement(checkByOpen).click();
        File scren3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            copyFile(scren3,new File("d:\\scr3"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new MetalDetector(driver);
    }
}
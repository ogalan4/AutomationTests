import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
//-------------------------системные установки, начало
        System.setProperty("webdriver.chrome.driver","E:\\софт\\Testing\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("http://Booking.com");
       //-------------------

   /*-------------размеры екрана, переход по сайтам
   driver.manage().window().setSize(new Dimension(300,200));
   driver.navigate().to("http://allo.ua");
   driver.navigate().back();
   driver.manage().window().maximize();
   driver.navigate().forward();
   */
   /*-------------выполнение скрипта
        JavascriptExecutor jse=(JavascriptExecutor)driver;
//        jse.executeScript("alert('Hello user!');");
  //      try {
    //        Thread.sleep(3000);
      //  } catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        jse.executeScript("confirm('Are you shure?');");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();
jse.executeScript("window.scrollBy(0,1000)","");
jse.executeScript("window.scrollBy(0,-1000)","");
                 */
/*-----------------наведение на обьект, сложные действия
driver.navigate().to("http://allo.ua");
        WebElement link1=driver.findElement(By.xpath("//span[text()='Xiaomi']"));
        WebElement link2=driver.findElement(By.xpath("//span[text()='Apple']"));

        Actions actions=new Actions(driver);
        actions.moveToElement(link1).build().perform();
        actions.contextClick(link1);
        actions.dragAndDrop(link1,link2).build().perform();
        actions.clickAndHold(link1).moveToElement(link2).build().perform();
        actions.doubleClick(link2);
*/
/*------------------поиск по локаторам
        driver.manage().window().maximize();
//driver.findElement(By.linkText("Авиабилеты")).click();
//driver.findElement(By.partialLinkText(" досуга")).click();
//driver.findElement(By.id("current_account")).click();
//driver.findElement(By.className("sign_in_wrapper")).click();
//driver.findElement(By.cssSelector("input#ss")).sendKeys("Турция");
//driver.findElement(By.cssSelector("span.xp__guests__count")).click();
//driver.findElement(By.xpath("//div[@class='sb-searchbox__input sb-date-field__field  -empty sb-date__field-svg_icon']")).click();
//driver.findElement(By.xpath("//div[@class='bui-calendar__content']/div[2]/table//span[text()='4']")).click();
 */

        /*-------------------работа с чекбоксами и радио
         driver.manage().window().maximize();
driver.findElement(By.cssSelector("input#ss")).sendKeys("Турция");
driver.findElement(By.xpath("//div[@class='xp__button']//button")).click();
driver.findElement(By.xpath("//form[@id='filterbox_wrap']//div[@id='filter_popular_activities']//a[@data-id='popular_activities-65']")).click();
        List<WebElement> listChek=driver.findElements(By.xpath("//form[@id='filterbox_wrap']//div[@id='filter_class']/div[2]/a"));
         System.out.println(listChek.size());
        for (WebElement list:listChek){
            list.click();
        }
        */
        ///*--------------------ввод с клавиатуры
        WebElement key =driver.findElement(By.xpath("//input[@type='search']"));
        key.sendKeys(Keys.chord(Keys.SHIFT,"испания"));
        key.sendKeys(Keys.chord(Keys.SHIFT,Keys.HOME));
        key.sendKeys(Keys.DELETE);
        key.sendKeys(Keys.chord(Keys.SHIFT,"египет"));

         //*/

//        driver.quit();
    }

}

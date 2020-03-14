import org.openqa.selenium.JavascriptExecutor;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\софт\\Testing\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http:\\allo.ua");
        MainPage mainPage=new MainPage(driver);
//        mainPage.getHeader();                                                                 //get header from the MainPage
//        mainPage.clickHT();                                                                   //get to the HomeTechnikPage
//        mainPage.clickHT().jsVorker();                                                        //execute some javaScripts
//        mainPage.typingSearch();                                                              //input some value in the searchField
//        System.out.println(mainPage.typingSearch().getbyHeader());                            //print header from the page
//        mainPage.clickDAP();                                                                  //get to the DeliveryAndPaymantsPage
//        System.out.println(mainPage.clickDAP().getHeaderDAP());                               //print the header from the DeliveryAndPaymantsPage
//        mainPage.clickDAP().closesweep();                                                     //close some opened Fields
//        mainPage.clickTourismAF();                                                            //get to the TourismAndFishingPage
//mainPage.clickTourismAF().clickMetalDetector().typingPrice("200","5000");                     //input price in priceFields
//mainPage.clickTourismAF().clickMetalDetector().checkFieldsMetDetect("200","20000");           //input price and select some other fields
//        mainPage.clickRP();                                                                   //get to the RecoveryPage
//        mainPage.clickRP().linkPTP();                                                         //get to the PlamgerTechnikPage
//        System.out.println(mainPage.clickRP().getRecPageHeader());                            //print the header from the RecoveryPage
//mainPage.clickRP().linkPTP().sortElements();                                                  //sort elements on PTPage
//        System.out.println(mainPage.clickRP().linkPTP().getPlamberHeader());                  //print the header from the PlamberPage
//        mainPage.getFacebookPage();                                                           //get to the FacebookPage
//        System.out.println(mainPage.getFacebookPage().getFBH());                              //get some header from the FacebookPage
//        mainPage.getFacebookPage().invalidLogin();                                            //input the invalid data in the loginField
        System.out.println(mainPage.getFacebookPage().invalidLogin().getErrorMessege());      //print the errorMessege from the registrationPage
driver.quit();
    }
}

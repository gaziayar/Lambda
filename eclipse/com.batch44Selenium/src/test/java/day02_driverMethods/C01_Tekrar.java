package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    public static void main(String[] args) throws InterruptedException {

        // biz en ilkel haliyle projemize kutuphaneleri jar dosyalari olarak yukledik
        // bu ekledigimiz dosyalarla artik driverin ayarlarini yapabiliriz.
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32/chromedriver.exe");
        // set property methodu iki parametre ister
        // ilki kullanacagimiz browsere ait driver
        // ikinci ise selenium sitesinden indirip projemize ekldeigimiz chromedriverin pathi
        // windows kullanicilari .exe eklerken
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
         Thread.sleep(5000);
         driver.close();
        // javadan gelir icine yazilan milisaniye kadar kodlarin calismasini durdurur.







    }
}

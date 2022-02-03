package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {
    public static void main(String[] args) throws InterruptedException {
//1. Yeni bir Class olusturalim.C07_ManageWindowSet
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
//2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
//3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println( driver.manage().window().getPosition());
        System.out.println( driver.manage().window().getSize());
//4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage( ).window( ).setPosition(new Point(0,0));
        driver.manage( ).window( ).setSize(new Dimension(300,500));
//5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        int xpozisyonu=driver.manage().window().getPosition().getX();
        int ypozisyonu=driver.manage().window().getPosition().getY();
        int genislik=driver.manage().window().getSize().getWidth();
        int yukseklik=driver.manage().window().getSize().getHeight();


        Thread.sleep(3000);
if(xpozisyonu==-10 && ypozisyonu==-10 && genislik==300 &&  yukseklik==500)
{

    System.out.println("olceklendirme testi passed");
} else{
    System.out.println("olceklendirme testi Failed");

}


        //8. Sayfayi kapatin
driver.close();


    }
}

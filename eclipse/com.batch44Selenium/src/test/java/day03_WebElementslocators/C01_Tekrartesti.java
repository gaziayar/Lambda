package day03_WebElementslocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrartesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Yeni bir class olusturun (TekrarTesti)

        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("https://www.youtube.com");
        String actualTitleYoutube= driver.getTitle();
        String expectedYoutubeTitle="youtube";
        if(actualTitleYoutube.equals(expectedYoutubeTitle)){
            System.out.println("youtube title testi pass");
        }else {
            System.out.println("youtube title testi failed\n actual sayfa basligi:"+ actualTitleYoutube);
        }


        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
String actualYoutubeUrl= driver.getCurrentUrl();
        String arananKelimeYoutubeUrl="youtube";
        if(actualTitleYoutube.contains(arananKelimeYoutubeUrl)){
            System.out.println("youtube url testi pass");
        }else {
            System.out.println("youtube url testi failed\n actual youtube url :" + actualTitleYoutube);
        }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
       String actualAmazonTitle= driver.getTitle();
       String amazonTitleArananKelime="Amazon";

       if(actualTitleYoutube.contains(amazonTitleArananKelime)){
           System.out.println("amazon title testi pass");
       }else{
           System.out.println("amazon title testi failed\n actual amazon title:" + actualAmazonTitle);
       }

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın,
        // degilse doğru URL'yi yazdırın

        String expectedAmazonUrl="https://www.amazon.com/";
        String actualAmazonUrl= driver.getCurrentUrl();

        if (expectedAmazonUrl.equals(actualAmazonUrl)){
            System.out.println("Amazon URL testi PASS");
        } else {
            System.out.println("Amazon Url testi FAILED \nActual Amazon Url : " + actualAmazonUrl);
        }
       //  WebElement aramaKutusu= driver.findElement(By.name("twotabsearchtextbox"));

        //11.Sayfayi kapatin
        driver.close();
    }
}

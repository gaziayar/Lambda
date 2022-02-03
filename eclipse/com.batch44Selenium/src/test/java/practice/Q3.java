package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techlistic.com/p/selenium-practice-from.html");
        driver.findElement(By.xpath("//a[@id='cookieChoiceDismiss']")).click();
      //  driver.manage().deleteAllCookies();
        driver.findElement(By.name("//a[@class='firstname']")).sendKeys("gazi");
       driver.findElement(By.name("//input[@name='lastname']")).sendKeys("M");
       driver.findElement(By.id("//input[@id='sex-0']")).click();
       driver.findElement(By.id("//input[@id='exp-1']")).click();
       driver.findElement(By.id("datepker")).sendKeys("10/04/2019");
       WebElement prf=driver.findElement(By.id("profesion-1"));
       prf.click();
       prf.sendKeys(Keys.PAGE_DOWN);

    }
}

package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.sahibinden.com/");
        String shbTitle=driver.getTitle();
        String shbUrl=driver.getCurrentUrl();

        System.out.println("shbUrl="+shbUrl);
        System.out.println("shbTitle="+shbTitle);
        if (shbTitle.contains("Oto"))
            System.out.println("title oto yazisi pass ");
            else
            System.out.println("title oto yazisi faild");
            if (shbUrl.contains("Oto"))
                System.out.println("url oto yazisi  pass");
            else System.out.println("url oto yazisi faild");
            driver.get("https://wwww.gittigidiyor.com/");
            boolean isTrue=driver.getTitle().contains("Sitesi");
            if (isTrue)
                System.out.println("test pass");
            else System.out.println("test faild");
            String gittiTitle=driver.getTitle();
        System.out.println("gittititle="+gittiTitle);
        System.out.println(gittiTitle.contains("sitesi")? "pass":"faild");
            driver.navigate().back();
            driver.navigate().refresh();
            driver.navigate().forward();
            driver.quit();
    }
}
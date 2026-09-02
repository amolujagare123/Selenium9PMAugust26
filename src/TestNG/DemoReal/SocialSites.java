package TestNG.DemoReal;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {

    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Browser opened - SocialSites");
    }

    @Test
    public void facebook() {
        driver.get("https://www.facebook.com/");
        System.out.println("Title: " + driver.getTitle());
    }

    @Test
    public void linkedIn() {
        driver.get("https://www.linkedin.com/");
        System.out.println("Title: " + driver.getTitle());
    }

    @Test
    public void instagram() {
        driver.get("https://www.instagram.com/");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
        System.out.println("Browser closed - SocialSites");
    }
}

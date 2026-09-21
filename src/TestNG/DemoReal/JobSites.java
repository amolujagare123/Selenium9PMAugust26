package TestNG.DemoReal;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends Base {



    @Test
    public void indeed() {
        driver.get("https://in.indeed.com/");
        System.out.println("Title: " + driver.getTitle());
    }

    @Test
    public void foundit() {
        driver.get("https://www.foundit.in/");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
        System.out.println("Browser closed - JobSites");
    }
}

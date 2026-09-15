package TestNG.DemoReal;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites {

    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Browser opened - JobSites");
    }

    @Test
    public void naukri() {
        driver.get("https://www.naukri.com/");
        System.out.println("Title: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle() , "my naukri" ,
                "This is not a naukri site");
    }

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

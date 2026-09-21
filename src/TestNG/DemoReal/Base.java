package TestNG.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Base {

    public static WebDriver driver;

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
}

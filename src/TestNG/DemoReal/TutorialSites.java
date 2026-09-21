package TestNG.DemoReal;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialSites extends Base {


    @Test
    public void tutorialsPoint() {
        driver.get("https://www.tutorialspoint.com/");
        System.out.println("Title: " + driver.getTitle());
    }

    @Test
    public void geeksForGeeks() {
        driver.get("https://www.geeksforgeeks.org/");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
        System.out.println("Browser closed - TutorialSites");
    }
}

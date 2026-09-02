package TestNG.DemoReal;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites {

    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Browser opened - AISites");
    }

    @Test
    public void claude() {
        driver.get("https://claude.ai/");
        System.out.println("Title: " + driver.getTitle());
    }

    @Test
    public void chatGPT() {
        driver.get("https://chatgpt.com/");
        System.out.println("Title: " + driver.getTitle());
    }

    @Test
    public void perplexity() {
        driver.get("https://www.perplexity.ai/");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
        System.out.println("Browser closed - AISites");
    }
}

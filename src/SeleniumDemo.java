import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // open browser

        //driver.manage().window().maximize(); // maximize window
        driver.get("https://blazedemo.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(" https://amolujagare.com/");

        Thread.sleep(4000);




        //driver.close(); // closes current window only

       // driver.quit(); // closes all windows opened by driver
    }
}

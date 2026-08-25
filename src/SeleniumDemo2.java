import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // open browser

        //driver.manage().window().maximize(); // maximize window
        driver.get("https://blazedemo.com/");

        driver.navigate().to(" https://amolujagare.com/");

        Thread.sleep(4000);

        driver.navigate().back();

        Thread.sleep(4000);

        driver.navigate().forward();

        Thread.sleep(4000);

        driver.navigate().refresh();




        //driver.close(); // closes current window only

       // driver.quit(); // closes all windows opened by driver
    }
}

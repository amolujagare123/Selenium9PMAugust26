import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com1/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();



        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername2 = driver.findElement(By.name("email"));
        txtUsername2.sendKeys("amolujagar1e@gmail.com");

        WebElement txtPassword2 = driver.findElement(By.name("password"));
        txtPassword2.sendKeys("admin1123");

        WebElement btnLogin2 = driver.findElement(By.className("btn-login"));
        btnLogin2.click();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername3 = driver.findElement(By.name("email"));
        txtUsername3.sendKeys("");

        WebElement txtPassword3 = driver.findElement(By.name("password"));
        txtPassword3.sendKeys("");

        WebElement btnLogin3 = driver.findElement(By.className("btn-login"));
        btnLogin3.click();




    }
}

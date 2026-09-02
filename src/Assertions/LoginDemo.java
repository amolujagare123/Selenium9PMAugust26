package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("Customers")).click();
        driver.findElement(By.linkText("+ Add Customer")).click();

        // ---- Add New Customer form ----


        WebElement btnAddCustomer = driver.findElement(By.className("btn-primary"));
        btnAddCustomer.click();


    }
}

package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDemo2 {


    @Test (dataProvider = "getData")
    public  void myTest(String username,String password) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

    }

    @DataProvider
    Object[][] getData()
    {
        Object[][] data = new Object[5][2];

        data[0][0] = "amolujagare@gmail.com";
        data[0][1] = "admin123";

        data[1][0] = "invalid-1";
        data[1][1] = "invalid-1";

        data[2][0] = "invalid-2";
        data[2][1] = "invalid-2";

        data[3][0] = "invalid-3";
        data[3][1] = "invalid-3";

        data[4][0] = "invalid-4";
        data[4][1] = "invalid-4";

        return data;
    }

}

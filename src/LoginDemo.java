import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

        driver.findElement(By.partialLinkText("Customers")).click();
        driver.findElement(By.linkText("+ Add Customer")).click();

        // ---- Add New Customer form ----

        WebElement txtFullName = driver.findElement(By.id("f_name"));
        txtFullName.sendKeys("Rahul Sharma");

        WebElement txtEmail = driver.findElement(By.id("f_email"));
        txtEmail.sendKeys("rahul.sharma@example.com");

        WebElement txtPhone = driver.findElement(By.id("f_phone"));
        txtPhone.sendKeys("+91 98765 43210");

        WebElement txtCompany = driver.findElement(By.name("company"));
        txtCompany.sendKeys("Sharma Traders");

        WebElement txtCreditLimit = driver.findElement(By.id("f_credit"));
        txtCreditLimit.clear();
        txtCreditLimit.sendKeys("50000");

        WebElement txtCity = driver.findElement(By.name("city"));
        txtCity.sendKeys("Pune");

        WebElement txtCountry = driver.findElement(By.name("country"));
        txtCountry.sendKeys("India");

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("123 MG Road, Camp");

        WebElement txtNotes = driver.findElement(By.name("notes"));
        txtNotes.sendKeys("Priority customer, follow up quarterly.");

        WebElement btnAddCustomer = driver.findElement(By.className("btn-primary"));
        //btnAddCustomer.click();


    }
}

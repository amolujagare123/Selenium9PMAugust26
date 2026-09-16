package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ExtentReportsDemo.util.ForExtentReport.failedCaseScreenshot;

public class LoginDemo2 {

    // Extent Reports
    ExtentReports extent;
    @BeforeClass
    public void initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management system Test report");
        reporter.config().setReportName("regression testing report");

        extent.setSystemInfo("Dev Name","Amol Ujagare");
        extent.setSystemInfo("Testers Name","Sneha");
        extent.setSystemInfo("Execution start Date","1 oct 2026");
        extent.setSystemInfo("Deadline","15 Dec 2026");
        extent.setSystemInfo("Version","SM001.12");

    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }


    @Test
    public  void myTest() throws InterruptedException, IOException {

        ExtentTest test = extent.createTest("valid loginTest");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin13");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

        test.info("login button is clicked");

       Thread.sleep(4000);


        String expected = "Dashboard";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        try {

            Assert.assertEquals(actual, expected, "This is not a Dashboard");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+failedCaseScreenshot(driver));
        }

    }

    @Test
    public  void myTest2() throws InterruptedException, IOException {

        ExtentTest test = extent.createTest("invalid loginTest");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admn13");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

        test.info("login button is clicked");

        Thread.sleep(4000);

        String expected = "Invalid email or password. Please try again.";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='alert-error']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);



        try {

            Assert.assertEquals(actual,expected,"incorrect or no error message");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+failedCaseScreenshot(driver));
        }
    }

    @Test
    public  void myTest3() {

        ExtentTest test = extent.createTest("blank loginTest");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/stockmaster");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.name("email"));
        txtUsername.sendKeys("");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.className("btn-login"));
        btnLogin.click();

        test.info("login button is clicked");

    }
}

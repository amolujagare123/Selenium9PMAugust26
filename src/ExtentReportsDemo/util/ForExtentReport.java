package ExtentReportsDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReport {

    public static String failedCaseScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot
        // assign current driver to it
        // type cast driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using ts (object reference of TakesScreenshot)
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("_ddMMyyyy_mmsshh").format(new Date());
        String fileName = "IMG"+timestamp +".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(scrFile , new File("Reports/screenshots/"+fileName));

        return fileName;

    }


    public static  ExtentReports initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management system Test report");
        reporter.config().setReportName("regression testing report");

        extent.setSystemInfo("Dev Name","Amol Ujagare");
        extent.setSystemInfo("Testers Name","Sneha");
        extent.setSystemInfo("Execution start Date","1 oct 2026");
        extent.setSystemInfo("Deadline","15 Dec 2026");
        extent.setSystemInfo("Version","SM001.12");

        return extent;

    }
}

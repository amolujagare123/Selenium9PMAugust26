package ListenersDemo;

import TestNG.DemoReal.Base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ExtentReportsDemo.util.ForExtentReport.failedCaseScreenshot;
import static ExtentReportsDemo.util.ForExtentReport.initExtentReport;

public class MyExtentListener extends Base implements ITestListener {

    ExtentReports extent;
    ExtentTest test;
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
         test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");

        test.pass("this test is passed");

    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
        test.fail("This test is failed : "+result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+failedCaseScreenshot(driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
        test.skip("This test is skipped : "+result.getThrowable());
    }


    public void onStart(ITestContext context) {
        System.out.println("onStart");
        if(extent==null)
          extent = initExtentReport();
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish");

        extent.flush();
    }
}

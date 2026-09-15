package ScreenshotsDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoScreenshot {

    @Test
    public void sampleTest() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gmail.com/");

        // 1. create the object reference of TakesScreenshot
        // assign current driver to it
        // type cast driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using ts (object reference of TakesScreenshot)
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("_ddMMyyyy_mmsshh").format(new Date());
        String fileName = "IMG"+timestamp +".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(scrFile , new File("screenshots/"+fileName));
    }
}

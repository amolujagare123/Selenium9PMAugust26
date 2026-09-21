package DataProvider;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginDemoEx {


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
    Object[][] getData() throws IOException {
        // 1. read the excel
        FileInputStream fis = new FileInputStream("Data/Data1.xls");

        // 2. get the workbook object using fileObject
        HSSFWorkbook workbook = new HSSFWorkbook(fis);

        // 3. get the sheet
        HSSFSheet sheet = workbook.getSheet("Sheet1");

        // 4. get all active rows
        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][2];

        for (int i=0 ; i<rowCount ;i ++)
        {
            HSSFRow row = sheet.getRow(i);
            data[i][0] = row.getCell(0).toString();
            data[i][1] = row.getCell(1).toString();
        }

      /*  data[0][0] = "amolujagare@gmail.com";
        data[0][1] = "admin123";

        data[1][0] = "invalid-1";
        data[1][1] = "invalid-1";

        data[2][0] = "invalid-2";
        data[2][1] = "invalid-2";

        data[3][0] = "invalid-3";
        data[3][1] = "invalid-3";

        data[4][0] = "invalid-4";
        data[4][1] = "invalid-4";*/

        return data;
    }

}

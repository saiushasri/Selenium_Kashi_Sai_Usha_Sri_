package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataFromExcel {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "mydata")
	public void myTest(String username, String password) {
		driver.findElement(By.name("email1")).sendKeys(username);

		driver.findElement(By.id("password1")).sendKeys(password);

		driver.findElement(By.className("submit-btn")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Sign out']")).isDisplayed());
	}

	@DataProvider(name = "mydata")
	public Object[][] data() {
		Object arr[][] = null;
		try {
			FileInputStream fis = new FileInputStream(new File("./SapientTestData/TestData.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int rows = wb.getSheet("LoginData").getPhysicalNumberOfRows();
			int cols = wb.getSheet("LoginData").getRow(0).getPhysicalNumberOfCells();

			arr = new Object[rows][cols];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					arr[i][j] = wb.getSheet("LoginData").getRow(i).getCell(j).getStringCellValue();
				}
			}
			wb.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arr;
	}

	@AfterMethod
	public void tearDown() {
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		driver.quit();
	}
}

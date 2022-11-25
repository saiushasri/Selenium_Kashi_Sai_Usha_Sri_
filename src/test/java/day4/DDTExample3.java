package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DDTExample3 {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider = "mydata")
	public void myTest(String username,String password)
	{
		driver.findElement(By.name("email1")).sendKeys(username);
		
		driver.findElement(By.id("password1")).sendKeys(password);
		
		driver.findElement(By.className("submit-btn")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Sign out']")).isDisplayed());
	}
	@DataProvider(name = "mydata")
	public Object[][] data()
	{
		Object[][] arr=new Object[4][2];
		arr[0][0]="sample9@gmail.com";
		arr[0][1]="Mukesh1234";
		arr[1][0]="samplemukesh@gmail.com";
		arr[1][1]="Mukesh1234";
		arr[2][0]="samplemukesh1@gmail.com	";
		arr[2][1]="Mukesh1234";
		arr[3][0]="samplemukesh2@gmail.com";
		arr[3][1]="sdasdas";
		return arr;
	}
	@AfterMethod
	public void tearDown()
	{
		//driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		driver.quit();
	}

}

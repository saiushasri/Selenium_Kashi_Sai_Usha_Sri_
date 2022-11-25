package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTest {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void verifyTitle()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
	}
	
	@Test
	public void verifyElements()
	{
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
	}
	
	@Test
	public void verifySocialMediaCount()
	{
		Assert.assertEquals(driver.findElements(By.xpath("//div[@id='social-icons']//img")).size(),4);
	}
	
	@Test
	public void verifyForgotPasswordLink()
	{
		Assert.assertTrue(driver.findElement(By.linkText("Forgot your password?")).isDisplayed());
	}
}

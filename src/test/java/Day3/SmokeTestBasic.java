package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTestBasic {

	@Test
	public void verifyTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
		driver.quit();
		
	}
	
	@Test
	public void verifyElements()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
		driver.quit();
	}
	
	@Test
	public void verifySocialMediaCount()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		Assert.assertEquals(driver.findElements(By.xpath("//div[@id='social-icons']//img")).size(),4);
		driver.quit();
		
	}
	
	@Test
	public void verifyForgotPasswordLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		Assert.assertTrue(driver.findElement(By.linkText("Forgot your password?")).isDisplayed());
		driver.quit();
	}
}

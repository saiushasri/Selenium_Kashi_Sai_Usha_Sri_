package AutomateAllClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserCommands {

	@Test
	public void BrowserCommandsA() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/signup");
		
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement email=driver.findElement(By.xpath("//input[@id='name']"));
		
		
//		System.out.println(email.isDisplayed());
//		System.out.println(email.isSelected());
//		System.out.println(email.getSize());
		
		
		driver.get("https://www.google.com");
		driver.get("https://www.twitter.com");
		driver.get("https://www.facebook.com");
		//Assert.assertTrue(driver.getTitle().contains("iNeuron"));
		
//		Navigation nav=driver.navigate();
//		nav.back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		driver.close();

	}

}

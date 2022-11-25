package AutomateAllClasses;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert {

	@Test
	public void HandleAlertA() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		//driver.switchTo().alert().accept();
		//Alerts are in javascript. They are javascript alert

		driver.findElement(By.xpath("//input[@value='Sign in']")).click();

		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);

		String msg = alt.getText();

		if (msg.contains("Please enter a valid user name1")) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}

		alt.accept();

		driver.findElement(By.name("login")).sendKeys("mukesh@rediffmail.com");
		Assert.assertTrue(driver.getCurrentUrl().contains("rediff"));

		driver.quit();
	}

}

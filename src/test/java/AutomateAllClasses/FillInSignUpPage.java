package AutomateAllClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FillInSignUpPage {

	@Test
	public void FillInSignUpPage() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/signup");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("User4");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("user4@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("User@123");
		driver.findElement(By.xpath("//label[contains(text(),'hhh')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//label[contains(text(),'Cypress Automation Testing')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//label[.='Playwright']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//label[contains(text(),'Web Development')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		Thread.sleep(1000);

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='state']"));
		Select select = new Select(dropdown);

		select.selectByIndex(2);

		Thread.sleep(2000);

		select.selectByVisibleText("Goa");

		Thread.sleep(2000);

		select.selectByValue("Karnataka");

		List<WebElement> allValues = select.getOptions();

		select.selectByVisibleText("Telangana");

		List<WebElement> list = select.getOptions();

		for (WebElement e : list) {
			System.out.println(e);
			if (e.getText().contains("Rajasthan")) {
				break;
			}
		}

		driver.findElement(By.xpath("//button[contains(.,'Sign up')]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		driver.close();

	}

}

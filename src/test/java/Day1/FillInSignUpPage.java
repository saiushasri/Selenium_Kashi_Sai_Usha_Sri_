package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillInSignUpPage {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/signup");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("User1");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("user1@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("User@123");
		driver.findElement(By.xpath("//label[contains(text(),'Testing')]")).click();
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

	}

}

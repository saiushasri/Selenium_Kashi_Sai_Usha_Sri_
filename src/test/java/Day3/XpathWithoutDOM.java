package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathWithoutDOM {

	public static void main(String[] args) throws InterruptedException {
		/*
		 */
		/*
			 * [text()='Gender']//following:://input[1] ineuron register page
			 */
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/signup");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("User1");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("user1@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("User@123");
		driver.findElement(By.cssSelector("//label[text()='hhhh']//preceding::input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("//label[text()='JavaSelenium']//preceding::input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("//label[text()='JavaScript']//preceding::input[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("//label[text()='Female']//preceding::input[1]")).click();
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

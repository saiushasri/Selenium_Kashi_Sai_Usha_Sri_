package AutomateAllClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class ActionClassExamples {

	@Test
	public void actionClass() {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		Assert.assertTrue(driver.getTitle().contains("Droppable"));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		WebElement child = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(child);

		Actions act = new Actions(driver);

		// will perform right click
		act.contextClick();

		// double click
		act.doubleClick();

		// will perform keyboard events
		act.keyUp(Keys.ADD);
		act.keyDown(Keys.ADD);

		// can perform keyboard events as well as type
		act.sendKeys("");
		
		driver.quit();

	}

}

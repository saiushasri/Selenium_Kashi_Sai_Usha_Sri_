package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExamples {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

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

	}

}

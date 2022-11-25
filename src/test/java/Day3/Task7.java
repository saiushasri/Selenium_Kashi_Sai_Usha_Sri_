package Day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task7 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("https://ineuron-courses.vercel.app/Login");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ineuron");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		Thread.sleep(3000);
		
		WebElement hover=driver.findElement(By.xpath("//span[text()='Manage']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(hover).perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Manage Categories']")).click();
		List<String> list=new ArrayList<String>();
		list.addAll(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[contains(text(),'Add New Category')]")).click();
		
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("JavaScript");
		alt.accept();
		
		List<WebElement> ele1=driver.findElements(By.xpath("//td[text()='JavaScript']"));
		
		if(ele1.size()==1)
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[text()='JavaScript']//following::button[1]")).click();
			driver.findElement(By.xpath("//button[text()='Delete']")).click();
		}
		else
		{
			System.out.println("Failed");
		}
		
		List<WebElement> ele2=driver.findElements(By.xpath("//td[text()='JavaScript']"));
		
		if(ele2.size()==0)
		{
			driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
		}
		
		
		driver.close();
		
		
		
	}

}

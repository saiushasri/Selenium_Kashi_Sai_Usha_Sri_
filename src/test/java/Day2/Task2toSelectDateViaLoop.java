package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2toSelectDateViaLoop {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("datepicker")).click();
		
		List<WebElement> allElements=driver.findElements(By.xpath("//table[contains(@class,'calendar')]//td//a[contains(text(),26)]"));
		Thread.sleep(2000);
		
		for(WebElement ele: allElements)
		{
			if(ele.getText().contains("26"))
			{
				ele.click();
			}
		}

	}

}

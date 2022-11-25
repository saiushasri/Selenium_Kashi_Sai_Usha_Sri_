package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3SelectFromDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("menu1")).click();
		Thread.sleep(2000);
		
		List<WebElement> allElements=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		
		Thread.sleep(3000);
		
		for(WebElement ele:allElements)
		{
			System.out.println(ele.getText());
			if(ele.getText().contains("JavaScript"))
			{
				ele.click();
			}
		}
		
		
		
		
	}

}

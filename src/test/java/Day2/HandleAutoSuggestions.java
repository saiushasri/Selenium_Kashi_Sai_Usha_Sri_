package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Publicis Sapient");
		
		Thread.sleep(3000);
		
		List<WebElement> allElements = driver.findElements(By.xpath("//div[@role='option']"));
		
		for(WebElement ele:allElements)
		{
			String str=ele.getText();
			System.out.println(str);
			if(str.contains("bangalore"))
			{
				ele.click();
				break;
			}
		}
		

	}

}

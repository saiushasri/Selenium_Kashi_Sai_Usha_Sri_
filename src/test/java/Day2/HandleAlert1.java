package Day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
	
		Alert al=null;
		for(int i=0 ; i<20 ; i++)
		{
			try
			{
				al=driver.switchTo().alert();
				
			}
			catch(NoAlertPresentException e)
			{
				System.out.println("Waiting for WebElement");
				Thread.sleep(1000);
			}
		}
		
		if(al!=null)
		{
			System.out.println("Text : "+al.getText());
			al.accept();
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		

	}

}

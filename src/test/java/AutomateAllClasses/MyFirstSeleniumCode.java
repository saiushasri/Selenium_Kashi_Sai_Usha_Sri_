package AutomateAllClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumCode {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Kashi Sai Usha Sri");
		
		String title=driver.getTitle();
		System.out.println("Title : "+title);
		String url=driver.getCurrentUrl();
		System.out.println("URL : "+url);
		//driver.quit();

	}

}

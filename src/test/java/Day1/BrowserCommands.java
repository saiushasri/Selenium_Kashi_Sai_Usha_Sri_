package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/signup");
		
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		
		
		System.out.println(email.isDisplayed());
		System.out.println(email.isSelected());
		System.out.println(email.getSize());
		
		
		driver.get("https://www.google.com");
		driver.get("https://www.twitter.com");
		driver.get("https://www.facebook.com");
		
//		Navigation nav=driver.navigate();
//		nav.back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}

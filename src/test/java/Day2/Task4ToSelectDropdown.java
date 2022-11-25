package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4ToSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("menu1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("ul[@class='dropdown-menu']//li//a[contains(text(),'JavaScript')]")).click();
		
	}

}

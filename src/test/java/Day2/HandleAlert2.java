package Day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlert2 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		WebDriverWait webwait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		Alert al=webwait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println("Text : "+al.getText());
		al.accept();
		

	}

}

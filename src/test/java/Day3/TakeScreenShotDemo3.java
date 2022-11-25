package Day3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Helper.Utility;

public class TakeScreenShotDemo3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		

		Utility.captureScreenshotWithTimeStamp(driver);
		Utility.captureScreenshotWithTimeStamp(driver);
		driver.findElement(By.name("q")).sendKeys("Publicis Sapient");
		Thread.sleep(2000);
		Utility.captureScreenshotWithTimeStamp(driver);
		driver.quit();

	}

}

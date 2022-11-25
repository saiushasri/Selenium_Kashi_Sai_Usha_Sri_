package Day5;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAutoIT {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("file-upload"))).click().perform();
		//add escape characters in the path
		//give path of compiled file
		Runtime.getRuntime().exec("C:\\Users\\saikashi\\Desktop\\FileUpload.exe");
		driver.findElement(By.id("file-submit")).click();
	}

}

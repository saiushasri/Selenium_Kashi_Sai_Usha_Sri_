package Helper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void captureScreenshot(WebDriver driver)
	{
		try {
			FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./ss.png"));
		} catch (IOException e) {
			System.out.println("Failed:"+e.getMessage());
		}

	}
	public static void captureScreenshotWithTimeStamp(WebDriver driver)
	{
		try {
			FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), 
					new File("./"+captureDateTime()+".png"));
		} catch (IOException e) {
			System.out.println("Failed:"+e.getMessage());
		}

	}
	public static void captureScreenshotOld(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./ss.png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			System.out.println("Failed:"+e.getMessage());
		}

	}
	
	public static String captureDateTime()
	{
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		String result=sdf.format(d);
		return result;
	}
	
}

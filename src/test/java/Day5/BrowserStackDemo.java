package Day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserStackDemo {
	
	WebDriver driver;
	DesiredCapabilities capabilities;
	@BeforeMethod
	public void setup()
	{
		String USERNAME="saiushasrikashi_uCqxgy";
		String AUTOMATE_KEY="wvL3TRwmUsGokbV7fjgq";
		URL url=null;
		try {
			url = new URL("https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		capabilities=new DesiredCapabilities();
		capabilities.setCapability("osVersion", "16");
		capabilities.setCapability("deviceName", "iPhone 12 Mini");

		driver=new RemoteWebDriver(url, capabilities);
		driver.manage().window().maximize();
	}
	
	@Test
	public void myTest()
	{
		driver.get("hhtp://www.google.com");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}

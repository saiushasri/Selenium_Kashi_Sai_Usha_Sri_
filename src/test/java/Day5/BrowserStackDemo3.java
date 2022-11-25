package Day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BrowserStackDemo3 {

	WebDriver driver;
	DesiredCapabilities capabilities;
	@Parameters({"bName","bVersion","oName","oVersion"})
	@BeforeMethod
	public void setup(String bName,String bVersion,String oName,String oVersion)
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
		capabilities.setCapability("browserName", bName);
		capabilities.setCapability("browserVersion", bVersion);
		capabilities.setCapability("os", oName);
		capabilities.setCapability("osVersion", oVersion);
		driver=new RemoteWebDriver(url, capabilities);
		driver.manage().window().maximize();
	}
	@Test
	public void myTest()
	{
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		driver.findElement(By.id("btnLogin")).click();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

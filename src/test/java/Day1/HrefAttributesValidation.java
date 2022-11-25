package Day1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrefAttributesValidation {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mukeshotwani/Downloads/chromedrivernew");
		
				//WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				/*Options opt=driver.manage();
				
				Window win=opt.window();
				
				win.maximize();
				*/
			
				//win.minimize();
				
				driver.get("https://ineuron-courses.vercel.app/login");
				
				driver.manage().window().minimize();
				
				driver.manage().window().maximize();
				
				WebElement email=driver.findElement(By.id("email1"));
				
				System.out.println(email.isDisplayed());

				System.out.println(email.isEnabled());
				
				System.out.println(email.getAttribute("placeholder"));
				
				System.out.println(email.getTagName());
				
				System.out.println(email.getCssValue("font-size"));
				
				//System.out.println(email.getText());

	}

}

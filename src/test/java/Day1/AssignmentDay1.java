package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDay1 {

	private static final String WebDriverManager = null;

	public static void main(String[] args) throws InterruptedException {
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// To Load URL
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		
		// To give input to username text field
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		// TO give input to password text field
		driver.findElement(By.id("txtPassword")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		
		// To click on Login button
		driver.findElement(By.id("btnLogin")).click();
		
		// To click on admin button
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		Thread.sleep(2000);
		
		// To click on Add button
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(2000);
		
		// To give input to employee name text field
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("admin hhh d uuy");
		Thread.sleep(2000);
		
		// TO give user name text field
		driver.findElement(By.id("systemUser_userName")).sendKeys("admin0000");
		
		// To give input to password text field
		driver.findElement(By.id("systemUser_password")).sendKeys("kauiqb./=-08776");
		
		Thread.sleep(2000);
		
		// To give input to confirm password text filed
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Admin@0000");
		
		// To click on save button
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);
		
		// To click on profile
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(2000);
		
		// To click on logout
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		// To login with newly added credentials
		driver.findElement(By.id("txtUsername")).sendKeys("admin0000");
		driver.findElement(By.id("txtPassword")).sendKeys("kauiqb./=-08776");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
		//Logout newly created user
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		// To close the browser

		driver.close();
	}

}

package AutomateAllClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	WebElement id;
	WebElement pass;
	WebElement btnLogin;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		id = driver.findElement(By.id("txtUsername"));
		pass = driver.findElement(By.id("txtPassword"));
		btnLogin = driver.findElement(By.id("btnLogin"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void validUsernameandPassword() throws InterruptedException {
		id.sendKeys("Admin");
		pass.sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		btnLogin.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}

	@Test
	public void invalidUsernameandPassword() {
		id.sendKeys("abc");
		pass.sendKeys("abc");
		btnLogin.click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='divLoginButton']//span")).getText()
				.contains("Invalid credentials"));
	}

	@Test
	public void invalidUsername() {
		btnLogin.click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='divLoginButton']//span")).getText()
				.contains("Username cannot be empty"));
	}

	@Test
	public void invalidPassword() {
		id.sendKeys("abc");
		btnLogin.click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='divLoginButton']//span")).getText()
				.contains("Password cannot be empty"));
	}

//	@Test(dependsOnMethods = "validUsernameandPassword")
//	public void createUserandLogout() {
//		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
//		driver.findElement(By.id("btnAdd")).click();
//		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("admin hhh d uuy");
//		driver.findElement(By.id("systemUser_userName")).sendKeys("admin0000");
//		driver.findElement(By.id("systemUser_password")).sendKeys("kauiqb./=-08776");
//		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Admin@0000");
//		driver.findElement(By.id("btnSave")).click();
//		driver.findElement(By.xpath("//a[@id='welcome']")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
//		driver.findElement(By.id("txtUsername")).sendKeys("admin0000");
//		driver.findElement(By.id("txtPassword")).sendKeys("kauiqb./=-08776");
//		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
//	}

}

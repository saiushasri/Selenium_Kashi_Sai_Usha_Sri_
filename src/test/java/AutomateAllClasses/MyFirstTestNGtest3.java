package AutomateAllClasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstTestNGtest3 {

	
	@Test(priority=1)
	public void login() {
		System.out.println("Login");
		Reporter.log("Login Done");
	}

	@Test(priority=2)
	public void createAccount() {
		System.out.println("create account");
	}

	@Test
	public void deleteAccount() {
		System.out.println("delete account");
	}
	@Test
	public void logOutApplication() {
		System.out.println("logout application");
	}
}

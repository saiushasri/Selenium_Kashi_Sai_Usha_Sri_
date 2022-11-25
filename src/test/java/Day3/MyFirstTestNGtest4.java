package Day3;

import org.testng.annotations.Test;

public class MyFirstTestNGtest4 {

	
	@Test(priority=1)
	public void login() {
		System.out.println("Login");
	}

	@Test(priority=2)
	public void createAccount() {
		System.out.println("create account");
	}

	@Test(priority=3)
	public void deleteAccount() {
		System.out.println("delete account");
	}
	@Test(priority=-4)
	public void logOutApplication() {
		System.out.println("logout application");
	}
}

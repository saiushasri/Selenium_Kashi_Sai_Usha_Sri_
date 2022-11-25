package Day3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
public class MyFirstTestNGtest5 {
	@Test(invocationCount=10)
	public void test2()
	{
		Faker faker=new Faker();
		System.out.println(faker.book().title());
	}
	
	@Test
	public void login()
	{
		Assert.assertTrue(true);
		System.out.println("Login Done");
		Reporter.log("Login Done", true);
	}


	@Test(dependsOnMethods = "login")
	public void logOutFromApplication()
	{
		System.out.println("Logout Done");
	}
	

}

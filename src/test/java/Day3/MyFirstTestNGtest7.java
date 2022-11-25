package Day3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstTestNGtest7 {

	
	@Test
	public void test1() {
		Reporter.log("Exectued test case1");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods="test1")
	public void test2() {
		System.out.println("Test 2 Executed");
	}


}

package Day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CyclicDependency {

	
	@Test(dependsOnMethods="test2")
	public void test1() {
		System.out.println("Test 1 Executed");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods="test1")
	public void test2() {
		System.out.println("Test 2 Executed");
	}


}

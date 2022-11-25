package AutomateAllClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	@Test(enabled=false)
	public void test1() {
		Assert.assertEquals(12, 13);
	}

	@Test(enabled=false)
	public void test2() {
		Assert.assertEquals(12, 13, "Assertion Failed");
	}

	@Test(enabled=false)
	public void test3() {
		Assert.assertNotEquals(12, 13, "Aseertion Failed");
	}

	@Test(enabled=false)
	public void test4() {
		Assert.assertTrue(false);
	}

	@Test
	public void test5() {
		Assert.assertFalse(false);
	}

	@Test
	public void test6() {
		String msg = "Email already registered";
		Assert.assertTrue(msg.contains("registered"));
	}

	@Test
	public void test7() {
		String actual = "Email already registered";
		String expected = "Email already registered";
		Assert.assertTrue(actual.equalsIgnoreCase(expected));
		Assert.assertEquals(actual, expected);
	}

}

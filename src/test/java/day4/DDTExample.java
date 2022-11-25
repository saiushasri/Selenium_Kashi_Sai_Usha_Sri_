package day4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DDTExample {
	
	@Test(dataProvider = "testdata")
	public void myTest(String s1,String s2)
	{
		System.out.println(s1+" "+s2);
	}
	
	@DataProvider(name = "testdata")
	public Object[][] testDataGeneration()
	{
		Object[][] arr=new Object[2][2];
		arr[0][0]="Selenium";
		arr[0][1]="IDE";
		arr[1][0]="Grid";
		arr[1][2]="RC";
		return arr;
	}
	/*
	 * skip=1 for above test and ArrayIndexOutOfBoundsException
	 */

}

package Day3;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakeDemo {
	
	@Test
	public void fake()
	{
		Faker faker=new Faker();
		String streetName = faker.address().streetName();
		String number = faker.address().buildingNumber();
		String city = faker.address().city();
		String country = faker.address().country();
		
		System.out.println(streetName);
		System.out.println(number);
		System.out.println(city);
		System.out.println(country);
	}

}

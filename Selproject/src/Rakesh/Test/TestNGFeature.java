package Rakesh.Test;

import org.testng.annotations.Test;

public class TestNGFeature {

	@Test
	public void LoginTest()
	{
		System.out.println("login test");
		//int i= 9/0;
	}
	@Test(dependsOnMethods="LoginTest")//dependsOn LoginTest means once it execute then home test will be executed otherwise fail
	public void HomeTest()
	{
		System.out.println("home page test");
	}
	@Test(dependsOnMethods="HomeTest")
	public void SearchpageTest()
	{
		System.out.println("seach page test");
	}
}

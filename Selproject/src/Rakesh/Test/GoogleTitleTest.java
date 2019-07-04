package Rakesh.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	WebDriver wd;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().deleteAllCookies();
		wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.get("http://www.google.com");
	}
	
	@Test()
	public void googleTitleTest()
	{
		String title=wd.getTitle();
		System.out.println("title");
		Assert.assertEquals(title, "Google12","title is not match");//actual is title and expected is google
		//also we can put extra message like title is not match
		//No need to write the if condition or any condition
	}
	
	@Test()
	public void googleLogoTest()
	{
	boolean b=wd.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	  Assert.assertTrue(b);
	   //OR
	//Assert.assertEquals(b, true);
	}
	@AfterMethod
	public void quit()
	{
		wd.quit();
	}
}

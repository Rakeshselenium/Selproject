package Rakesh.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
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
	}
	@Test()
	public void googleLogoTest()
	{
	boolean b=wd.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	System.out.println(b);
	}
	@Test
	public void mailLinkTest()
	{
		boolean b1=wd.findElement(By.linkText("mail")).isDisplayed();
		System.out.println("b1");
	}
	@BeforeMethod
	public void tearDown()
	{
		System.out.println("tear Down");
	}
		@AfterMethod
		public void quit()
		{
			wd.quit();
		}
	}
	



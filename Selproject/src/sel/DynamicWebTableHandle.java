package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//14 eg.
public class DynamicWebTableHandle {
	      public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		  WebDriver wd=new ChromeDriver();   
		   wd.manage().window().maximize();//maximize windows
		   wd.manage().deleteAllCookies();//delete cookies
		   wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   wd.get("https://www.freecrm.com/index.html");
		   wd.findElement(By.name("username")).sendKeys("sumant");
		   wd.findElement(By.name("password")).sendKeys("sumant@123");
		   Thread.sleep(2000);
           wd.findElement(By.xpath("//input[@type='submit')]")).click();
           wd.switchTo().frame("mainpanel");
           Thread.sleep(2000);
           wd.findElement(By.xpath("//a(contains(text(),'contacts')]")).click();
           
	}

}

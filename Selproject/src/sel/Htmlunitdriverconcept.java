package sel;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Htmlunitdriverconcept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   //WebDriver wd=new ChromeDriver();
		   //run the script without any browser
		   WebDriver wd=new HtmlUnitDriver();
		   //HtmlUnitDriver() is not available in 3.0
		   //HtmlUnitDriver() is used to download HtmlUnitDriver jar file
		   //Advantage of HtmlUnitDriver() 
		   //1.Testing is happening behind--no browser launching
		   //2.Execution of test cases is very fast
		   //3.performance of script is very fast
		   //Not suitable for action class like mouse movement/double click/drag and drop
		   //Also called ghost driver/Headless driver
		   //in Selenium 3.0 HtmlUnitDriver() is separate entity
		   wd.manage().window().maximize();//maximize windows
		   wd.manage().deleteAllCookies();//delete cookies
		   wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   wd.get("https://www.freecrm.com/index.html");
		   System.out.println("Before login"+wd.getTitle());
		   wd.findElement(By.name("username")).sendKeys("sumant");
		   wd.findElement(By.name("password")).sendKeys("sumant@123");
		   wd.findElement(By.xpath("//[input(@type='submit')]")).click();
		   Thread.sleep(2000);
		   System.out.println("After login"+wd.getTitle());
	}

}

package sel;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.manage().window().maximize();//maxmize windows
		   wd.manage().deleteAllCookies();//delete cookies
		   wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   wd.get("https://www.google.co.in");//launch the URL
		   wd.navigate().to("https://www.facebook.com/");//launch the external URL
		   //Back and forward simulation
		   wd.navigate().back();
		   Thread.sleep(2000);
		   wd.navigate().forward();
		   Thread.sleep(2000);
		   wd.navigate().back();
		   wd.navigate().refresh(); 
			}
}

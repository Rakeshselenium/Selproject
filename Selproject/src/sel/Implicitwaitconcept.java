package sel;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwaitconcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("https://www.ebay.com/");//url
		   wd.manage().window().maximize();//maxmize windows
		   wd.manage().deleteAllCookies();//delete cookies
		   //Dynamic wait
		   wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//max wait for 40 second for fully loaded if it take above 40 sec then give the error.if it load 2 sec then rest of 38 sec willl be ignore
		   wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//for all the element/global wait after 40 sec it will take another 30 sec if page is not loaded

	}

}

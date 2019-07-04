package sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckList {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("https://www.naukri.com/nlogin/login");  
		   wd.findElement(By.id("usernameField")).sendKeys("rakeshkumarmng7@gmail.com");
		   wd.findElement(By.id("passwordField")).sendKeys("9620562500");
		   
		     	}
		}

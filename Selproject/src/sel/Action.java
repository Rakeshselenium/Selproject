package sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("https://www.facebook.com/");
		   wd.manage().window().maximize(); 
		   wd.findElement(By.id("email")).sendKeys("rakeshkumarmng7@gmail.com");
		   wd.findElement(By.id("pass")).sendKeys("abcdefgh");
		   wd.findElement(By.cssSelector("#u_0_2")).click();
		   
				}
		}
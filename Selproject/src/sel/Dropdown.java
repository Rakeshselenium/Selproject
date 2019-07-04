package sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("https://www.panind.com/india/lost_pan/?gclid=EAIaIQobChMIjZDnnerH3gIVmYRwCh0QZw1IEAAYASABEgKaHvD_BwE");
		   wd.manage().window().maximize();
		   wd.manage().deleteAllCookies();
		   //Handling Drop box
		   Select select=new Select(wd.findElement(By.id("pan_title")));//To manage the drop down box through Select Class
		  // select.selectByVisibleText("MR.");
		   select.selectByVisibleText("MRS.");
           //  select.selectByVisibleText("MISS");

	}
}

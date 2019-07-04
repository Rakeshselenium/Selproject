package sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionmousemove {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("https://spicejet.com/");
		   wd.manage().window().maximize();
		   wd.manage().deleteAllCookies();
		   Actions action=new Actions(wd);//perform action like click,double click,mouse movement
		   action.moveToElement(wd.findElement(By.linkText("ADD-ONS"))).build().perform();//perform action(Movement)
		   Thread.sleep(2000);
	   	   action.moveToElement(wd.findElement(By.linkText("SpiceMax"))).build().perform();//perform action
    	 //action.moveToElement(wd.findElement(By.linkText("SpiceMax"))).doubleClick();
		   wd.findElement(By.linkText("SpiceMax")).click();//perform click
	}
}

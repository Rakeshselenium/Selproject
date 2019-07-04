package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Dragndrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("https://jqueryui.com/droppable/");
		   wd.manage().window().maximize();
		   wd.manage().deleteAllCookies();
		   wd.switchTo().frame(0);//switch to frame it is present
		   Actions action=new Actions(wd);
		   action.clickAndHold(wd.findElement(By.xpath("//*[@id-'draggable']"))).moveToElement(wd.findElement(By.xpath("//[*@id-'droppable']"))).release().build().perform();
		}
}

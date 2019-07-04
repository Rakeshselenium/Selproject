package sel;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//window handler API
public class Popupwindowhandle {
	//1.Alerts---java script pop up(Alert API--accept,dosmiss method)
	//2.File upload pop up--Browse button(type=file,sendkey(path))
	//3.Browse window pop up--Advertisment pop up(Window Hadler API--getWindowhandle()method)

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("http://www.popuptest.com/goodpopups.html");
		   wd.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		   Thread.sleep(2000);
		  Set <String> handler=wd.getWindowHandles();//Switch the window to another window---wd.getWindowHandles() is used to get window id
		  Iterator<String> it=handler.iterator();// iterator object used to point to set object 
		  String parentWindowId=it.next();
		  System.out.println("parent windows id" +parentWindowId);
		  String childWindowId=it.next();
		  System.out.println("child window"+childWindowId);
		  wd.switchTo().window(childWindowId);
		   Thread.sleep(2000);
		  System.out.println("child window pop up title");
		  wd.getTitle();
		  wd.close();// to close the current windows.
		  //wd.quit(); to close the all window
		  wd.switchTo().window(parentWindowId);
		   Thread.sleep(2000);
		  System.out.println("parent window pop up title");
	}
}

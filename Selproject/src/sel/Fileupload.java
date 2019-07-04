package sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("https://html.com/input-type-file/");
		   //wd.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\Rakesh\\Desktop\\Java.txt");
		   wd.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Rakesh\\Desktop\\Java.txt");
	}
}

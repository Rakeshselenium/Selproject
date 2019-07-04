package sel;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.gargoylesoftware.htmlunit.javascript.JavaScriptEngine;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
public class Javascriptexecuterconcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		  WebDriver wd=new ChromeDriver();   
		   wd.manage().window().maximize();//maximize windows
		   wd.manage().deleteAllCookies();//delete cookies
		   wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   wd.get("https://www.freecrm.com/index.html");
		   wd.findElement(By.name("username")).sendKeys("sumant");
		   wd.findElement(By.name("password")).sendKeys("sumant@123");
		  // wd.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		   //high lights the login button
		   	}
        //executeScript-To execute the java Script
	 public static void flash(WebElement element,WebDriver driver)
	 {
		 JavaScriptEngine js=((JavaScriptEngine)driver);
		 String bgcolor=element.getCssValue("backgroundColor");
		 for(int i=0;i<10;i++)
		 {
			 changeColor("rgb(0,200,0)",element,driver);
			 changeColor(bgcolor,element,driver);
		 }
	 }
	 public static void changeColor(String color,WebElement element,WebDriver driver);
	 {
		     JavaScriptExecutor js=((JavaScriptExecutor) driver);
			 js.JavaScriptExecutor("arguments[0].style.backgroundColor='"+color+"'",element);
			 try
			 {
				 Thread.sleep(2000);
			 }catch(InterruptedException e)
			 {
				 
			 }
	 }	 
}	
	


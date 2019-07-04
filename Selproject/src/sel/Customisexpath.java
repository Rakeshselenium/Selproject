package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customisexpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("http://wwww.facebook.com");
		   wd.manage().window().maximize();
		   wd.manage().deleteAllCookies();
		   //Create custom Xpath--input tag,class then value of class
		  // wd.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("rakesh.kumarmng@gmail.com");
		  // wd.findElement(By.xpath("//input[@name='email']")).sendKeys("rakesh.kumarmng@gmail.com");
		   //Through contains keyword
		     //wd.findElement(By.xpath("//input[contains(@class,'inputtext')]")).sendKeys("rakesh.kumarmng@gmail.com");
		     //1.We use the contains if dynamic id is there
		     //id=test_123
		     //id=test_789
		     //means every time id has been change when you refresh the page so that time use contains function.
		     //other wise we can use also this code
		     //Q.how you handle dynamic id?
		     wd.findElement(By.xpath("input[contains(@input,'test_')]")).sendKeys("rakesh.kumarmng@gmail.com");
		     //2.Another method starts-with function
		     wd.findElement(By.xpath("input[starts-with(@id,'test_')]")).sendKeys("rakesh.kumarmng@gmail.com");
		     //if id=133_test_12
		     //id=123_test_12
		     //3.Another method ends-with function
		     wd.findElement(By.xpath("input[ends-with(@id,'_test_12)]")).sendKeys("rakesh.kumarmng@gmail.com");
		     //Specially for link text without using link text--using with xpath
		     //All link text starts with <a> tag
		     wd.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
	}
}

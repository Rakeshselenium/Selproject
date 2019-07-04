package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allseleniumcomponent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("https://reg.ebay.in/reg/PartialReg?siteid=203&co_partnerId=0&UsingSSL=1&rv4=1&signInUrl=https%3A%2F%2Fwww.ebay.in%2Fsignin%3Fsgn%3Dreg%26siteid%3D203%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1");
	       wd.manage().window().maximize();
	       wd.manage().deleteAllCookies();
	       //1.Through Id----1st priority
//	       wd.findElement(By.id("firstname")).sendKeys("Rakesh"); //By is a class
//	       wd.findElement(By.id("lastname")).sendKeys("Kumar");
//	       wd.findElement(By.id("email")).sendKeys("rakesh.kumarmng@gmail.com");
//	       wd.findElement(By.id("PASSWORD")).sendKeys("R9620562500");
//	       wd.findElement(By.cssSelector("#ppaFormSbtBtn")).click();//Click on sign on use cssSelector
	      //2.Through Name ---3rd priority
//	       wd.findElement(By.name("firstname")).sendKeys("Rakesh");
//	       wd.findElement(By.name("lastname")).sendKeys("Kumar");
//	       wd.findElement(By.name("email")).sendKeys("rakesh.kumarmng@gmail.com");
//	       wd.findElement(By.name("PASSWORD")).sendKeys("R9620562500");
//	       wd.findElement(By.cssSelector("#ppaFormSbtBtn")).click();
	       //3.By Xpath---2nd priority
	       //Absolute Xpath should not be used
	       //Relative Xpath should be used
//	       wd.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Rakesh");
//	       wd.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Kumar");
//	       wd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rakesh.kumarmng@gmail.com");
//	       wd.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).sendKeys("R.9620562500");
	       //4.CSSSelector-----
	      // if id is there then use #(ID)
	      // if class is there then use .(class)
//	       wd.findElement(By.cssSelector("#firstname")).sendKeys("Rakesh");
//	       wd.findElement(By.cssSelector("#lastname")).sendKeys("Kumar");
//	       wd.findElement(By.cssSelector("#email")).sendKeys("rakesh.kumarmng@gmail.com");
//	       wd.findElement(By.className("#PASSWORD")).sendKeys("R.9620562500");
//	       wd.findElement(By.cssSelector("#ppaFormSbtBtn")).click();
	       //5.By Linktest
	       //wd.findElement(By.linkText("www.ebay.in")).click();//Link becouse of satart with <a and should be blue color.
	       //6.By Partial link test
	      // wd.findElement(By.partialLinkText("User")).click();
	       //7.By Class
	       wd.findElement(By.className("ml53")).click();
	       //By Tag
	       //protector are used in java script
	            
	}

}

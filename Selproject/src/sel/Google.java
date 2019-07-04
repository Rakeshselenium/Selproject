package sel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Google {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
   WebDriver wd=new ChromeDriver();
   wd.get("https://www.google.co.in");  
   //Interview Question? How to get title
   String title=wd.getTitle();
   System.out.println("Title is "+title);
   wd.manage().window().maximize();
   wd.manage().deleteAllCookies();
  
//Interview Question? How to validate
   if(title.equals("Google"))
   {
	 System.out.println("Title is correct");  
   }
   else
   {
	   System.out.println("Title is not correct");
   }
   
   // how to know the page source
   //System.out.println(wd.getPageSource());
   System.out.println(wd.getCurrentUrl());
   wd.quit();//close the browser
		}
}

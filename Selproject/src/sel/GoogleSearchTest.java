package sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
			  WebDriver wd=new ChromeDriver();  
			  wd.manage().window().maximize();
			  wd.manage().deleteAllCookies();
			  wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			  wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  wd.get("http://www.google.com");
			  wd.findElement(By.id("lst-ib")).sendKeys("testing");
			  //15. Naveen vdo------https://www.youtube.com/watch?v=6RaDZhfXHI8&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=17 
			  //16.https://www.youtube.com/watch?v=Rjs9qLRP9tM&index=18&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT
			  //https://www.youtube.com/watch?v=oND1ETJEbSc&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=19
			  //https://www.youtube.com/watch?v=3uktjWgKrtI&index=20&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT
			  //https://www.youtube.com/watch?v=Tm1TeqdYrrI&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=21
			  //https://www.youtube.com/watch?v=OtQAMoXYqes&index=22&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT
			  //https://www.youtube.com/watch?v=wpZ0FjJQ8qs&index=23&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT
			  
			  List <WebElement> list=wd.findElement(By.xpath("ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
			 System.out.println("Total number of suggesion are---"+list.size()); 
			 for(int i=0;i<list.size();i++)
			 {
				 System.out.println(list.get(i).getText());
				 if(list.get(i).getText().contains("testing software"))
				 {
					 list.get(i).click();
					 break;
				 }
			 }
	}

}

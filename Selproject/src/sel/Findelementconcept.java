package sel;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementconcept {
	public static void main(String[] args) {
		//How to find how many links are available in particular page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("http://wwww.facebook.com");
		   wd.manage().window().maximize();
		   wd.manage().deleteAllCookies();
		   //get the total count the link page
		   //get the text each link on the page
		   //we use findelements
		  List <WebElement>linkList=wd.findElements(By.tagName("a"));//linkList is a object and it is type of list object and all web elements
		  //Size or linklist
		  System.out.println(linkList.size());
		//Count the input fields
//		   List <WebElement>linkList=wd.findElements(By.tagName("input"));
//		   System.out.println(linkList.size());
//		   List <WebElement>linkList=wd.findElements(By.tagName("Button"));
//		   System.out.println(linkList.size());
		  for(int i=0;i<linkList.size();i++)
		  {
			  String linktest=linkList.get(i).getText();
			  System.out.println(linktest);
			  //if in output you get blank space means that developer develop the blank text;
		  }

	}

}

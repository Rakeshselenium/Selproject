package sel;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class BrokenLinkTest {
	public static void main(String[] args) throws InterruptedException,MalformedURLException,IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("https://www.amazon.com/");
		   wd.manage().window().maximize();
		   wd.manage().deleteAllCookies();
		   Thread.sleep(2000);
		 //Dynamic wait
		   wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//max wait for 40 second for fully loaded if it take above 40 sec then give the error.if it load 2 sec then rest of 38 sec willl be ignore
		   wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//for all the element/global wait after 40 sec it will take another 20 sec if page is not loaded
       //Links -----<a tag start
	  // image------<img-
		   //Step1.-get the list of all links and images (Suppose we have 500 links and images available)
		   List <WebElement> linksList= wd.findElements(By.tagName("a"));
		   linksList.addAll(wd.findElements(By.tagName("img")));
		   System.out.println("size of link and images"+linksList.size());
		   
		   List <WebElement> activeLinks=new ArrayList<WebElement>();//create active links that means href property(only 450 have href property and 50 does not have href property)
		  //Step 2. Iterate linkList exclude all links and images which does not have any href attributes. 
		   for(int i=0;i<linksList.size();i++)
		   {
			   System.out.println(linksList.get(i).getAttribute("href"));
			   if(linksList.get(i).getAttribute("href")!=null &&(!linksList.get(i).getAttribute("href").contains("javascript")));
			   
			   {
				   activeLinks.add(linksList.get(i));
			   }
			   
		   }
		   //Step 3.get the size of active link list
		   System.out.println("size of active link and images"+activeLinks.size());
		   
		  //step 3.Check the href URL ,with httpconnection api
		   
		   for(int j=0;j<activeLinks.size();j++)
		   {
			    HttpURLConnection connection=(HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			    connection.connect();
			   String response=connection.getResponseMessage();
			   connection.disconnect();
			   System.out.println(activeLinks.get(j).getAttribute("href") +"---->"+response);  
			   
		   }
	}

}

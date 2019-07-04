package sel;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EnableDesableElement {
	public static void main(String[] args) {
		//isSelected/Enable/Displayed method
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();   
		   wd.manage().window().maximize();//maximize windows
		   wd.manage().deleteAllCookies();//delete cookies
		   wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   wd.get("https://www.freecrm.com/register/");
		    //1.isDisplayed() method-Alocate for all element
		   boolean bl=wd.findElement(By.id("submitButton")).isDisplayed();//if submit button/or logo is display then return true
		   System.out.println(bl);//return true
		    //isEnabled() method
		   boolean b2=wd.findElement(By.id("submitButton")).isEnabled();
		   System.out.println(b2);
		     //select i agree check box
		   wd.findElement(By.name("agreeTerms")).click();//after click on check box
		   boolean b3=wd.findElement(By.id("submitButton")).isEnabled();
		   System.out.println(b3);//return true
		   // isSelected() method--Applicable for only check box,drop down,radio button
		   boolean b4=wd.findElement(By.name("agreeTerms")).isSelected();
		   System.out.println(b4);//return true
		   //de-select the check box
		   wd.findElement(By.name("agreeTerms")).click();
		   boolean b5=wd.findElement(By.id("submitButton")).isSelected();
		   System.out.println(b5);//false
		  	}
}

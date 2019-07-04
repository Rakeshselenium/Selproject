package sel;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupJavascript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
		   wd.findElement(By.name("proceed")).click();//click on go button
		   Thread.sleep(2000);
		   //down 4 line are very impotent point of interview
           Alert alert=wd.switchTo().alert();//Alert is a class
           System.out.println(alert.getText());//
           String text=alert.getText();
           if(text.equals("Please enter a valid user name"))
           {
        	   System.out.println("Corect message");
           }
           else
           {
        	   System.out.println("Wrong message");
           }
           alert.accept();//Clik on ok button
           //alert.dismiss();//click on Cancel button if Cancel button is available
	}

}

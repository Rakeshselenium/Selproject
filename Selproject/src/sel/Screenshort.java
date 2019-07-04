package sel;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshort {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
		   WebDriver wd=new ChromeDriver();
		   wd.manage().window().maximize();//maxmize windows
		   wd.manage().deleteAllCookies();//delete cookies
		   wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   wd.get("https://www.google.co.in");
		   //Take a screen shot and store as a file
		   File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		   //Copy the screen short and desired location as a file.
		   FileUtils.copyFile(src, new File("C:\\Users\\Rakesh\\workspace\\Rakesh_java\\Selproject\\src\\sel/google.png"));
	}

}

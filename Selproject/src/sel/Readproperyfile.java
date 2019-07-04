package sel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Readproperyfile {
  static WebDriver wd;

	public static void main(String[] args) throws IOException {
		Properties pro=new Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\Rakesh\\workspace\\Rakesh_java\\Selproject\\src\\sel\\config.properties");
		//path of config.properties
		pro.load(fi);
		System.out.println(pro.getProperty("name"));
		System.out.println(pro.getProperty("age"));
		String url=pro.getProperty("URL");
		System.out.println(url);
		String browsername=pro.getProperty("browser");
		System.out.println(browsername);
		//if different-different browser is available then no need to write specific driver.
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\chromedriver.exe/");
			wd=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\geckodriver.exe/");
			wd=new FirefoxDriver();
		}
		else if(browsername.equals("internetexplorer"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\internetexplorerdriver.exe/");
			wd=new InternetExplorerDriver();
		}
		wd.get(url);
		//wd.manage().window().maximize();
       wd.findElement(By.xpath(pro.getProperty("firstname_xpath"))).sendKeys(pro.getProperty("firstname"));
        wd.findElement(By.xpath(pro.getProperty("laststname_xpath"))).sendKeys(pro.getProperty("laststname"));
	}

}

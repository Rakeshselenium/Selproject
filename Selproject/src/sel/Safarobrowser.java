package sel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safarobrowser {

	public static void main(String[] args) {
		WebDriver wd=new SafariDriver();
		//use safari extension for selenium
		//Enable it
		wd.get("http://google.com");
		System.out.println(wd.getTitle());
        wd.quit();
	}

}

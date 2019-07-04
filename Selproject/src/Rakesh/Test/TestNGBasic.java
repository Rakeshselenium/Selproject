package Rakesh.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {
	//Per condition annotation--start with @Before
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for chrome ");
	}
	@BeforeTest
	public void lounchBrowser() {
		System.out.println("lounch Chrome Browser");
	}
	@BeforeClass
	public void login() {
		System.out.println("login to app");
	}
	
	//Only one time execute BeforeSuit,BeforeTest,BeforeClass
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
		
		/*
		 * @Before method
		 * @test 1 method 
		 * @after method
		 * 
		 * @Before method
		 * @test 2 method 
		 * @after method
		 * 
		 * @Before method
		 * @test 3 method 
		 * @after method
		 */
	}
//test case-Start with @Test
	@Test
	public void googleTitleText()
	{
		System.out.println("Google Title Text");
	}
	@Test
	public void searchTest()
	{
		System.out.println("Search test");
	}
	@Test
	public void anotherTest()
	{
		System.out.println("another test");
	}
	//Post Condition--Start with @After
	@AfterMethod
	public void logOut()
	{
		System.out.println("logout to app");
	}
	@AfterTest
	public void deleteAllCookies()
	{
	System.out.println("delete all cookies ");	
	}
	@AfterClass
	public void classBrowser()
	{
		System.out.println("close browser");
	}
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("generateTestReport");
	}
}

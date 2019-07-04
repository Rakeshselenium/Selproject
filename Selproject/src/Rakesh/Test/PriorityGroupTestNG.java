package Rakesh.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PriorityGroupTestNG {
	
//	@Test(priority=1)
//	public void Test12()
//		{
//			System.out.println("test1");
//		}
//	@Test(priority=2)
//	public void Test123()
//		{
//			System.out.println("test2");
//		}
//
//	//Also we can define priority with group
//	@Test(priority=3,groups="title")
//	public void Test1()
//		{
//			System.out.println("test3");
//		}
//	@Test(priority=4,groups="logo")
//	public void Test1234()
//		{
//			System.out.println("test4");
//		}
//		
//	@Test(priority=2,groups="logo")//for same group
//	public void Test12345()
//		{
//			System.out.println("test3");
//	      }
	//Also we can define dependence with @test
	//Eg.
	@Test(priority=3,groups="title")
	public void Test1()
		{
			System.out.println("test1");
		}

	@Test
	public void Test2()
		{
			System.out.println("test2");
		}
	//for dependent on test2	
	@Test(dependsOnMethods = { "Test2","Test1" })
	public void Test3()
		{
			System.out.println("test3");
	      }
}


//		//Post Condition--Start with @After
//		@AfterMethod
//		public void logOut()
//		{
//			System.out.println("logout to app");
//		}
//		@AfterTest
//		public void deleteAllCookies()
//		{
//		System.out.println("delete all cookies ");	
//		}
//		@AfterClass
//		public void classBrowser()
//		{
//			System.out.println("close browser");
//		}
//		@AfterSuite
//		public void generateTestReport()
//		{
//			System.out.println("generateTestReport");
//		}
//	}



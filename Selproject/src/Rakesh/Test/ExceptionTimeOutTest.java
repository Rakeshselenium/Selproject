package Rakesh.Test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	//Without try catch block handle the exception
	@Test(expectedExceptions=NumberFormatException.class)
	
		public void Test1()
		{
			String s="100A";
			Integer.parseInt(s);
			
		}
	}


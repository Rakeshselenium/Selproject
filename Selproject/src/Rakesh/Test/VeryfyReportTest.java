package Rakesh.Test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReportTestNGAnotherWay.class)
public class VeryfyReportTest {
	@Test
	public void testSimulation0()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void testSimulation00()
	{
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="testSimulation00")
	public void testSimulation000()
	{
		
	}
}

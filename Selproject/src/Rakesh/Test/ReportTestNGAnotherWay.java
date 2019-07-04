package Rakesh.Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ReportTestNGAnotherWay implements ITestListener 
    {
	@Override
	public void onStart(ITestContext arg0)
	{
	System.out.println("Begin Test:"+arg0.getName());	
	}
	@Override
	public void onTestStart(ITestResult arg0)
	{
		System.out.println("Starting Test:"+arg0.getName());
	}
	
    @Override
    public void onTestSuccess(ITestResult arg0)
    {
    System.out.println("Test Passed:"+arg0.getName());	
    }
    @Override
    public void onTestFailure(ITestResult arg0)
    {
    	System.out.println("Test Failed:"+arg0.getName());
    }
    @Override
    public void onTestSkipped(ITestResult arg0)
    {
    	System.out.println("Test Skipped:"+arg0.getName());
    }
    @Override
    public void onFinish(ITestContext arg0)
    {
    	System.out.println("End Test:"+arg0.getName());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
    {
    //to Do Auto-Generate method Stub
    }
    }


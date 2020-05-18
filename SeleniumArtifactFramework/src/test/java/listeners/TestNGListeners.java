package listeners;

import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestNGListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("******* Test Started ******    "+result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(" ****** Test Success ******   "+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println(" ****** Test Failure ******   "+result.getName());
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(" ****** Test Skipped ******   "+result.getName());
	}
}

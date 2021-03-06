package Test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {

	@Test
	public void test1()
	{
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("I am inside Test 2");
	}
	
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void test3()
	{
		System.out.println("I am inside Test 3");
		Assert.assertTrue(0>1);
	}
}

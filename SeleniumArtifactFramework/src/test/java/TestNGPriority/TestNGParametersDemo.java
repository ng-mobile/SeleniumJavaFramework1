package TestNGPriority;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {

	@Test
	@Parameters("myname")
	public void test(@Optional("Automation") String Name)
	{
		System.out.println("Name is  : "+ Name);
	}
}

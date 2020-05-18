package TestNGPriority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowserDemo {

	static WebDriver driver = null;
	@Parameters("browsername")
	@BeforeTest
	public void setup(String browsername)
	
	{

	System.out.println("BrowserName    :   " +browsername);
	if (browsername.equalsIgnoreCase("chrome"))
		WebDriverManager.chromedriver().setup();
	else if (browsername.equalsIgnoreCase("firefox"))
		WebDriverManager.firefoxdriver().setup();
	else if (browsername.equalsIgnoreCase("ie"))
		WebDriverManager.iedriver().setup();
	}
	
	@Test
	private void TestExecute() {
		// TODO Auto-generated method stub
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Execute Automation");
		driver.findElement(By.name("btnK")).click();
	}
	
}

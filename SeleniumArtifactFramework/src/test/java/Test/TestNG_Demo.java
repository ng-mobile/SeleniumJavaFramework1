package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.GoogleSearchPageObjects;

public class TestNG_Demo {
	
	static WebDriver driver = null;
	public static String browsername = null;
	
	@BeforeTest
	public void SetupTest()
	{
		PropertiesFile.getproperties();
		if (browsername.equalsIgnoreCase("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}
	
	@Test
	public void googleSearchTest() throws InterruptedException
	{
		GoogleSearchPageObjects searchpageobj = new GoogleSearchPageObjects(driver);
		driver.get("https://www.google.com");
		searchpageobj.SetTextinSearchBox("Ragahu Pal");
		searchpageobj.ClickButtononSearch();
		Thread.sleep(3000);

	}
	
	@AfterTest
	public void tearDowntest()
	{
		driver.close();
		driver.quit();
		PropertiesFile.SetProperties();
	}
	
}

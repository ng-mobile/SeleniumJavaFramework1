package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.GoogleSearchPageObjects;

public class TestNG_Demo2 {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public void SetupTest()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	@Test
	public void googleSearchTest2() throws InterruptedException
	{
		GoogleSearchPageObjects searchpageobj = new GoogleSearchPageObjects(driver);
		driver.get("https://www.google.com");
		searchpageobj.SetTextinSearchBox("Ragahu Pal");
		searchpageobj.ClickButtononSearch();
		Thread.sleep(3000);

	}
	
	@Test
	public void googleSearchTest3() throws InterruptedException
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
	}
	
}

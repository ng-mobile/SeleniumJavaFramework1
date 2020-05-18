package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendTestReportwithTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	private static WebDriver driver = null;
	
	@BeforeSuite
	public void setup()
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void test1() throws Exception
	{
		test = extent.createTest("MyFirstTest", "Sample description");
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        test.info("This step shows usage of info(details)");
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
		
        
		GoogleSearchPageObjects searchpageobj = new GoogleSearchPageObjects(driver);
		driver.get("https://www.google.com");
		test.pass("Entered Google.com");
		searchpageobj.SetTextinSearchBox("Ragahu Pal");
		test.pass("Entered Text");
		searchpageobj.ClickButtononSearch();
		test.pass("Clicked on the button");
		Thread.sleep(3000);
        
	}
	
	@AfterSuite
	public void tearDown()
	{
	       // calling flush writes everything to the log file
		driver.close();
		test.pass("Closed the Browser");
		driver.quit();
		test.pass("Quit the Browser");
		extent.flush();
		
	}
}

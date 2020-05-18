package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReportsBasicDemo {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "This is test to validate Google Search functionality");
       
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		test1.log(Status.INFO, "Starting Test Case");
		driver.get("https://www.google.com");
		test1.pass("Navigated to Google.com");
		
		//Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Execute Automation");
		test1.pass(("Entered text in Searchbox"));
		
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		test1.pass("Pressed the Enter Key");
		
		driver.close();
		driver.quit();
		test1.pass("Closed the Browser");
		test1.info("Test completed");
		
		extent.flush();
		
		
	}

}

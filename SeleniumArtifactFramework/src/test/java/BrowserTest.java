import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();
		
		//String projectpath = System.getProperty("user.dir");
		//System.out.println("Project Path:" +projectpath);
		//System.setProperty("webdriver.gecko.driver", projectpath+ "/Drivers/geckodriver/geckodriver.exe");
		
		
		
		WebDriver driver_firefox = new FirefoxDriver();
		driver_firefox.get("https://www.google.com/");	
		WebElement element = driver_firefox.findElement(By.xpath("//input[@name='q']"));
		driver_firefox.manage().window().maximize();
		element.sendKeys("Execute Automation");
		
		List<WebElement> ListofElements = driver_firefox.findElements(By.xpath("//input"));
		System.out.println("Elements in the List :" + ListofElements.size());
		//for (int i =0; i<ListofElements.size(); i++)
	//	{
	//		System.out.println ("Element of :" + i +  ListofElements.get(i));
	//	}
		
		
		Thread.sleep(3000);
		driver_firefox.close();
		//System.setProperty("webdriver.chrome.driver",  projectpath+ "/Drivers/chromedriver/chromedriver.exe");
		
		WebDriver driver_chrome = new ChromeDriver();
		driver_chrome.get("https://www.selenium.dev/");
		driver_chrome.manage().window().maximize();
		Thread.sleep(3000);
		driver_chrome.close();
		
		//System.setProperty("webdriver.ie.driver", projectpath+ "/Drivers/InternetExplorer/IEDriverServer.exe");
		WebDriver driver_explorer = new InternetExplorerDriver();
		driver_explorer.get("https://www.selenium.dev");
		driver_explorer.manage().window().maximize();
		Thread.sleep(3000);
		driver_explorer.close();
		
	}

}

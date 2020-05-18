package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	public static void main(String[] args) throws InterruptedException {
		googleSearchTest();
	}
	
	public static void googleSearchTest() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		GoogleSearchPageObjects searchpageobj = new GoogleSearchPageObjects(driver);
		driver.get("https://www.google.com");
		searchpageobj.SetTextinSearchBox("Ragahu Pal");
		searchpageobj.ClickButtononSearch();
		Thread.sleep(3000);
		driver.close();
		
	}
	
}

package Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.GoogleSearchPage;

public class Test1_GoogleSearch {
	
	public static void googlesearch()
	{
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driverfirefox = new FirefoxDriver();
		driverfirefox.manage().deleteAllCookies();
		driverfirefox.manage().window().maximize();
		driverfirefox.get("http://www.google.com");
		//WebElement element = driverfirefox.findElement(By.xpath("//input[@name='q']"));
		
		GoogleSearchPage.TextBox_Search(driverfirefox).sendKeys("Execute Automation Step by Step");
		GoogleSearchPage.Button_Search(driverfirefox).sendKeys(Keys.RETURN);
		driverfirefox.close();
		
		//element.sendKeys("Execute Automation Step by Step");
		//driverfirefox.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		//driverfirefox.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//input[@name='btnK' and @type='submit']
		System.out.println("Test Completed Successfully 123");
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		googlesearch();
	}

}

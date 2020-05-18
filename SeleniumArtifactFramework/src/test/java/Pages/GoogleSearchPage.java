package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage{
	
	private static WebElement element = null;

	public static WebElement TextBox_Search(WebDriver driverfirefox)
	{
		element = driverfirefox.findElement(By.name("q"));
		return element;
	}
	public static WebElement Button_Search(WebDriver driverfirefox)
	{
		element = driverfirefox.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		return element;
	}
}

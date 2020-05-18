import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {
	
	public static void main(String[] args)
	{
		
		WebDriverManager.iedriver().setup();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		caps.setBrowserName("Chrome");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
	}

}

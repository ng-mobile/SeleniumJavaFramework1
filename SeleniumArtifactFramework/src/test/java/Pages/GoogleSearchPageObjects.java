package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

	WebDriver driver = null;
	By textbox_search = By.name("q");
	By button_search = By.xpath(("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
	
	public GoogleSearchPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	public void SetTextinSearchBox(String Text)
	{
		driver.findElement(textbox_search).sendKeys(Text);
	}
	public void ClickButtononSearch()
	{
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}

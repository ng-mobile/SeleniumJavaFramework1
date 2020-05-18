package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {

	//public static void main(String[] args) {
	//	testData("C:/Learning/Eclipse/SeleniumArtifactFramework/excel/data.xlsx", "Sheet1");
	//}
	
	@Test(dataProvider="test1data")
	public void test1(String username, String Password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println(username+ "   |  " +Password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);

	}
	
	
	@DataProvider (name="test1data")
	public static Object[][] getData()
	{
		Object data[] [] = testData("C:/Learning/Eclipse/SeleniumArtifactFramework/excel/data.xlsx", "Sheet1");
		return data;
		
	}
	
	public static Object[][] testData(String excelpath, String sheetname)
	{
		ExcelUtils excel = new ExcelUtils(excelpath, sheetname);
		int rowCount = excel.RowRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		
		for (int i=1; i<rowCount; i++)
		{
			for (int j=0; j<colCount; j++)
			{
				String CellData = excel.getCellDataString(i, j);
				System.out.print(CellData+ "    |   ");
				data[i-1][j]=CellData;		
			}
			System.out.println();
		}
		return data;
	}
}

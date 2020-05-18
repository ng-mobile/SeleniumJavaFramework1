package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String Excelpath, String SheetName)
	{
	try
	{
		workbook = new XSSFWorkbook(Excelpath);
		sheet = workbook.getSheet(SheetName);
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	}
	
	public static void main(String[] args) {
	//	RowRowCount();
	//	getCellDataString(0,0);
//		getCellDataNumber(1,1);
	}

	public static int RowRowCount()
	{
		int RowCount = 0;
		try
		{
			
			RowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of Rows   :" +  RowCount);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return RowCount;
	}

	
	public static int getColCount()
	{
		int colCount = 0;
		try
		{
			
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of Columns   :" +  colCount);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;
	}

	
	public static String getCellDataString(int rowNumer, int cellNumebr)
	{
		String CellDataString ="";
		try
		{
		
			CellDataString = sheet.getRow(rowNumer).getCell(cellNumebr).getStringCellValue();
		//	System.out.println(CellDataString);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return CellDataString;
	}
	
	public static double getCellDataNumber(int rowNumer, int cellNumber)
	{
		double CellDataNumber = 0;
		try
		{
	
			CellDataNumber = sheet.getRow(rowNumer).getCell(cellNumber).getNumericCellValue();
	//		System.out.println("Cell Value  Number :" +  CellDataNumber);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return CellDataNumber;
	}
}

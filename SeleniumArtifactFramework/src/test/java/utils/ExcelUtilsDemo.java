package utils;

public class ExcelUtilsDemo {
	
	public static void main(String[] args) 
	{
		String projectpatch = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectpatch+"/excel/data.xlsx", "Sheet1");
		excel.RowRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
	}

}

package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readalldatafromexcel {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFCell data;
	@Test
	public void setup() throws Exception {
	File src = new File("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\TestData.xlsx.xlsx");
	FileInputStream fis = new FileInputStream(src);

			
	 wb= new XSSFWorkbook(fis);
	sheet = wb.getSheetAt(0);
	int totalrows  = sheet.getLastRowNum();
	System.out.println(totalrows);
	for(int i = 0; i<=totalrows;i++) {
		String val= sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(val);
		String val1= sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println(val1    +val);
	}
	 
	} 

}

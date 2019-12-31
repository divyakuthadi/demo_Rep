package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ddt_read2 {
	public static void main(String[] args) throws Exception {
	File Src = new File("C:\\Users\\My\\eclipse-workspace\\Selenium\\TestDataRead\\TestData.xlsx.xlsx");
	FileInputStream fis = new FileInputStream(Src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
	int value= sheet.getLastRowNum();
	for(int totalrows=0; totalrows<value; totalrows++) {
		String data = sheet.getRow(totalrows).getCell(0).getStringCellValue();
		String Colunms = sheet.getRow(totalrows).getCell(1).getStringCellValue(); 
		{
			
		}
		System.out.println("The data read from excel is: " +data+ "   " +Colunms);
		wb.close();
}
}}
package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelconfig {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFCell data;
	@Test
	public void setup() throws Exception {
	File src = new File("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\TestData.xlsx.xlsx");
	FileInputStream fis = new FileInputStream(src);
     wb= new XSSFWorkbook(fis);
	sheet = wb.getSheetAt(0);
	
	}
	public static String readexcel(String sheetnum, int rownum, int colnum) {
		String value=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		return value;
		
	}
	

}

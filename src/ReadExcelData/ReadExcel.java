package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFCell data;
	@Test
	public void setup() throws Exception {
	File src = new File("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\TestData.xlsx.xlsx");
	FileInputStream fis = new FileInputStream(src);

			
	 wb= new XSSFWorkbook(fis);
	sheet = wb.getSheetAt(0);
	 String sellvalue = sheet.getRow(0).getCell(0).getStringCellValue();
	 System.out.println(sellvalue);
	 String sellvalue1 = sheet.getRow(0).getCell(1).getStringCellValue();
	 System.out.println(sellvalue   +sellvalue1  );

}}

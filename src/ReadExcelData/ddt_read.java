package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ddt_read{
public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	File Src = new File("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\TestData.xlsx.xlsx");
	FileInputStream fis = new FileInputStream(Src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
	
	int result = sheet.getLastRowNum();
	System.out.println(result);
	
	
	}}


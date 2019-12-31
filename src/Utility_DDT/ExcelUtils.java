package Utility_DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static void main(String[] args) throws IOException {
	File Src = new File("C:\\Users\\My\\eclipse-workspace\\Selenium\\TestDataRead\\TestData.xlsx.xlsx");
	FileInputStream fis = new FileInputStream(Src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
	
		
		

	}


}
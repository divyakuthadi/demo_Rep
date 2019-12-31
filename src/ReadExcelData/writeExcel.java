package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

	public static void main(String[] args) throws IOException {
		  
		
		
		File Src = new File("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\TestData.xlsx.xlsx");
		FileInputStream fis = new FileInputStream(Src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		sheet.getRow(1).createCell(2).setCellValue("pass");
		FileOutputStream fos = new FileOutputStream(Src);
		
		wb.write(fos);
		wb.close();

	}

}

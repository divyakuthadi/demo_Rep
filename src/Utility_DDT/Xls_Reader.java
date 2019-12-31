package Utility_DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {//

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File Src = new File("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\TestData.xlsx.xlsx");
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
		}}
	}


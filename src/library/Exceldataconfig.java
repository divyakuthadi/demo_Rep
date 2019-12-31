package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Exceldataconfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;

		public Exceldataconfig(String Excelpath) throws IOException {
			File Src = new File(Excelpath);
			FileInputStream fis = new FileInputStream(Src);
		
		    wb = new XSSFWorkbook(fis);
		   sheet =  wb.getSheetAt(0);
		   
			

	}
	// To read the data from excel we are parameterizing it.
		public String getdata(String sheetname, int row, int col) {
		
			String data = sheet.getRow(row).getCell(col).getStringCellValue();
			return data;
			
		}
		public int getrowcount(int sheetname) {
			 int sheet = wb.getSheetAt(sheetname).getLastRowNum();
			return sheet;
		}
	/*public void create (String sheetname, String colname) {
			int index = wb.getSheetIndex(sheetname);
		sheet.getRow(index).createCell(2).setCellValue("pass");
	}
	
		public boolean adddata(String sheetname, int row, String string,String value) {
			int index = wb.getSheetIndex(sheetname);
			Row nrow = sheet.createRow(1);
			 org.apache.poi.ss.usermodel.Cell cell = nrow.createCell(1);
			 cell.setCellValue("pass");
			return false;
			
		}*/
			
		}
		





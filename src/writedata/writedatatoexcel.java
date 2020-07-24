package writedata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writedatatoexcel {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	
	@Test
	public void Writeexcel() throws Exception {
	File file = new File("C:\\Users\\My\\Desktop\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(file);
	
	
	wb = new XSSFWorkbook(fis);
	sheet =wb.getSheetAt(0);
	sheet.getRow(0).createCell(2).setCellValue("example");
	FileOutputStream fout = new FileOutputStream(file);
	wb.write(fout);
	wb.close();
	

	}}

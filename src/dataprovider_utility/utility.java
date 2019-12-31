package dataprovider_utility;

import java.io.IOException;
import java.util.ArrayList;

import library.Exceldataconfig;

public class utility {
	static Exceldataconfig excel;


public static ArrayList<Object[]> getdatafromexcel() throws Exception {
	ArrayList<Object[]> obj = new ArrayList<Object[]>();
	
	excel = new Exceldataconfig("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\halfebay_data.xlsx");
	for(int rownum = 2; rownum<=excel.getrowcount(0); rownum++) {
		String UserID = excel.getdata("regdata", rownum, 0);
		String pwd = excel.getdata("regdata", rownum, 1);
		Object data[] = {UserID, pwd};
		obj.add(data);
	}
	
	return obj;
		
	}
	
}

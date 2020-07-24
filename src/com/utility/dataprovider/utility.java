package com.utility.dataprovider;

import java.util.ArrayList;

import com.excel.utility.utility_DDT;

public class utility {
	static utility_DDT utility;
	public static ArrayList<Object[]>getdatafromexcel(){
		ArrayList<Object[]>testdata = new ArrayList<Object[]>();
		 utility = new utility_DDT("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\DDT.xlsx");
		for(int rownum =1; rownum<=utility.getRowCount("RegTestData");rownum++) {
			String Email = utility.getCellData("RegTestData", "Email", rownum);
			String password = utility.getCellData("RegTestData", "password", rownum);
			Object obj[]= {Email, password};
			testdata.add(obj);
			
		}
		return testdata;
		
	}
	

}

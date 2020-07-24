package dataproviderutility;

import java.util.ArrayList;

import datadriventesting1.xlsreader;

public class gettestdata {
	static xlsreader readdata;
	public static ArrayList<Object[]>getexceldata() {
		ArrayList<Object[]>data=new ArrayList<Object[]>();
		readdata= new xlsreader("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\dataprovidertestng.xlsx");
		for(int rownum=2;rownum<=readdata.getRowCount("sheet1");rownum++) {
			String firstname=readdata.getCellData("sheet1", "firstname", rownum);
			String lastname=readdata.getCellData("sheet1","lastname", rownum);
			Object[] ob= {"firstname","lastname"};
			data.add(ob);
		}
		return data;
		
		
		
	}

}

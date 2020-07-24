package selenium;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class currentdate {

	public static void main(String[] args) {
	DateFormat format= new SimpleDateFormat("yyyymmhhss");
	Date date= new Date();
	String currentDate=format.format(date);
	System.out.println(date);
	
	

	}

}

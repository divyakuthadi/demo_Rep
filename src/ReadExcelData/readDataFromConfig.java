package ReadExcelData;

import java.io.IOException;

import org.testng.annotations.Test;

import library.Exceldataconfig;

public class readDataFromConfig {
	@Test
	public void callingdata() throws Exception {
	Exceldataconfig config = new Exceldataconfig("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\TestData.xlsx.xlsx");
	System.out.println(config.getdata("sample", 0, 0));
	
	

}
}
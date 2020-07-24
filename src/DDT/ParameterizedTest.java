package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.utility_DDT;

public class ParameterizedTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	   driver.get("https://www.facebook.com/");
	   
	utility_DDT utility = new utility_DDT("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\DDT.xlsx");
	
	int rowcount=utility.getRowCount("RegTestData");
	utility.addColumn("RegTestData", "status");
	for(int rownum =1;rownum<=rowcount;rownum++) {
		String Email=utility.getCellData("RegTestData", "Email", rownum);
		System.out.println(Email);
		
		String password=utility.getCellData("RegTestData", "password", rownum);
		System.out.println(password);
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();	
	 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(Email);
	 
	 
	 driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
	 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
	 
	 utility.setCellData("RegTestData", "status", rownum, "pass");
		
		
	}

}
}
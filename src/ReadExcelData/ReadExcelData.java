package ReadExcelData;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.Exceldataconfig;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
//get test data from excel	
Exceldataconfig excel = new Exceldataconfig("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\TestData.xlsx.xlsx");

String Userid = excel.getdata("regdata", 1, 0);
System.out.println(Userid);

String pwd = excel.getdata("regdata", 1, 1);
System.out.println(pwd);

System.out.println("the userid and pwd is: " +Userid+  "  "  +pwd);

//webdrivercode
System.setProperty("webdriver.gecko.driver","C:\\Users\\My\\Downloads\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();

driver.get("https://www.facebook.com/");
Thread.sleep(5000);
driver.findElement(By.id("email")).sendKeys(Userid);
driver.findElement(By.id("pass")).sendKeys(pwd);
System.out.println("login credentials entered");
String title = driver.getTitle();
System.out.println( title);
driver.quit();




















/*int totalrows = excel.getrowcount(0);
for(int RowNum = 2; RowNum<=totalrows; RowNum++) {
	String First = excel.getdata(0, RowNum, UserID);
	System.out.println(First);
	
	/*System.setProperty("webdriver.gecko.driver","C:\\Users\\My\\Downloads\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();

	driver.get("https://www.ebay.com/");*/
	
	
	}
}


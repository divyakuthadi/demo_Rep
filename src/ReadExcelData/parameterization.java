package ReadExcelData;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.Exceldataconfig;

public class parameterization {

	public static void main(String[] args) 
			throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\My\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		
		//getting connection with excel
		Exceldataconfig excel = new Exceldataconfig("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\TestData.xlsx.xlsx");
		int totalrows = excel.getrowcount(0);
		//prameterization//
		for(int rownum = 1; rownum<=totalrows; rownum++) {
			System.out.println("**********************");
			String userid = excel.getdata("regdata", rownum, 0);
			System.out.println(userid);
			
			String pwd = excel.getdata("regdata", rownum, 1);
			System.out.println(pwd);
			
			
			Thread.sleep(5000);
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(userid);
			
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(pwd);
			
			//excel.adddata("regdata", rownum, "2", "pass");
			System.out.println("login credentials entered");
			String title = driver.getTitle();
			System.out.println( title);

		}
		
		
	}

}

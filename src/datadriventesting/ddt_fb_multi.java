package datadriventesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import datadriventesting1.xlsreader;

public class ddt_fb_multi {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	xlsreader reader1 = new xlsreader("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\datadriventesting_multi.xlsx");
	int rowcount=reader1.getRowCount("sheet1");
	reader1.addColumn("sheet1", "status");
	for(int i=2;i<=rowcount;i++) {
		String firstname=reader1.getCellData("sheet1", "firstname", i);
		System.out.println(firstname);
		String lastname=reader1.getCellData("sheet1", "lastname", i);
		System.out.println(lastname);
	

		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("divya");
		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kuthadi");
		reader1.setCellData("sheet1", "status", i, "pass");
		
		
}
	}}


package datadriventesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import datadriventesting1.xlsreader;

public class datadriventestingsample {
	
	public static void main(String[] args) {
		
		xlsreader reader = new xlsreader("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\datadriventesting.xlsx");
		String firstname=reader.getCellData("sheet1", "firstname", 2);
		System.out.println(firstname);
		
		String lastname=reader.getCellData("sheet1", "lastname", 2);
		System.out.println(lastname);
		
		String password=reader.getCellData("sheet1", "password", 2);
		System.out.println(password);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='_regpasswd__']")).sendKeys(password);



	}
}
		
		

	



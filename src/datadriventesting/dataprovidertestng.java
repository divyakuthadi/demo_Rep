package datadriventesting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataproviderutility.gettestdata;

public class dataprovidertestng {
	WebDriver driver;
	@BeforeMethod
public void launch() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	}
	@DataProvider
	public Iterator<Object[]> getdata() {
		ArrayList<Object[]>test=gettestdata.getexceldata();
		return test.iterator();
	}
	@Test(dataProvider="getdata")
	public void credentials(String firstname, String lastname) {
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
	driver.findElement(By.xpath("//input[@name='lastname']")).clear();
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
	}


}

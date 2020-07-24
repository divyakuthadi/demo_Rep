package DDT_Dataprovider;

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

import com.utility.dataprovider.utility;

public class dataprovider {
	 WebDriver driver;
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		  driver.get("https://www.facebook.com/");
	 
	}
	
	@DataProvider
	public Iterator<Object[]> getdata() {
		ArrayList<Object[]>val=  utility.getdatafromexcel();
		return val.iterator();
	}
	
	@Test(dataProvider="getdata")
	public void facebooklogin(String Email, String password) {

		 
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(Email);
		 
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		 
		
	}
	
	/*@AfterMethod
	public void teardown() {
		driver.quit();
	}*/

}

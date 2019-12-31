package TestNG_dataprovide;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider_utility.utility;

public class Halfebay_testdata {
WebDriver driver;


@BeforeMethod
public void setup() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\My\\Downloads\\geckodriver.exe.");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@DataProvider
public  Iterator <Object[]>getdata() throws Exception {
	ArrayList<Object[]> testdata = utility.getdatafromexcel();
	return testdata.iterator();
	
}


@Test
public void launch() {
	driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
	String Title = driver.getTitle();
	System.out.println(Title);
}

@Test(dataProvider="getdata")
public void halfebay_login(String UserID, String Pwd) {
	
	
	
	driver.findElement(By.xpath("//*[@id=\"userid\"]")).clear();
	driver.findElement(By.id("//*[@id=\"userid\"]")).sendKeys(UserID);
	
	driver.findElement(By.name("pass")).clear();
	driver.findElement(By.name("pass")).sendKeys(Pwd);
	System.out.println("browser logged in successfully");
	
}



@AfterMethod
public void quitbrowser() {
	driver.quit();
	
}

}
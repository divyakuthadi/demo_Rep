package webtables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webtable1 {
	@Test
	public void launch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	String beforeXpath="//*[@id='customers']/table/tbody/tr[";
	String AfterXpath="]/td[1]";
	for(int i =2;i<=10;i++) {
	
	String newXpath=driver.findElement(By.xpath(beforeXpath+i+AfterXpath)).getText();
	System.out.println("the values of table is:" +newXpath);
	}
}
}
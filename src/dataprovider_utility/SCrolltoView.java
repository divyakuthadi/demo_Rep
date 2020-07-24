package dataprovider_utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SCrolltoView {
	WebDriver driver;
	@Test
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
	
			WebElement element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
			
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		exe.executeScript("arguments[0].scrollIntoView(true);",element);
	}
		
		@Test
		public void teardown() {
			driver.quit();
		}
		

}

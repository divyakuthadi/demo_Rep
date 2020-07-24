package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollUpAndDown {
	WebDriver driver;
	
@BeforeMethod
public void browserlaunch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://demo.guru99.com/test/guru99home/");
}
	
	@Test
	public void javasce() {
	JavascriptExecutor exe = (JavascriptExecutor)driver;
	exe.executeScript("scroll(0,500)");
	
}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}

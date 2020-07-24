package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HighLightElement {
	WebDriver driver;
	
	@Test
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("divya");
	
	
		//public static void highlight(WebElement ele, WebDriver driver) {	
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		
	}
		
		@Test
		public void teardown() {
			driver.quit();
		}
		
	}



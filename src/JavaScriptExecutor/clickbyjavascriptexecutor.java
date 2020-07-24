package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class clickbyjavascriptexecutor {
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
		ele.click();
		//WebElement button = driver.findElement(By.name("btnK "));
		//button.click();
		click(driver,ele);
		
		RefreshBrowser(driver);
		System.out.println(GetTitle(driver));
		System.out.println(pagesource(driver));
		scroll( driver);

}
	public static void click(WebDriver driver, WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
		
		public static void RefreshBrowser(WebDriver driver) {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			
			js.executeScript("history.go(0)");
			
		}
		
		public static String GetTitle(WebDriver driver) {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			String title=js.executeScript("return document.title;").toString();
			return title;
			
			
			
		}
		
		public static String pagesource(WebDriver driver) {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			String souce=js.executeScript("return document.documentElement.innerText;").toString();
			return souce;
			
			
			
		}
		public static void scroll(WebDriver driver) {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("windows.scrollTo(0,document.body.scrollHeight)");
			
			
			
			
		}
		
		


		
	

		
	}		


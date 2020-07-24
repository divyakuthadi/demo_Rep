package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascriptexecutor {
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
generatealert(driver, "there is an issue");	

}

public static void generatealert(WebDriver driver, String message) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("alert('"+message+"')");
}
	
}

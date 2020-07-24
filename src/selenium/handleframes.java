package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handleframes {
WebDriver driver;
	
	@Test
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://register.freecrm.com/register/");
		driver.switchTo().frame("Sign in for the best experience");
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();

}
}
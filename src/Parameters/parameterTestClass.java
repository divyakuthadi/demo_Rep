package Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTestClass {
WebDriver driver;
@Test
@Parameters({"url", "emailid"})
public void launch(String url, String emailid) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	driver.findElement(By.xpath("//input[@id='email']")).clear();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailid);
	
	driver.findElement(By.xpath("//input[type='submit']")).click();
	
}

}

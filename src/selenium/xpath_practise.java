package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpath_practise {
WebDriver driver;
@Test
public void setup() throws Exception {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	   driver.get("https://www.facebook.com/");
	 /* String Title = driver.getTitle();
	  System.out.println("the title of the page is: " +Title);*/
		Thread.sleep(3000);

	

	//driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("divya");
	//driver.findElement(By.xpath("//input[@id ='lastname']")).sendKeys("kuthadi");
	//driver.findElement(By.xpath("//input[@name='checkbox-default']")).click();

	driver.findElement(By.xpath("//a[contains(text(),'Forgot account')]")).click();
	driver.findElement(By.xpath("//input[@name='did_submit']")).click();
	System.out.println(driver.getTitle());
}

	}



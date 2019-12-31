package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class locators_practice {
WebDriver driver;
	
@Test
public void login() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\My\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
				
		driver.findElement(By.id("u_0_n")).sendKeys("divya");
		driver.findElement(By.name("lastname")).sendKeys("kuthadi");
		driver.findElement(By.name("reg_email__")).sendKeys("dibvygh");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
		Select select = new Select(driver.findElement(By.name("birthday_month")));
		select.selectByIndex(2);
		
		Select day = new Select(driver.findElement(By.id("day")));
		select.selectByValue("24");
		
		Select year = new Select(driver.findElement(By.id("year")));
		select.selectByIndex(2);
		
		
	
		
}
			


}

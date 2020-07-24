package SeleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ISEnabled {
	public static WebDriver driver;
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		Boolean condition=driver.findElement(By.name("lastname")).isSelected();
		System.out.println(condition);
		
		
		Boolean enabled=driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).isEnabled();
		System.out.println(enabled);
		
		Boolean Displayed=driver.findElement(By.xpath("//input[@name='sex']")).isDisplayed();
		System.out.println(Displayed);
		
		
		
		
		
		
		
	}
	

}

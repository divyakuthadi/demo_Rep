package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formsignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='u_0_f']")).sendKeys("divya");
		driver.findElement(By.name("lastname")).sendKeys("jyothi");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567878");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByIndex(2);
		
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByValue("2");
		
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("2016");
		
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit"));
		System.out.println("browser quittes");
		driver.quit();
		
		
		
		
		


	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	  String Title = driver.getTitle();
	  System.out.println("the title of the page is: " +Title);
	 // driver.findElement(By.name("firstname")).sendKeys("divya");
	  Thread.sleep(3000);
	  Select month = new Select(driver.findElement(By.id("month")));
	  month.selectByIndex(0);
	  Select date = new Select(driver.findElement(By.name("birthday_day")));
	  date.selectByIndex(2);
	  Select year = new Select(driver.findElement(By.name("birthday_year")));
	  year.selectByValue("2018");
	  System.out.println("page exexuted:");
	  driver.quit();
	  
	   

		
	}

}

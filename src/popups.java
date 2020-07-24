import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class popups {
	WebDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
	}
	
	@Test
	public void handlePopup() {
		driver.findElement(By.name("cusid")).sendKeys("divya");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		String Message= alert.getText();
		System.out.println("the text from alert is: " +Message);
		alert.dismiss();
		System.out.println("the alert cancelled");
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}


}

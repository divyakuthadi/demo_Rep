package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapDropDown {
	WebDriver driver;
	
	@Test
	public void BrowserSetup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		driver.findElement(By.xpath("//*[@id=\"menu2\"]")).click();
		List<WebElement> dropdownlist=driver.findElements(By.xpath("//*[@id=\"main\"]/div[7]/ul"));
		for(int i = 0; i<dropdownlist.size();i++) {
			WebElement elemen=dropdownlist.get(i);
			String innerhtml=elemen.getAttribute("href");
			System.out.println("the values from dropdwn are " +innerhtml);
			
			
		}
		
		System.out.println("clicked on dropdown");
	}
	

}

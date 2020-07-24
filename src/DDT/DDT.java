package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.utility_DDT;

public class DDT {

	public static void main(String[] args) {
	
		utility_DDT utility = new utility_DDT("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\DDT.xlsx");
		String Email = utility.getCellData("RegTestData", "email", 1);
		System.out.println(Email);
		
		String password = utility.getCellData("RegTestData", "password", 1);
		System.out.println(password);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	   driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("divya");
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("kuthadi");
	driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();//

	
}

	

	

	}



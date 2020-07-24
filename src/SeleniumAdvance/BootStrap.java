package SeleniumAdvance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrap {
	static WebDriver driver;
	@Test
	public void setup() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
	 Thread.sleep(3000);
	List<WebElement>list=  driver.findElements(By.xpath("//button[@id='menu1']"));
	for(WebElement ele:list) {
		String values=ele.getAttribute("innerHTML");
		System.out.println("the values are:" +values);
		if(values.contains("JavaScript")) {
			ele.click();
			break;
			
		}
		
	}
	 
	 
}

}


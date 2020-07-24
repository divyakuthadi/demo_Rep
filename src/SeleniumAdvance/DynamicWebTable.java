package SeleniumAdvance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicWebTable {

	public static WebDriver driver;
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		/*List<WebElement>ele=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		int length=ele.size();
		System.out.println(length);
		//String Text = ele.get(length).getText();//*/
		
	
		String Beforexpath ="//*[@id=\"leftcontainer\"]/table/tbody/tr[";
	    String AfterXpath="]/td[1]";
	    
	    for(int i=1; i<=26; i++) {
	    
	    String name= driver.findElement(By.xpath(Beforexpath+i+AfterXpath)).getText();
	    System.out.println(name);
				if(!name.contains("NCC")){
					driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[1]")).click();
					
					
				}
						
				
	}}}

//*[@id="leftcontainer"]/table/tbody/tr[2]/td[1]
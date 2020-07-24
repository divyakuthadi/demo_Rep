package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class calender {
WebDriver driver;
	
	@BeforeMethod
	public void browserlaunch() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);
		
	}
		
		@Test
		public void datepicker (){
			driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
			List<WebElement> days=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]"));
			int values=days.size();
			System.out.println(values);
			for(int rownum =1;rownum<=values;rownum++) {
				String count =days.get(rownum).getText();
				if(count.equals("10")) {
					days.get(rownum).click();
					System.out.println("clicked on number");
					break;
				}
					System.out.println("clicked on number");
				}
				}
				
			}


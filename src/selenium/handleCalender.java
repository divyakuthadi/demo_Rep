package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class handleCalender {
	WebDriver driver;
	
	@BeforeMethod
	public void browserlaunch() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		
	}
		
		@Test
		public void datepicker (){
			String date= "22-january-2020";
			String datevalue[]=date.split("-");
			String day =datevalue[0];
			String month=datevalue[1];
			String year=datevalue[2];
			driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
			String beforexpath="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[";
			String Afterxpath="]/td[";
		final int weekdays=7;
		boolean flag = false;
		for(int rownum=3;rownum<=7;rownum++) {
			for(int colnum=1;colnum<=7;colnum++) {
				String dayvalue=driver.findElement(By.xpath(beforexpath+rownum+Afterxpath+colnum+"]")).getText();
				System.out.println(dayvalue);
				if( dayvalue.equals(day)) {
					driver.findElement(By.xpath(beforexpath+rownum+Afterxpath+colnum+"]")).click();
					flag = true;
					break;
				}
					System.out.println("clicked on day");
					if(flag) {
						break;
			
					
					
				}
			}
		}
			
			
			
		
	}
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
}



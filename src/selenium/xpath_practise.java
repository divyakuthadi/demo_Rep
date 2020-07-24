package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class xpath_practise {
WebDriver driver;
	
	@BeforeMethod
	public void browserlaunch()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
}

	@Test
	public void printtable() {
		
		
		
		
		//prints entire table
		List<WebElement> list =driver.findElements(By.xpath(" //*[@id=\"customers\"]/tbody/tr"));
		int totalrows=list.size();
		System.out.println("the total rows are :" +totalrows);
		for(int i =0; i<totalrows;i++) {
			String RowValue=list.get(i).getText();
			System.out.println("the total rows are :" +RowValue);
		}
	}
			
				List<WebElement> col1 =driver.findElements(By.xpath(" //*[@id=\"customers\"]/tbody/tr/td[1]"));
				int totalcol1=col1.size();
				System.out.println("the total columns are :" +totalcol1);
				for(int j =0; j<totalcol1;j++) {
					String col1_Value=col1.get(j).getText();
					System.out.println("the first column values are :" +col1_Value);
				}}
				
				
				public void secondcolumn() {
					List<WebElement> col2 =driver.findElements(By.xpath(" //*[@id=\"customers\"]/tbody/tr/td[2]"));
					int totalcol2=col2.size();
					System.out.println("the total rows are :" +totalcol2);
					for(int i =0; i<totalcol2;i++) {
						String col2_Value=col2.get(i).getText();
						System.out.println("the second column values are :" +col2_Value);
					}
				
				
			}
				@Test
				public void thirdcolumn() {
					List<WebElement> col3 =driver.findElements(By.xpath(" //*[@id=\"customers\"]/tbody/tr/td[3]"));
					int totalcol3=col3.size();
					System.out.println("the total rows are :" +totalcol3);
					for(int i =0; i<totalcol3;i++) {
						String col3_Value=col3.get(i).getText();
						System.out.println("the third column values are :" +col3_Value);
					}}

			
			
	
		@AfterMethod
		public void teardown() {
			driver.quit();
		}

	
}
//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
//*[@id="leftcontainer"]/table/tbody/tr[2]/td[1]
	
//*[@id="customers"]
//*[@id="customers"]/tbody/tr[1]



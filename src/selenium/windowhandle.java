package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class windowhandle {
		WebDriver driver;
		
	@BeforeMethod
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/popup.php");
	}
		
		@Test
		public void windows() {
			driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
			String Mainwindow=driver.getWindowHandle();
			Set<String>child=driver.getWindowHandles();
			Iterator<String>s1=child.iterator();
			while(s1.hasNext()) {
				String childwindow=s1.next();
				if(!Mainwindow.equalsIgnoreCase(childwindow)) {
					driver.switchTo().window(childwindow);
					driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();			
                                 
			// Closing the Child Window.
                        driver.close();		
					driver.switchTo().window(Mainwindow);
				}
					System.out.println("switched to parent window");
				
			}
			
		}
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
			}


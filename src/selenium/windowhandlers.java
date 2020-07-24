package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class windowhandlers {
WebDriver driver;
	
	@Test
	public void browserlaunch() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://popuptest.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Multi-PopUp Test")).click();
		String MainWindow=driver.getWindowHandle();
		Set<String>sequence=driver.getWindowHandles();
		Iterator<String> i1=sequence.iterator();
		while(i1.hasNext()) {
			String Childwindow =i1.next();
			if(!MainWindow.equals(Childwindow)) {
				driver.switchTo().window(Childwindow);
				System.out.println("shifted to child window");
				driver.close();
				driver.switchTo().window(MainWindow);
				System.out.println("shifted to parent window");
			}
			
		}
		
	}

}

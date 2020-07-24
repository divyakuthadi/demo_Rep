package SeleniumAdvance;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import selenium.TakeScreenShot;

public class WindowHandler {
	public static WebDriver driver;

	@Test
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://popuptest.com/popuptest1.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println(title);
		String Parent=driver.getWindowHandle();
		Set<String>ele=driver.getWindowHandles();
		int elements=ele.size();
		Iterator<String> i1=ele.iterator();
		while(i1.hasNext()){
		String childwindow=i1.next();
		if(!Parent.equals(childwindow)){
			driver.switchTo().window(childwindow);
			driver.close();
			driver.switchTo().window(Parent);
		}
		


}
}}
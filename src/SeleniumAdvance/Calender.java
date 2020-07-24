package SeleniumAdvance;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.xpath("//label[contains(text(),'Return Date')]")).click();
		
		Thread.sleep(2000);
		List <WebElement>ele=driver.findElements(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr/td"));
		int ltotal=ele.size();
		for(int i=2;i<ltotal;i++) {
		String val=ele.get(i).getText();
		
	System.out.println(val);
		if(val.equalsIgnoreCase("18")) {
			ele.get(i).click();
			break;
		}
		}}
			
		}
		
	
		
	
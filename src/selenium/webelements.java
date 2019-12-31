package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement radio = driver.findElement(By.name("name"));
		radio.click();
		System.out.println("clicked radio button successfully");
		
		 driver.navigate().back();
		 List<WebElement> elements = driver.findElements(By.name("name"));
		 int number = elements.size();
		 System.out.println(+number);
		 for(int i = 0;i <= number; i++);
		String total =  elements.get(number).getAttribute("value");
		System.out.println("the total buttons are:" +total);
		driver.quit();
		 
		
		 
		 
		

	}

}

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement month = driver.findElement(By.id("name"));
		List<WebElement> dropdown = driver.findElements(By.id("name"));
		for(WebElement values:dropdown ) {
		String Contents = values.getText();
		System.out.println("the values of list of contents: "  +Contents);
		
		}

	}

}

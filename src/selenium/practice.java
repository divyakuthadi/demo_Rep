package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("books");
		search.click();
		String searchattempt = driver.getTitle();
		String expectedtite = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		if(expectedtite == searchattempt) {
			System.out.println("the execution is success");
			
		}
		else {
			System.out.println("exection is failed");
			
		}
				
		driver.quit();
		 

	}

}

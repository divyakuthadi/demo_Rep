package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\My\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();
		Thread.sleep(5000 );
		driver.findElement(By.linkText("Certified Refurbished")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("draggable"));
		action.dragAndDrop(Source, dest).build().perform();
		String Expected = driver.getTitle();
		System.out.println(Expected);
		
		String Actual = "Droppable | jQuery UI";
		if(Expected==Actual) {
			System.out.println("test case is pass");}
			else{
				System.out.println("test case is fail");
			}
		}
		
		

	}



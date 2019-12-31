package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it =handler.iterator();
			while(it.hasNext()) {
				
			String child = it.next();
			System.out.println(child);
			driver.switchTo().window(child);
			Thread.sleep(3000);
			
		System.out.println("the title of child window is: " +driver.getTitle());
		//driver.close();
		
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		System.out.println("the title of parent window is: " +driver.getTitle());
		
		
		WebElement mousehover = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[4]"));
		Actions action = new Actions(driver);
		action.moveToElement(mousehover).build().perform();
		//System.out.println("the mouse hovered on element: "  );
		Thread.sleep(5000);
		WebElement sub = driver.findElement(By.linkText("Clothing"));
		action.moveToElement(sub).click();
		System.out.println("the ele clicked on sublink");
		String sarees = driver.getTitle();
		
		System.out.println("the mouse hovered on element: "  +sarees);
		driver.quit();
		
			}}}

	
	


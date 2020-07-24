package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class preceedencexpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//a[contains(text(), 'Forgot account?')]/parent::td//preceding-sibling::td//input[@name='pass']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgot account')]")).click();
		System.out.println("clicked on button");


}
}
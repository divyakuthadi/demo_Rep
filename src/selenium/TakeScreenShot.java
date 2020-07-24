package selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenShot {
	

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();//
		driver.get("https://www.facebook.com/");
		Takescreenshot("fb_screenshot");

	}
public static void Takescreenshot(String filename) {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	FileUtils.copyfile(src, new File("C:\\Users\\My\\eclipse-workspace\\Selenium\\Screenshots"+filename+".jpg"));

}
}
package selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenShot {
	

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\My\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.ebay.com/");
		
		

	TakesScreenshot ts =  (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
//FileUtils.copyfile(source,new File("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\selenium.png"));//

}
}
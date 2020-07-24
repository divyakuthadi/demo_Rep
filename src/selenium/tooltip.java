package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip {
	

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.get("http://demo.guru99.com/test/social-icon.html");
		 Thread.sleep(3000);
		 String tooltip=

	}

}

package selenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class brokenlinks {
	
	WebDriver driver;
	



@Test
public void LunchSetup() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com/");
	List<WebElement>list = driver.findElements(By.tagName("a"));
	for(int i =0; i<list.size();i++) {
		WebElement ele =list.get(i);
		String url=ele.getAttribute("href");
		linkurl(url);
	}
}
	
	public static void linkurl(String link) throws Exception {
		URL url = new URL(link);
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setConnectTimeout(3000);
		connection.connect();
		if(connection.getResponseCode()==200) {
			System.out.println(connection.getResponseMessage());
		}
		if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
			System.out.println(connection.getResponseMessage());
		
	}
	
	
	
}
}
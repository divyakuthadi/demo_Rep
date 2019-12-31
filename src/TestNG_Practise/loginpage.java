package TestNG_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginpage {
WebDriver driver;
	
@BeforeMethod	
public void setup() {	
System.setProperty("webdriver.gecko.driver","C:\\Users\\My\\Downloads\\geckodriver.exe");
driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}

@Test(priority=2, groups ="launch")
public void BrowserLaunch() throws Exception {
driver.get("https://www.facebook.com/");
String title = driver.getTitle();
System.out.println(title);
Thread.sleep(3000);
}

@Test(priority=1, groups = "login")
public void login_browse() {
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys("userid");
	
	driver.findElement(By.id("pass")).clear();
	driver.findElement(By.id("pass")).sendKeys("pwd");
	
driver.findElement(By.id("Log In")).click();
}
@Test(priority=1, groups = "test", dependsOnMethods ="login_browse")
public void testcasesample1() {
	System.out.println("sample1");
}

@Test(priority=1, groups = "test")
public void testcasesample2() {
	System.out.println("sample2");
}

@AfterMethod
public void quit() {
	driver.quit();
	System.out.println("browser quitted");
}



}
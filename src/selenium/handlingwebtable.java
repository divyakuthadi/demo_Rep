package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class handlingwebtable {
	WebDriver driver;

	
	public void browserlaunch() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		
	}
		
		@Test
		public void pickvalue (){
			String BeforeXpath = "//*[@id='customers']/tbody/tr[";
			String AfterXpath = "]/td[1]";
			for(int rownum = 2; rownum<=7;rownum++) {
				String Xpath = BeforeXpath+rownum+AfterXpath;
				WebElement ele1= driver.findElement(By.xpath(Xpath));
				System.out.println(ele1.getText());
				if(ele1.getText().equals("Alfreds Futterkiste")) {
					System.out.println("Alfreds Futterkiste is found" +ele1.getText());
					break;
				}
					System.out.println("************************************");
					
				}}
				
				@Test
				public void secondcol (){
					String BeforeXpath = "//*[@id='customers']/tbody/tr[";
					String AfterXpath = "]/td[2]";
					for(int rownum = 2; rownum<=7;rownum++) {
						String Xpath = BeforeXpath+rownum+AfterXpath;
						WebElement ele2= driver.findElement(By.xpath(Xpath));
						System.out.println(ele2.getText());
						if(ele2.getText().equals("Maria Anders")) {
							System.out.println("Maria Anders is found" +ele2.getText());
							break;
						}
							System.out.println("************************************");
					
						}}
			
						@Test
						public void thirdcol (){
							String BeforeXpath = "//*[@id='customers']/tbody/tr[";
							String AfterXpath = "]/td[3]";
							for(int rownum = 2; rownum<=7;rownum++) {
								String Xpath = BeforeXpath+rownum+AfterXpath;
								WebElement ele3= driver.findElement(By.xpath(Xpath));
								System.out.println(ele3.getText());
								if(ele3.getText().equals("Germany")) {
									System.out.println("Germany is found" +ele3.getText());
									break;	
								}
									System.out.println("************************************");
									
							
		}}}


package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.excel.utility.utility_DDT;

public class customized_dynamicwebtable {


	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		/*
		List<WebElement>l1= driver.findElements(By.xpath("//*[@id=\"customers\"]//tr"));
		int total=l1.size();
		System.out.println(total);
		
		for(int row =1; row<=total;row++) {
			String rowvalues=l1.get(row).getText();
			System.out.println(rowvalues);
			System.out.println("******************************************");
				
		}*/
		
		utility_DDT utility = new utility_DDT("C:\\Users\\My\\eclipse-workspace\\Selenium\\src\\Testdata\\WritingDataTable.xlsx");
		utility.addSheet("writingdata");
		utility.addColumn("writingdata", "fgghgh");
		List<WebElement>l2= driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[1]"));
		int column1= l2.size();//
		System.out.println( column1);
		
		
		for(int col1=0;col1<l2.size();col1++) {
			WebElement company=l2.get(col1);
			String COMPANY=company.getText();
			System.out.println("TheColumn Values are: " +COMPANY);
		
			
		utility.setCellData("writingdata", "fgghgh", col1, COMPANY);
		}
}
		
	
				
		
		
		
		

}
	

	
	
	

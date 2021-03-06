package webdriver.commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTablesExercise {

	public static void main(String[] args) {
		
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\seleniumjava\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", exePath);		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		
		//Here we are storing the value from the cell in to the string variable
		String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(sCellValue);
		
		// Here we are clicking on the link of first row and the last column
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
		System.out.println("Link has been clicked otherwise an exception would have thrown");
		//driver.close();		
	}
}

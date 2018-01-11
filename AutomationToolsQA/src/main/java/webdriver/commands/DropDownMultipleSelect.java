package webdriver.commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultipleSelect {

	public static void main(String[] args) 
	{		
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", exePath);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demoqa.com/registration/");

//		WebElement element = driver.findElement(By.id("Country"));
//		Select oSelect = new Select(element);
		//Or it can be also written as
		//Select oSelect = new Select(driver.findElement(By.id("Country")));
		
		//selectByVisibleText
		Select oSelect1 = new Select(driver.findElement(By.id("yy_date_8")));
		oSelect1.selectByVisibleText("2010");
		
		//selectByIndex
		Select oSelect2 = new Select(driver.findElement(By.id("yy_date_8")));
		oSelect2.selectByIndex(5);
		
		//selectByValue
		Select oSelect3 = new Select(driver.findElement(By.id("yy_date_8")));
		oSelect3.selectByValue("2011");
		
		//getOptions
		Select oSelect4 = new Select(driver.findElement(By.id("yy_date_8")));
		List <WebElement> elementCount = oSelect4.getOptions();
		System.out.println(elementCount.size());
		
		//Print all the Options
		Select oSelect5 = new Select(driver.findElement(By.id("yy_date_8")));
		List <WebElement> elementCount2 = oSelect5.getOptions();
		int iSize = elementCount2.size();

		for(int i =0; i<iSize ; i++){
			String sValue = elementCount2.get(i).getText();
			System.out.println(sValue);
			}
		
	}
}

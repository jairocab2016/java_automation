package webdriver.commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultipleSelectExercise 
{
	public static void main(String[] args) 
	{		
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\seleniumjava\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", exePath);		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		Select continentes =  new Select (driver.findElement(By.id("continents")));
		
		continentes.selectByIndex(1);
		continentes.selectByVisibleText("Africa");
		
		List <WebElement> continent = continentes.getOptions();
		int sizeContinent = continent.size();
		
		for (int i = 0; i < sizeContinent; i++) 
		{		
			String value = continentes.getOptions().get(i).getText();
			System.out.println(value);
			if (value.equals("Africa")) 
			{
				continentes.selectByIndex(i);
				break;
			}
		}		
	}
}

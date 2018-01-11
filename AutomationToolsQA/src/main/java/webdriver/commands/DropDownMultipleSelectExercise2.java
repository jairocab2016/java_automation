package webdriver.commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultipleSelectExercise2 {

	public static void main(String[] args) {
		
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		Select comands = new Select (driver.findElement(By.name("selenium_commands")));
		
		comands.selectByIndex(0);
		comands.deselectByIndex(0);
		
		comands.selectByVisibleText("Navigation Commands");
		comands.deselectByVisibleText("Navigation Commands");
		
		List<WebElement> listComands = comands.getOptions();
		int sizeComands = listComands.size();
		
		for (int i = 0; i < sizeComands; i++) {
			String value = comands.getOptions().get(i).getText();
			System.out.println(value);
			comands.selectByIndex(i);
		}
		
		comands.deselectAll();
	}
}

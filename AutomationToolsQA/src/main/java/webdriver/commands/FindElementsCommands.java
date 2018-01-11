package webdriver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsCommands {

	public static void main(String[] args) 
	{
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", exePath);		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement element = driver.findElement(By.id("submit"));
		element.submit();
		
		WebElement element2 = driver.findElement(By.name("firstname"));
		// Action can be performed on Input Text element
		element2.sendKeys("ToolsQA");
		
		WebElement parentElement = driver.findElement(By.className("button"));
		WebElement childElement = parentElement.findElement(By.id("submit"));
		childElement.submit();
		
		WebElement element3 = driver.findElement(By.tagName("button"));
		// Action can be performed on Input Button element
		element3.submit();
		
		
		WebElement element4 = driver.findElement(By.linkText("Partial Link Test"));
		//element4.click();
		//Or can be identified as
		WebElement element5 = driver.findElement(By.partialLinkText("Partial"));
		element5.click();
	}
}
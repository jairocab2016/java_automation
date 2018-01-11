package webdriver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsCommandsExercise {

	public static void main(String[] args) {
		
		//String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver =  new ChromeDriver();
		
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(url);		
		WebElement name = driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[1]"));
		name.sendKeys("Lakshay");
		WebElement lastName =  driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[2]"));
		lastName.sendKeys("Sharma");	
		driver.findElement(By.xpath(".//*[@id='submit']")).click();		
		System.out.println("Geniaaaal");
		

	}

}

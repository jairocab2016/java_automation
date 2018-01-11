package webdriver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandsExercise {
	
	public static void main(String[] args) 
	{	
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", exePath);		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://demoqa.com/";
		driver.get(url);
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to(url);
		driver.navigate().refresh();
		driver.close();		
	}

}

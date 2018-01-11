package webdriver.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	
	public static void main(String[] args) {
		
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", exePath);		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.DemoQA.com");
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.close();
	}

}

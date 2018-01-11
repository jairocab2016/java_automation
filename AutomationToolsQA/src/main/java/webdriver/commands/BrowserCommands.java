package webdriver.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	public static void main(String[] args)
	{
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		
		driver.close(); //solo cierra la ventana actual
		driver.quit(); //cierra todas las ventanas
	}

}

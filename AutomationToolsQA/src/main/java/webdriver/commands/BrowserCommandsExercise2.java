package webdriver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandsExercise2 {

	public static void main(String[] args) {
		
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\seleniumjava\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		String url = "http://demoqa.com/frames-and-windows/";
		driver.get(url);
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		driver.close();
		
	}

}

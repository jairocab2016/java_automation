package alerts.windows;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover
{
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://store.demoqa.com/");
		
		WebElement element = driver.findElement(By.linkText("Product Category"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("iPads")).click();
		
		//It can be done differently like this:
//		WebElement element2 = driver.findElement(By.linkText("Product Category"));
//	    Actions action2 = new Actions(driver);
//	    action2.moveToElement(element2).moveToElement(driver.findElement(By.linkText("iPads"))).click().build().perform();
		
		/*
		 *  In that case it is better to use ‘perform()’ 
		 *  action on the main menu to hold the menu list till the time Selenium 
		 *  identify the sub menu item and click on it.
		 */
//		WebElement element3 = driver.findElement(By.linkText("Product Category"));
//        Actions action3 = new Actions(driver);
//        action3.moveToElement(element3).perform();
//        WebElement subElement = driver.findElement(By.linkText("iPads"));
//        action3.moveToElement(subElement);
//        action3.click();
//        action3.perform();
	}

}
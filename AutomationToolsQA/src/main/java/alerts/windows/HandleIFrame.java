package alerts.windows;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame 
{
	public static void main(String[] args) 
	{
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

		// By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);
		
		// By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());

		// First find the element using any of locator stratedgy
		WebElement iframeElement = driver.findElement(By.id("IF1"));

		// now use the switch command
		driver.switchTo().frame(iframeElement);
		
		//Switch back to the main window
		driver.switchTo().defaultContent();
	}
}

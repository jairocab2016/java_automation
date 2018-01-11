package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Constant;

public class FirstTestCase 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String exePath = Constant.Path_driver;
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.store.demoqa.com");
		System.out.println("Successfully opened the website www.Store.Demoqa.com");
		Thread.sleep(5000);
		driver.quit();
	}
}
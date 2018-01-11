package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// Import package appModule.*
//import appModules.SignIn_Action;
import pageObjects.Home_Page;

public class Module_TC
{
	private static WebDriver driver = null;
	private static String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");

		// Use your Module SignIn now
//		SignIn_Action.Execute(driver, "jairo", "123456");
		System.out.println("Login Successfully, now it is the time to Log Off buddy.");
		Home_Page.lnk_LogOut(driver).click();
		driver.quit();
	}
}
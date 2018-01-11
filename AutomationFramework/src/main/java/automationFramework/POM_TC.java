package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Import package pageObject.*
import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import utility.Constant;

public class POM_TC
{
	private static WebDriver driver = null;
	private static String exePath = Constant.Path_driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", exePath);		
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.store.demoqa.com");

		// Use page Object library now
		Home_Page.lnk_MyAccount(driver).click();
		LogIn_Page.txtbx_UserName(driver).sendKeys("jairo");
		LogIn_Page.txtbx_Password(driver).sendKeys("123456");
		LogIn_Page.btn_LogIn(driver).click();
		System.out.println("Login Successfully, now it is the time to Log Off buddy.");
		Home_Page.lnk_LogOut(driver).click();
		driver.quit();
	}
}
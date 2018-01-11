package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Home_Page;
import appModules.SignIn_Action;

// Import package utility.*
import utility.Constant;

public class Global_Var_TC 
{
	private static WebDriver driver = null;
	private static String exePath = Constant.Path_driver;
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", exePath);		
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the Online Store Website using Constant Variable
		driver.get(Constant.URL);

		// Pass Constant Variables as arguments to Execute method

		//SignIn_Action.Execute(driver, Constant.Username, Constant.Password);
		System.out.println("Login Successfully, now it is the time to Log Off buddy.");
		Home_Page.lnk_LogOut(driver).click();
		driver.quit();
	}
}
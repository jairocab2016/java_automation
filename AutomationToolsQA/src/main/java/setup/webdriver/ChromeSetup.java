package setup.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSetup {

	public static void main(String[] args) throws InterruptedException 
	{
		//String exePath = "C:\\Users\\jairo\\Desktop\\Repositorios\\automation\\javaSelenium\\chromedriver\\chromedriver.exe";

		//System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		driver.quit();
	}
}
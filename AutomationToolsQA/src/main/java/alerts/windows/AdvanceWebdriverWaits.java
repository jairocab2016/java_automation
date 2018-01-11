package alerts.windows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class AdvanceWebdriverWaits 
{	
		public static void main(String[] args) throws InterruptedException 
		{			
			String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver", exePath);

			WebDriver driver = new ChromeDriver();
			driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
			wait.withTimeout(2, TimeUnit.SECONDS);

			Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>()
					{
						public Boolean apply(WebDriver arg0) 
						{
							WebElement element = arg0.findElement(By.id("colorVar"));
							String color = element.getAttribute("color");
							System.out.println("The color if the button is " + color);
							if(color.equals("red"))
							{
								return true;
							}
							return false;
						}
					};

			wait.until(function);
		}
	}

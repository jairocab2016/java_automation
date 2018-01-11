package webdriver.commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommandsExercise {

	public static void main(String[] args) {
		
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\seleniumjava\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", exePath);		
		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		
		// Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get(url);
        
     // Create new WebDriver wait
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
     // Wait for Alert to be present
        
        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
 
        System.out.println("Either Pop Up is displayed or it is Timed Out");
 
        // Accept the Alert
 
        myAlert.accept();
 
        System.out.println("Alert Accepted");
        
        
		
	}
}

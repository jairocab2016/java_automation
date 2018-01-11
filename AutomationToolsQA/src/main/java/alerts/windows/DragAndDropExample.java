package alerts.windows;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropExample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		String URL = "https://www.drive.google.com";

		driver.get(URL);

		// It is always advisable to Maximize the window before performing
		// DragNDrop action

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.linkText("Ir a Google Drive")).click();
		driver.findElement(By.name("identifier")).sendKeys("USUARIO");
		driver.findElement(By.xpath("//span[text()]")).click();		
		driver.findElement(By.name("password")).sendKeys("PASSWORD");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
		WebElement From = driver.findElement(By.xpath(".//*[@id=':1p.0B1lCS_gVMHiYeVRYMEJzcGN2Mms']/div[1]/div/div[2]/div/div[3]/span"));

		WebElement To = driver.findElement(By.xpath(".//*[@id=':1p.0B1lCS_gVMHiYaDB3SENBSDFDY3c']/div[1]/div/div[2]/div/div[3]/span"));
		
		Actions builder = new Actions(driver);

		Action dragAndDrop = builder.clickAndHold(From)
				.moveToElement(To)
				.release(To)
				.build();
		dragAndDrop.perform();
	}
}
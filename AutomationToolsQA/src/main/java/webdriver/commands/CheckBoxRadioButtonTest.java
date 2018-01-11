package webdriver.commands;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioButtonTest {

	public static void main(String[] args) {
		
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", exePath);		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		
		driver.get(url);
		
		List<WebElement> sex = driver.findElements(By.name("sex"));
		
		Iterator<WebElement> iter = sex.iterator();
		
		while (iter.hasNext())
		{	
			
		  System.out.println(iter.next().getAttribute("value"));
		}	
		
		List<WebElement> yearExperience = driver.findElements(By.name("exp"));
		
//		iter = yearExperience.iterator();
//		
//		while (iter.hasNext())
//		{
//			String elemento = iter.next().getAttribute("value");
//			boolean elementSelect = iter.next().isSelected();
//			
//			if (elementSelect == false) 
//			{
//				System.out.println("Elemento no seleccionado: " + elemento);
//			} else {
//				System.out.println("Elemento seleccionado: " + elemento);
//			}
//			
//		}
		yearExperience.get(2).click();
		
		int tamanioExperience = yearExperience.size();
		
		for (int i = 0; i < tamanioExperience; i++) 
		{
			String valueExperience = yearExperience.get(i).getAttribute("value");
			boolean selectExperience = yearExperience.get(i).isSelected();
			if (selectExperience) {
				System.out.println("Elemento seleccionado: " + valueExperience);
			} else {
				System.out.println("Elemento no seleccionado: " + valueExperience);
			}
		}
		
		boolean visibleYear =  yearExperience.get(1).isEnabled();	
		if (visibleYear) 
		{
			System.out.println("Elemento habilitado: " + yearExperience.get(1).getAttribute("value"));
		}
		
		
		
		
	}
}

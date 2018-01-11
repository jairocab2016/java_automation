package webdriver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) 
	{		
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/registration/");
		
		WebElement element = driver.findElement(By.id("username"));
		element.clear();
		//Or can be written as
		driver.findElement(By.id("username")).clear();
		
		WebElement element2 = driver.findElement(By.id("username"));
		element2.sendKeys("ToolsQA");
		//Or can be written as
		driver.findElement(By.id("username")).sendKeys("ToolsQA");
		
		WebElement element3 = driver.findElement(By.linkText("ToolsQA"));
		element3.click();
		//Or can be written as
		//driver.findElement(By.linkText("ToolsQA")).click();
		
		WebElement element4 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/div/div/div/div/p/a/img"));
		boolean status = element4.isDisplayed();
		//Or can be written as
		boolean statuus = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/div/div/div/div/p/a/img")).isDisplayed();
		driver.navigate().back();
		
		WebElement element5 = driver.findElement(By.id("username"));
		boolean statuselement5 = element5.isEnabled();
		//Or can be written as
		boolean staus5 = driver.findElement(By.id("username")).isEnabled();
		
		if (statuselement5) {
			element5.clear();
			element5.sendKeys("ToolsQA");
		}
		
		WebElement element6 = driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]"));
		boolean status6 = element6.isSelected();
		//element6.click();
		//Or can be written as
		boolean staus6 = driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).isSelected();
		System.out.println(status6);
		
		WebElement element7 = driver.findElement(By.name("pie_submit"));
		element7.submit();
		//Or can be written as
		driver.findElement(By.name("pie_submit")).submit();
		
		WebElement element8 = driver.findElement(By.xpath(".//*[@id='text-2']/div"));
		String linkText = element8.getText();
		System.out.println(linkText);
		
		WebElement element9 = driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]"));
		String tagName = element9.getTagName();
//		//Or can be written as
		String tagName2 = driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).getTagName();
		System.out.println(tagName2);
		
		WebElement element10 = driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]"));
		String cssValue = element10.getCssValue("background-color");
		//Oe can be written as
		String cssValue2 = driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).getCssValue("background-color");
		
		WebElement element11 = driver.findElement(By.id("username"));
		String attValue = element11.getAttribute("class");
		System.out.println(attValue);
		
		WebElement element12 = driver.findElement(By.name("pie_submit"));
		Dimension dimensions = element12.getSize();
		System.out.println("Height : " + dimensions.height + " Width : "+ dimensions.width);
		
		WebElement element13 = driver.findElement(By.name("pie_submit"));
		Point point = element13.getLocation();
		System.out.println("X cordinate : " + point.x + " Y cordinate: " + point.y);
		
	}

}

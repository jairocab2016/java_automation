package webdriver.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsCommandsExercise2 {

	public static void main(String[] args) {
		
		String exePath = "C:\\Users\\jjcardozo\\Downloads\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver =  new ChromeDriver();
		
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(url);
		
		driver.findElement(By.partialLinkText("Partial")).click();
		
		String boton = driver.findElement(By.tagName("button")).toString();
		System.out.println(boton);
		
		driver.findElement(By.linkText("Link Test")).click();
		
		System.out.println("Geniaaaaaaal");
	}

}

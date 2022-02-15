package com.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		System.out.println("demoqa webpage Displayed");

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions actions = new Actions(driver);
		
		WebElement menuOption = driver.findElement(By.xpath("//a[text()='Main Item 2']"));

		
		//actions.moveToElement(menuOption).build().perform();
		
		WebElement subMenuOption = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		
		//actions.moveToElement(subMenuOption).build().perform();
		
		//actions.moveToElement(menuOption).moveToElement(subMenuOption).build().perform();
		
		 //driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']")).click();
		 
		 actions.contextClick(menuOption).perform();// it will perform right click
		
		
		
	}

}

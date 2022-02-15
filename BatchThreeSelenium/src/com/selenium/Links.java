package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/links");

		//driver.findElement(By.linkText("Home")).click();
		
		driver.findElement(By.partialLinkText("Ho")).click();

		
		
		
		
		

	}

}

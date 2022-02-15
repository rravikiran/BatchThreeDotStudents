package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement search = driver.findElement(By.name("q"));

		search.sendKeys("iphone");
		
		//or
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		
		
		
		

	}

}

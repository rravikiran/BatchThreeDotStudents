package com.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestng {
	WebDriver driver;

	@BeforeTest
	public void config() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		// WebDriver driver;

		driver = new ChromeDriver();

	}

	@BeforeClass
	public void launchUrl() {
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
	}

	@BeforeMethod
	public void login() {
		// login
	}

	@Test
	public void f() {

		WebElement search = driver.findElement(By.name("q"));

		search.sendKeys("iphone");

	}

	

	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}

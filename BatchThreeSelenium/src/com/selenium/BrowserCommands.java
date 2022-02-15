package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserCommands {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		String pagetitle = driver.getTitle();
		System.out.println("Title of page is"+ pagetitle);
		
		/*
		 * if("Google".equals(pagetitle)) {
		 * 
		 * System.out.println("We are in correct page"); }else {
		 * System.out.println("Wrong page"); }
		 */
		
		//Assert.assertFalse("Googleraviki".equals(pagetitle));
		
		Assert.assertEquals("Google", pagetitle);
		
		
		
		/*
		 * String pageUrl = driver.getCurrentUrl(); System.out.println("URL of page is"+
		 * pageUrl);
		 * 
		 * String pagesource = driver.getPageSource();
		 * //System.out.println("pagesource "+ pagesource);
		 * 
		 * driver.quit();
		 */
	
		
		

	}

}

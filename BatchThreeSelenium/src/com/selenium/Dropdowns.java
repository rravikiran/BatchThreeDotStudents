package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");

		Select sel = new Select(driver.findElement(By.id("cars")));
		
		//sel.selectByValue("audi");
		
		//sel.selectByVisibleText("Opel");
		
		//sel.selectByIndex(2);
		
		//List<WebElement> li = driver.findElements(By.xpath("//select"));
		
		if(sel.isMultiple()) {
			
			
			sel.selectByVisibleText("Opel");
			sel.selectByVisibleText("Audi");
			
			sel.selectByIndex(0);
			sel.selectByIndex(1);
			
		}
		
		List<WebElement> li = sel.getOptions();
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i).getText());
		}
		
		
		sel.deselectAll();
		
		

	}

}

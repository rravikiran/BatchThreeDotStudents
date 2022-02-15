package com.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hellow {
	
	
	
	
	@BeforeTest
	public void bt() {
		  
		  System.out.println("This is before test");
	  }
	
	@BeforeClass
	public void bc() {
		  
		  System.out.println("This is before class");
	  }
	
	@BeforeMethod
	public void bm() {
		  
		  System.out.println("This is before method");
	  }
	
	@BeforeSuite
	public void b() {
		  
		  System.out.println("This is before suite");
	  }
	
	
	@Test
	public void f() {
		  
		  System.out.println("This is first Testng program");
	  }
	
	@Test
	public void ff() {
		  
		  System.out.println("This is second test method Testng program");
	  }
	
	@AfterSuite
	public void a() {
		  
		  System.out.println("This is After suite");
	  }
	
	@AfterTest
	public void abt() {
		  
		  System.out.println("This is After test");
	  }
	
	@AfterClass
	public void abc() {
		  
		  System.out.println("This is After class");
	  }
	
	@AfterMethod
	public void abm() {
		  
		  System.out.println("This is After method");
	  }
	
	
}

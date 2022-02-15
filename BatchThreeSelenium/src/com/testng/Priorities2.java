package com.testng;

import org.testng.annotations.Test;

public class Priorities2 {
	@Test(priority =0,groups = {"smoke"})
	public void z() {
		System.out.println("This is z method");
	}
	
	@Test(priority =4,groups = {"Regression"})
	public void firstMethod() {
		System.out.println("This is first method");
	}

	@Test(priority =2,groups = {"smoke","Regression"})
	public void secondMethod() {
		System.out.println("This is second method");
	}

	@Test(priority =1,groups = {"smoke","Regression","Functional"})
	public void thirdMethod() {
		System.out.println("This is third method");
	}

	@Test(priority =3,groups = {"Functional"})
	public void fourthMethod() {
		System.out.println("This is fourth method");
	}
}

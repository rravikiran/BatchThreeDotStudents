package com.testng;

import org.testng.annotations.Test;

public class JavaOrderwise {

	public void firstMethod() {
		System.out.println("This is first method");
	}

	public void secondMethod() {
		System.out.println("This is second method");
	}

	public void thirdMethod() {
		System.out.println("This is third method");
	}

	public void fourthMethod() {
		System.out.println("This is fourth method");
	}
	
	public static void main(String[] args) {
		JavaOrderwise j = new JavaOrderwise();
		
		j.secondMethod();
		j.firstMethod();
		
		j.thirdMethod();
		j.fourthMethod();
		
		
	}
}

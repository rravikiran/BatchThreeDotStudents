package com.testng;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsExample {
	
	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		
		List<String> lii = new LinkedList<>();
		
		li.add("Ravi");
		li.add("kiran");
		li.add("Ravi11");
		li.add("kiran11");
		li.add("Ravi11");
		li.add("kiran11");
		

		
		
		
		for(String l : li) {
			System.out.println(l);
		}
		
		
		li.remove(1);
		System.out.println("After remove");
		for(String l : li) {
			System.out.println(l);
		}
		
		
		/*
		 * Iterator<String> it = li.iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */
		
	}

}

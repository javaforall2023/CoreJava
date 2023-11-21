package com.javaforall.java5;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {

		print(5); 
		print("Hello World");
		print(23.45);
		
		List<String> stringList = new ArrayList<>();
		stringList.add("String1");
		stringList.add("String2");
						
	}
	

	private static <T> void print(T t) {
		System.out.println(t);
	}
	
	// Assignment - Create a calculator class to perform addition, Subtraction, Multiplications. 
	// Passing arguments of different types Integer, Double, Float 
	
	// Generic Calculator which can take any type of parameters and perform the mathematic operations.
	
	
	
	/*
	 * private static void printNumber(String string) { System.out.println(string);
	 * 
	 * }
	 * 
	 * public static void printNumber(Integer number) { System.out.println(number);
	 * }
	 */
}

package com.javaforall.java5;

import java.util.ArrayList;
import java.util.List;

public class FirstJava5 {

	public static void main(String[] args) {

		// Java5 Features
		
		// 1. Generics
		// 2. Enhanced For Loop
		// 3. Enum
		// 4. Auto Boxing and Unboxing
		// 5. VarArgs
		// 6. Annotations
		// 7. Static Imports
		
		// Primitive Data Types
		// int,float, double
		// Integer, Double
		
		int a = 5;
		Integer b ;
		
		b = 5;
		
		Integer.valueOf(a);
		
		// AutoBoxing and auto Un Boxing
		
		String s = "5";
		
		//int a = s;
		int abc = Integer.parseInt(s);
		
		// Primitive type to Wrapper  - Auto Boxing
		// Wrapper to primitive - Auto Unboxing
		
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
			
		
		
		
	}

}

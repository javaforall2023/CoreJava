package com.javaforall.java8;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaFunctions {

	public static void main(String[] args) {

		FunctionalInterfaceEx ex =	 () -> System.out.println("Hellow World"); 
		
		ex.display();
		
		// What are the default Functional interfaces available in Java8 and what is the purpose of of each
		// Predicate
		// BiFunction
		// Consumer
		
		Consumer<String> con = (value) -> System.out.println(value);
		
		con.accept("Hellow World with Consumer");
				
		Predicate prd = (value) -> value!=null;
		
		boolean result = prd.test(null);
		
		System.out.println("Predicate Result:"+result);
		
		// Interface changes in Java8 and Java9
		// Functional Interfaces
		// Default Functional Interfaces available in Java8
		// Lambda Functions
		// Create examples of lambda functions using the default Functional Interfaces
		
		
		
		
	}

}

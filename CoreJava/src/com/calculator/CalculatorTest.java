package com.calculator;

public class CalculatorTest {

	public static void main(String  []args) {
		
		int a=0,b=0;
		
		System.out.println("Addition");
		a = 10; b = 20;
		int c = a+b;
		
		System.out.println("Addition of A and B:"+c);
		
		a = 30; b = 40;
		
		c = a-b;
		System.out.println("Subtraction of A and B:"+c);
		
		
	}
	
	public int add(int a, int b) {
		
		return a+b;
	}

}

package com.javaforall.dayone;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int a =10, b = 30, c = 40;
		
		if(a>b && a>c){
			System.out.println(" A is Big");
		}else if(b>a && b>c) {
			System.out.println("B is Big");
		}else {
			System.out.println("C is Big");
		}
		
		//1. optimise comparing 3 variables
		//2. Take 4 variables and find the biggest among 4
		
		// 1,2,3,4,5,6,7
		
		int n = 5;
		
		switch(n) {
		
			case 1: System.out.println("One");
				break;
			case 2: System.out.println("Two");
				break;
			case 3: System.out.println("Three");
				break;
			case 4: System.out.println("Four");
				break;
			default: System.out.println("Five");
		
		}
		
		// Enter character - Print the Name of the color if the color name starts with the character given
		
		// n = 100 - hundred  
		

	}

}

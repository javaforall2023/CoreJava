package com.javaforall.strings;

public class StringsExample {

	public static void main(String[] args) {

		String s1 = "hello";
		//s1 = "world";
		
		String s2 = "hello";
		
		String s3 = new String("hello");
		
		System.out.println(s1);
		
		if(s1==s2) {
			
			System.out.println("S1 and S2 are Same");
		}
		
		if(s1==s3) {
			System.out.println("s1 and s3 are same");
		}else{
			System.out.println("s1 and s3 are not same");
		}
		
		if(s1.equals(s3)) {
			System.out.println("Equals Method S1 and S3 are Same ...");
		}
		
		// Creates String pool
		// hello
		// world
		
		// Convert String to a character Array
		// How to reverse the String
		// How to split the String
		
		
	}

}

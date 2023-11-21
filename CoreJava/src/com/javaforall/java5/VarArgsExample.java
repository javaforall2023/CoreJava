package com.javaforall.java5;

public class VarArgsExample {

	public static void main(String[] args) {
	
		String s = "Helllo";
		String s1 = "World";
		String s3 = "Welcome";
		String s4 = "to New World";
		
		displayMessage(1,s,s1,s3,s4);
		displayMessage(2,s,s1,s3);
		displayMessage(3,s,s1);
		String[] names;
		
	}

	private static void displayMessage(int a, String... s) {
		System.out.println(s);
		//System.out.println(s1);
	}
	
	// 
	

}

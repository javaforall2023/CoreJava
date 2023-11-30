package com.javaforall.java8;

public interface Java8Interface {
	
	public void display();
	
	default public void displayDefault() {
		
		System.out.println("Default Method");
		diplayPrivate();
	}
	
	static public void displayStatic() {
		System.out.println("Display Static");
	}
	
	private void diplayPrivate() {
		System.out.println("Display Private");
	}
	
	

	/*
	 * formatDate(String date){ return formaatedDate; }
	 */
}

// Creating an interface dealing with dates

// display date of Birth
/// display JoiiningDate
// display salary date

// isplay date in specific Format - dd-Mon-YYYY

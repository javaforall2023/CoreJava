package com.javaforall.exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		ExceptionHandling2 ex = new ExceptionHandling2();
		
		int number = ex.validateNumber();
		
		System.out.println(number);
        
	}
	
	public int validateNumber() {
		
		try {
			System.exit(0);
			return 5;
		}catch(NumberFormatException ex) {
			return 3;
		}finally {
			return 10;
		}
	}

}

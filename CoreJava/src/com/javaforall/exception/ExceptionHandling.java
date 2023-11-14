package com.javaforall.exception;

public class ExceptionHandling {

	public static void main(String[] args){
		
		ExceptionHandling ex = new ExceptionHandling();
		
		try {
		int number = ex.validateNumber(-5);
		
		System.out.println(number);
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public int validateNumber(int number) throws CustomException{
		
		if(number<0) {
			throw new CustomException("It s negative Number");
		}else {
			return number;
		}
	}
		
}

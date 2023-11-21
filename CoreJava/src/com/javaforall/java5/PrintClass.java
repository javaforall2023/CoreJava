package com.javaforall.java5;

public class PrintClass<T> {
	T number;
	
	public PrintClass(T number){
		this.number = number;
	}
	
	public void print() {
		
		System.out.println(this.number);
		
	}

}

package com.javaforall.dayone;

public class Methods {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 30;
		
		int c = addition(a,b);
		System.out.println(c);
		
		int x = 30, y=40;
		
		int z = addition(x,y);
		
		System.out.println(z);

	}
	
	static int addition(int x,int y) {
		int result = x+y;
		
		return result;
	}

}

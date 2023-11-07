package com.javaforall.dayone;

public class Operators {

	public static void main(String[] args) {
		
		int num1 = 20, num2 = 30, num3 =10;
		
		int add, sub, div, mul, mod;
		
		add = num1+num2;
		
		System.out.println("Addition:"+add);
		
		sub = num2-num1;
		
		System.out.println("Subtraction:"+sub);
		mul = num1*num2;
		
		System.out.println("Multiply:"+mul);
		
		div = num2/num3;
		
		System.out.println("Division:"+div);
		
		mod = num2%num3;
		
		System.out.println("Mod:"+mod);
		
		int a = 25; // 11001
		int b = 15; // 01111
					  //01001 - 8+1 = 9 	
		
		int c = a&b;
		
		System.out.println("Bitwise C"+c);
		
		
		
				
	}

}

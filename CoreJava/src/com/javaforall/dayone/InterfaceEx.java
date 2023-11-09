package com.javaforall.dayone;

public class InterfaceEx implements FirstInterface{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	public static void main(String args[]) {
		
		FirstInterface inter = new InterfaceEx();
		
		FirstInterface inter2 = new InterfaceEx2();
		
		int result = inter.add(5, 10);
		
		System.out.println(result);
		
		int result2 = inter.add(5, 10);
		
		System.out.println();
	}

}

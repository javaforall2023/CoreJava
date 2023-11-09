package com.javaforall.dayone;

public class AbstractClass extends one{

	public static void main(String[] args) {
		
		//one obj = new one();
		//obj.performPrint();

	}

	@Override
	void performPrint() {
		System.out.println("Abstract Method");
		
	}

}

abstract class  one{
	
	abstract void performPrint();
	
	void printTwo(){
		
	}
}

//Car - 
// Bus -
// X - 

package com.javaforall.java8;

public class AnonymousClassExample {

	public static void main(String[] args) {
		
		Anonymous an = new Anonymous();
		an.display();
		
		Anonymous an2 = new Anonymous() {
			
			public void display() {
				System.out.println("Anonymous Inner");
			}
		};
		
		an2.display();
		
		
		AnonymousInter inter = new AnonymousInter() {
			@Override
			public void displayInter() {
				System.out.println("Anonymous Interface..");
				
			}
		};
		
		inter.displayInter();
	}
	
	
	

}

class Anonymous{
	public void display() {
		System.out.println("Anonymous Class Display");
	}
}

interface AnonymousInter{
	
	public void displayInter();
}

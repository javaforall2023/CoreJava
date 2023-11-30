package com.javaforall.java8;

public class Java8InterfaceImpl implements Java8Interface{

	public static void main(String[] args) {
			
		Java8Interface.displayStatic();
		Java8InterfaceImpl imple = new Java8InterfaceImpl();
		
		imple.displayDefault();
		imple.display();

	}

	@Override
	public void display() {
		
		System.out.println("Overriding the Abstract Method");
		
	}
	
	@Override
	public void displayDefault(){
		System.out.println("Display Default in Implementation class");
	}
	

	// Car
	
		// default driving
		// default navigation
		// default milage
	
		// alignWheels()
	    // allignSteering()
	
	    // Auto Driving - Abstract
	
	
	 // Tesla implements Car - 
	
	 // BMW implements Car
	// Honda implements Car
	
}

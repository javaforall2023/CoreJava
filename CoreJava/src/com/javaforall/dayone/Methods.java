package com.javaforall.dayone;

public class Methods {

int a;
int b;

public void printData() {
	
	Child c = new Child();
	

}
	
// Inheritance - has a relationship

// Single Inheritance, Multiple Inheritance, Multi LevelInheritance

// Java does not support multiple inheritance? // What is diamond problem ... 

// Ability to take more than one form

	// Overloading Over riding

void calculate(int a, int b){
	
}

void calculate(float a, float b) {
	
}



}

class GrandParent{
	
	public void grantParentProperties() {
		
	}
	
}
class Parent extends GrandParent{
	
	public void parentPropeties() {
		
	}
	
	void calculate(int a, int b){
		
	}
}

class Child extends Parent{
	
	public void childProperties() {
		
	}
	
	void calculate(int a, int b){
		
	}
}

package com.javaforall.arrays.custom;

public class ArrayImplementation {

	public static void main(String[] args) {
		
		Array array = new Array(4);
		
		System.out.println("Printing Empty Array");
		;
		array.print();
		
		// Adding the elements into Array
		array.addElement(4);
		array.addElement(3);
		array.addElement(5);
		array.addElement(6);
		array.addElement(7);
		
		System.out.println("Printing the Array after adding the elements");
		
		array.print();
		
		System.out.println("Implementing Remove functionality");
		
		array.remove(3);
		
		System.out.println("Printing the array after deleting the element");
		
		array.print();
		
		
		// 1. Sorting added the Elements in the dynamic Array
		
		// 2. Searching the given element in dynamic Array  Ex: 6 - Element at position -3 

	}

}

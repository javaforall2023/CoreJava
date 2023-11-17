package com.javaforall.collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {

	public static void main(String[] args) {
		
		Queue<String> fruits = new LinkedList<>();
		
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("melon");
		
		System.out.println(fruits);
		
		System.out.println("Head of the Queue:"+fruits.element());
		
		System.out.println("Remove method:"+fruits.remove());
		
		System.out.println(fruits);
		
	}

}

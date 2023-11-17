package com.javaforall.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grape");
		fruits.add("orange");
		fruits.add("melon");
		
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		
		System.out.println("########");
		Collections.sort(fruits);
		
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(1);
		numList.add(3);
		numList.add(4);
		
		for(int i=0;i<numList.size();i++) {
			System.out.println(numList.get(i));
		}
	}

}

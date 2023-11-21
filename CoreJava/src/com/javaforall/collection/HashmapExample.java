package com.javaforall.collection;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {

		Map<Integer,String> hashMap =new HashMap<>();
		
		hashMap.put(1,"Apple"); // hashcode - hash (key) - 0011223222 - index = hash &(n-1) - 2
		hashMap.put(2,"Banana");
		hashMap.put(3, "Orange");
		hashMap.put(4, "grape"); // hashcode 00112223222 - -2 
		
		for(Map.Entry m: hashMap.entrySet()) {
			System.out.println(m.getKey() + "--"+m.getValue());
		}
		
	}

}

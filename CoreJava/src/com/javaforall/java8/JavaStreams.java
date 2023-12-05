package com.javaforall.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {

		// Streams
		// a part of it 
		// by using Of() - by using stream()
		
		Stream<String> namesStream = Stream.of("John","David","Sam","Morgan","Joy");
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(5);
		numberList.add(9);
		numberList.add(10);
		numberList.add(3);
		
		Stream<Integer> numberStream = numberList.stream();
				
		// Once we create the stream - stream is ready
		// 2 Different categories of operators can be applied on the streams.
		// 1. Intermediate operations
		// Terminal OPerations
		
		// 1. forEach()
		
		/*
		 * namesStream.forEach(System.out::println);
		 * 
		 * numberStream.forEach(n -> System.out.println(n));
		 */
		
		// Intermediate Operations -  filter, map, flatmap, limit, peek, sorted, skp, distinct
		// Terminal Operations - toArray, forEach, collect, min, max, count, match, anyMatch
		
		// Aggregate functions - count, min, max 
		
		// collect  - employees with age greater than 50 .
		
		// map () - 
		
		
		  List<String> uppcaseNames =
		  
		  namesStream.map(s->s.toUpperCase()).collect(Collectors.toList());
		  
		  System.out.println("#### Result ######");
		  
		  uppcaseNames.forEach(s->System.out.println(s));
		 
		
	}

}

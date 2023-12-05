package com.javaforall.java8;

import java.util.function.BiFunction;

public class Calculator {
	
	/*
	 * public Integer add(Integer a, Integer b) { return a+b; }
	 */
	
	CalculatorInterface add = (a,b) -> a+b;
	
	BiFunction<Integer, Integer, Integer> sub = (a,b) -> a-b;
	
	BiFunction<Integer, Integer, Integer> mul = (a,b) -> a*b;
	

}

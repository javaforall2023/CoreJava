package com.javaforall.java8;

import java.util.function.DoubleUnaryOperator;

public class CalculatorService {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		Integer addRes = calc.add.perform(10, 20);
		System.out.println("Addition:"+addRes);
		
		Integer subRes = calc.sub.apply(20, 10);
		System.out.println("Subtraction:"+subRes);
		
		Integer mulRes = calc.mul.apply(20, 10);
		System.out.println("Multiplication:"+mulRes);
		
		
		DoubleUnaryOperator sqrt = Math::sqrt;
		//System.out::print
		
		double result = sqrt.applyAsDouble(25);
		
		System.out.println(result);
	}
	

}


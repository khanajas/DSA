package com.ajas.functions;


import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	
	 private final static Function<Integer,Integer> increamentByOne = number -> number+1;
	 
	 private final static BiFunction<Integer, Integer, Integer> multiply = 
		 (number,multiplyby) -> number * multiplyby;

	
	public static void main(String[] args) {
		
		int increament = increament(1);
		System.out.println(increament);
		Integer apply = increamentByOne.apply(99);
		Integer apply2 = increamentByOne.apply(949);
		System.out.println(apply);
		System.out.println(apply2);
		
		Integer apply3 = multiply.apply(10,2);
		System.out.println(apply3);
	
	}
	
	static int increament(int number) {
		return number+1;
	}
}

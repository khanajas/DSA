package com.ajas.methodReferences;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	
	public static void main(String[] args) {
		
		Integer inte[] = {2,3,3,3,4,5,6};
		
		MethodReference m = new MethodReference();
		
		List<Integer> listOfInt = Arrays.asList(inte);
		listOfInt.stream().forEach(m::printInstance);
		

		
	}
	
	static void print(Integer number) {
		System.out.println(number);
	}
	
	
	void printInstance(Integer number) {
		System.out.println(number);
	}

}

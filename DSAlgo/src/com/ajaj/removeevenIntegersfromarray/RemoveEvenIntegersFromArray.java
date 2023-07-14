package com.ajaj.removeevenIntegersfromarray;

import java.util.Iterator;

public class RemoveEvenIntegersFromArray {
	
	public static void main(String[] args) {
		
		int[] array = {2,3,4,5,6,7};
		//removeEvenIntegersFromArray(array);
		//removeEvenIntegersFromArrayy(array);
		removeEvenIntegersFromArray2();
	}
	
	//get size of odd elements by below formula and create new array with odd elements size
	// take temp varable to track index insert those odd elements into newly created array 
	
	public static void removeEvenIntegersFromArray(int[] array) {
		
		int oddSize = 0;
		
		for( int i=0; i<array.length; i++) {
			if(array[i]%2 !=0) {
				oddSize++;
			}
		}
		
		int[] result = new int[oddSize];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] % 2 != 0) {
				result[index]=array[i];
				System.out.println(array[i]);
				index++;
			}
			
		}
		
	//	System.out.println(oddSize);
		System.out.println(result);
	}
	
	
	public static void removeEvenIntegersFromArrayy(int[] array) {
	
		int oddsize =0;
		for (int i=0; i < array.length; i++) {
			if(array[i]%2 != 0) {
				oddsize++;
			}
		}
		
		int[] result = new int[oddsize];
		int index = 0;
		
		for (int i=0; i<array.length ; i++) {
			
			if(array[i]%2 !=0) {
				result[index] = array[i];
				index++;
			}
			
		}
		
	}
	
	
	public static void removeEvenIntegersFromArray2() {
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		int oddElemSize = 0;
		for (int i =0; i< array.length; i++) {
			if(array[i] % 2 != 0) {
				oddElemSize++;
			}
		}
		
		
		int[] results = new int[oddElemSize];
		int index = 0;
		
		for (int i =0; i< array.length; i++) {
			if(array[i] % 2 != 0) {
				results[index] =  array[i];
				index++;
			}
		}
		
	}

}

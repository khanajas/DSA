package com.ajas.findminmuminarray;

public class FindMinimumInArray {
	
	public static void main(String[] args) {
		int [] array = {5,1,9,15,34};
		
		int findMinimumInArray = findMinimumInArray(array);
		System.out.println(findMinimumInArray);
		
	}

	private static int findMinimumInArray(int[] array) {
		
		int min = array[0];
		
		for(int i = 1; i<array.length;i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
		
	}

}

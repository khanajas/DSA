package com.ajas.findminmuminarray;

public class FindMinimum {
	public static void main(String[] args) {
		int[] elements = {2,3,4,1,6,0};
		
		int findMinimum = findMinimum(elements);
		System.out.println(findMinimum);

	}

	private static int findMinimum(int[] elements) {
		
		int min = elements[0];	
		for (int i : elements) {
			if(i < min) {
				min = i;
			}
		}
		
		return min;
		
	}
	
}

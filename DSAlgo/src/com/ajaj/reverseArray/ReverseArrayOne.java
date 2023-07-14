package com.ajaj.reverseArray;

public class ReverseArrayOne {
	
	public static void main(String[] args) {
		int[] elements = {1,2,4,5,6,7};
	
		int[] reverseArray = reverseArray(elements);
		printArray(reverseArray);
	}

	private static int[] reverseArray(int[] elements) {
		int start = 0;
		int end = elements.length-1;
		
		while(start < end) {
			int temp = elements[start];
			elements[start] = elements[end];
			elements[end] = temp;
			start++;
			end--;
		}
		return elements;
	}
	
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i);
		}
	}

}

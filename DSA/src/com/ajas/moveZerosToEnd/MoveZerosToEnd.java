package com.ajas.moveZerosToEnd;


public class MoveZerosToEnd {
	
	public static void main(String[] args) {
		int[] array = {1,2,0,4,0,5,0,9,6}; 
		int[] moveZerosToEnd = moveZerosToEnd(array);
		printArray(moveZerosToEnd);
	}

	private static int[] moveZerosToEnd(int[] array) {
		int j = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] != 0 && array[j] == 0) {
				int temp = array[i];
				array[i]= array[j];
				array[j]=temp;
				
				
			}
			
			if(array[j] != 0) {
				j++;
			}
		}
		return array;
	}
	
	
	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+ " ");
		}
		System.out.println();
	}

}

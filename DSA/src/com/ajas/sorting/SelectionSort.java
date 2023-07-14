package com.ajas.sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
	
		
		SelectionSort s = new SelectionSort();
	
		int[] array = {7,8,9,6,5,1,2,3};
		SelectionSort.selectionSort(array);
		/*
		 * for (int i : array) { System.out.println(i); }
		 */
		SelectionSort.selectionSorts();
	}
	
	public static void selectionSort(int[] array) {
		for(int i = 0; i<array.length-1; i++) {
			
			int min = i;
			for(int j = i+1; j<array.length; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
			
		}
	}
	
	
	
	public static void selectionSorts() {
		int[] array = {1,9,8,7,4,2,3,6};
		
		
		for(int i=0; i< array.length; i++) {
			int min = i;
			
			for(int j = i+1; j< array.length; j++) {	
				if(array[j] < array[min] ) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		
		}
		
		
		for (int j : array) {
			System.out.println(j);
		}	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

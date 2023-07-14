package com.ajas.sorting;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] array = {8,3,9,2,1,4,5};
		InsertionSort.insertionSort(array);
		InsertionSort.insertionSort();
	
		
	}
	
	public static void insertionSort(int[] array) {
		//1st iteration 3892145 temp = 8 i=1 j=0
		//2nd iteration 38 92145 temp = 9 i=2 j=1
		//3rd iteration 389 2145 temp = 2  i =3 j= 2
		             // 389 9145 i =3 j=j-1=1
					//  388 9145  i =3 j=0
					//  338 9145  i=3 j=-1
					//while loop false array[j(-1)+1=0] = temp 2389145
		for(int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			
			while(j>=0 && array[j] > temp) {
				array[j+1] = array[j];
				j =  j - 1;
			}
			array[j+1] = temp;
			
		}
	}
	
	
	
	public static void insertionSort() {
		int[] array = {1,9,8,7,4,2,3,6};
		
		for (int i = 1; i < array.length ; i++) {
			int temp = array[i];
			
			int j = i-1;
			
			while(j>=0 && array[j] > temp) {
				array[j+1] = array[j];
				j = j - 1;
			}
			
			array[j+1] = temp;
		}
		for (int i : array) {
			System.out.println(i);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

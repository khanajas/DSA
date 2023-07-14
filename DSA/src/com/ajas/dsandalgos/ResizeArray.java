package com.ajas.dsandalgos;

public class ResizeArray {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		for (int i : array) {
		System.out.print(i);
		}
		System.out.println("");
		System.out.println("Length before resize "+array.length);
		int[] resizeArray = resizeArray(array, 10);
		
		for (int i : resizeArray) {
			System.out.print(i);
		}
		System.out.println("");
		System.out.println("Length after resize "+resizeArray.length);
	}
	
	public static int[] resizeArray(int[] array, int capacity){
		
		int[] temp = new int[capacity];
		
		for(int i=0; i<array.length; i++) {
			temp[i]=array[i];
		}
		
		return temp;
		
	}

}

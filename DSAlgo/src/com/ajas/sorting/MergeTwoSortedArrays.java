package com.ajas.sorting;

public class MergeTwoSortedArrays {
	
	public static void main(String[] args) {
		MergeTwoSortedArrays.mergeTwoSortedArrays();
	}
	
	
	public static void mergeTwoSortedArrays() {
		
		int[] arrOne = {1,2,3,4,5,6};
		int[] arrTwo = {7,8,9};
		
		int i = 0;
		int j = 0;
		int k = 0;
		int[] newArray = new int[arrOne.length+arrTwo.length];
		
		while(i < arrOne.length  && j < arrTwo.length) {
			if(arrOne[i] < arrTwo[j]) {
				newArray[k] = arrOne[i];
				i++;
			}else {
				newArray[k] = arrTwo[j];
				j++;
			}
			k++;
		}

		while(i < arrOne.length) {
			newArray[k] = arrOne[i];
			i++;
			k++;
		}
	
		while(j < arrTwo.length) {
			newArray[k] = arrTwo[j];
			j++;
			k++;
		}
		
		for (int l : newArray) {
			System.out.println(l);
		}
		
		
	}

}

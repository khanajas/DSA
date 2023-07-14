package com.ajas.dsandalgos;

public class FindMissingNumberInArray {
	
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,4,5,3,7};
		findMissingNumber(arr);
	}
	
	public static void findMissingNumber(int[] array) {
		
		int n = array.length+1;
		
		int sum = n*(n+1)/2;
				
		for (int i : array) {
			sum = sum - i;
		}
		
		System.out.println(sum);
		
	}

}

package com.ajaj.findsecondmax;

import java.util.function.Consumer;

public class FindSecondMax {
	
	public static void main(String[] args) {
		int[] array = {2,45,34,1,5,7,8,6};
	
		int findSecondMax = findSecondMax(array);
		//findSecondMaxx(array);
		System.out.println(findSecondMax);
	}

	private static int findSecondMax(int[] array) {
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i] > max) {
				secondMax = max;
				max = array[i];
			}else if (array[i] > secondMax && array[i]!= max){
				secondMax = array[i];
				
			}
			
		}
		
		return secondMax;
		
		
	}
	
	
	public static void findSecondMaxx(int[] array) {
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		
		for( int i=0 ; i< array.length;i++) {
			if(array[i] > max) {
				secondMax = max;
				max = array[i];
				
			}else if(array[i]> secondMax && array[i] != max){
				
				secondMax = array[i];
				
			}
			
			
		}
		
		System.out.println(secondMax);
	}

}

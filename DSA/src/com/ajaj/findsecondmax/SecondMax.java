package com.ajaj.findsecondmax;

public class SecondMax {
	
	public static void main(String[] args) {
	int[] elements = {2,3,4,5,1,6,0};
		
		int secondMax = secondMax(elements);
		System.out.println(secondMax);

	}

	private static int secondMax(int[] elements) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for (int i : elements) {
			if(i > max) {
				secondMax = max;
				max = i;
				
			}else if(i > secondMax && i != max ) {
				secondMax = i;
			}
			
			
		}
		
		return secondMax;
	}

}

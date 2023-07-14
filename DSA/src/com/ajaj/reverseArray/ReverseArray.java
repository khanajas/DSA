package com.ajaj.reverseArray;

public class ReverseArray {
	
	public static void main(String[] args) {
	
		int[] array = {1,2,3,4,5}; 
		reverseArray(array,0,array.length-1);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		String name = "Ajas Khan";
		reverseString(name.toCharArray(), 0, name.toCharArray().length-1);
		
	}

	// To reverse take start index and end index 
	// in while loop traverse through start is not less than end in true conditions swap elements 
	//and increment start decrement end 
	private static void reverseArray(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		
		while(start < end) {
			int temp = array[start];
			array[start]=array[end];
			array[end]= temp;
			start++;
			end--;
			 
		}
		
	}
	
	public static void reverseString(char[] charArray, int start, int end) {
		
		while(start < end) {
			char temp = charArray[start];
			charArray[start] =  charArray[end];
			charArray[end] = temp;
			start++;
			end--;
			
		}
		for (char c : charArray) {
			System.out.print(c);
		}
	}
	

}

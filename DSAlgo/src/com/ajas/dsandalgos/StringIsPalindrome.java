package com.ajas.dsandalgos;

public class StringIsPalindrome {
	
	public static void main(String[] args) {
		String madam = "madam";
		String that = "that";
		
		boolean stringIsPalindrome = stringIsPalindrome(madam);
		System.out.println(stringIsPalindrome);
	}

	private static boolean stringIsPalindrome(String madam) {
		// TODO Auto-generated method stub
		
		char[] charArray = madam.toCharArray();
	//	System.out.println(charArray.toString());
		int start = 0;
		int end = charArray.length-1;
		
		while (start < end) {
			
			if(charArray[start] != charArray[end]) {
				return false;
				
			}
			start++;
			end--;
		}
		
		
		return true;
		
	}

}

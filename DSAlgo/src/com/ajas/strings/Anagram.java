package com.ajas.strings;

import java.util.Iterator;

public class Anagram {
	
	public static void main(String[] args) {
		System.out.println(isAnagram("ajasq","qjaas")); 
	}

	private static boolean isAnagram(String string, String string2) {
		int[] char_at = new int[256];
		
		for(int i=0; i<string.length(); i++) {
			char_at[string.charAt(i)]++;
			char_at[string2.charAt(i)]--;
			
		}
		
		for (int i = 0; i < char_at.length; i++) {
			if(char_at[i] != 0) {
				return false;
			}
		}
		return true;
	}
	

}

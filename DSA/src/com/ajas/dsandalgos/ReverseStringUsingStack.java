package com.ajas.dsandalgos;

import java.util.Stack;

public class ReverseStringUsingStack {
	public static void main(String[] args) {
		
		ReverseStringUsingStack s =  new ReverseStringUsingStack();
		s.reverseString("Ajas");
		
		
	}
	
	public String reverseString(String key) {
		Stack<Character> stack = new Stack();
		char[] charArray = key.toCharArray();
		for (char c : charArray) {
			stack.push(c);
		}
		
		for (int i = 0; i<key.length();i++) {
			charArray[i]=stack.pop();
		}
		
		System.out.println(new String(charArray));
		return null;
		
	}

}

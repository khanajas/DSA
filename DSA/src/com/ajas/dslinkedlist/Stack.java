package com.ajas.dslinkedlist;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack {
	
	private ListNode top;
	int length = 0;
	

	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(33);
		
		s.pringElements();
		System.out.println("Length is "+s.length);
		s.pop();
		s.pringElements();
		System.out.println("Length is "+s.length);
		System.out.println(s.peek());
	}
	
	public void pringElements() {
		ListNode temp = top;
		if (temp == null) {
			throw new NoSuchElementException();
		}
		while(temp != null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("null");
	
	}
	public void push(int data) {
		ListNode node = new ListNode(data);
		if (top == null) {
			top = node;
		}else {
			node.next = top;
			top = node;
		}
		length++;
	}
	
	public void pop() {
		if(top == null) {
			throw new EmptyStackException();
		}else {
			top = top.next;
			length--;
		}
	}
	
	public int peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	

	public static class ListNode{
		public int data;
		public ListNode next;
		
		ListNode (int data){
			this.data = data;
		}
	}

}

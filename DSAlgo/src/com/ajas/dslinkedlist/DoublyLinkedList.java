package com.ajas.dslinkedlist;

import java.util.LinkedList;
import java.util.List;

public class DoublyLinkedList {
	
	ListNode head;
	ListNode tail;
	int length;
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public static void main(String[] args) {
		List<String> l = new LinkedList<>();
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertBegining(33);
	//list.deleteFirstNode();
		
		list.displayForward();
		list.displayBackward();
		
	
		
	
		
	}
	
	
	public void displayForward() {
		ListNode current = head;
		
		while(current != null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("");
	}
	
	public void displayBackward() {
		ListNode current = tail;
		
		while(current != null) {
			System.out.print(current.data+"-->");
			current = current.previous;
		}
	}
	
	
	public void insertBegining(int data) {
		ListNode node = new ListNode(data);
		
		if(isEmpty()) {
			head = node;
		}else {
			head.previous = node;
		}
		
		node.next = head;
		head = node;
	}
	
	public void insertLast(int data) {
		ListNode  node = new ListNode(data);
		
		if(isEmpty()) {
			head = node;
		}else {
			tail.next = node;
		} 
		
		node.previous = tail;
		tail = node;
		length ++;
	}
	
	public void deleteFirstNode() {
		ListNode temp = head;
		
		if(tail == head) {
			tail= null;
		}else {
			temp.next.previous = null;
			
		}
		
		head = head.next;
		
		temp.next = null;
		
		
		
	}
	
	public void deleteLastNode() {
		ListNode temp = tail;
		
		if (temp == head) {
			tail = null;
		}else {
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
	}
	
	
	public boolean isEmpty() {
		return this.length == 0;
	}
	
	
	public int length() {
		return this.length;
	}
	private static class ListNode{
		
		int data;
		ListNode previous;
		ListNode next;
		
		public ListNode(int data){
			this.data = data;
		}
	}

}

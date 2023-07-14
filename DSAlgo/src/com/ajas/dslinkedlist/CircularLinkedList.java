package com.ajas.dslinkedlist;

public class CircularLinkedList {
	
	private ListNode last;
	private int length;
	
	public CircularLinkedList() {
		this.last = null;
		this.length = 0;
	}

	
	public static void main(String[] args) {
		
		CircularLinkedList list = new CircularLinkedList();
		list.createCircularList();
		list.printElements();
		list.insertAtLast(3);
		list.printElements();
		list.insertAtfirst(33333);
		list.printElements();
		list.removeFirstNode();
		list.printElements();
	}
	
	public void createCircularList() {
		ListNode first = new ListNode(12);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(22);
		ListNode fourth = new ListNode(312);
		ListNode fifth = new ListNode(125);
		
		first.next = second;
		second.next=third;
		third.next = fourth;
		fourth.next= fifth;
		fifth.next = first;
		
		last = fifth;
	}
	
	public void printElements() {
		if(last == null) {
			return;
		}
		ListNode first = last.next;
		
		while (last != first) {
			System.out.print(first.data+"-->");
			first = first.next;
		}
		System.out.println(first.data+"-->");
		
	}
	
	
	public void insertAtLast(int value) {
		ListNode node = new ListNode(value);
		if(last == null) {
			last = node;
			last.next = node;
		}
		else {
			
			node.next =last.next;
		}
		last.next = node;
		last = node;
	}
	
	public void insertAtfirst(int value) {
		ListNode node = new ListNode(value);
		if(last == null) {
			last = node;
		}
		else {
			
			node.next =last.next;
		}
		last.next = node;
		
	}
	
	public void removeFirstNode() {
		

		ListNode temp = last.next;
		if (last.next == last) {
			last = null;
		}else {
			last.next = temp.next;
		}
		temp.next = null;
	}
	
	
	public static class ListNode{
		ListNode next;
		int data;
		
		ListNode(int data){
			this.data = data;
		}
	}
	
}

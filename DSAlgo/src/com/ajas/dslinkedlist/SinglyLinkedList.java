package com.ajas.dslinkedlist;



public class SinglyLinkedList {

	private static class ListNode{
		
		private int data;
		
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private ListNode head;
	
	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		
		sl.head = new ListNode(1);
		
		ListNode second = new ListNode(11);
		ListNode third = new ListNode(22);
		ListNode fourth = new ListNode(33);
		ListNode fifth = new ListNode(43);
		
		
		//Now we will connect them to form a chain
		sl.head.next = second; //10-->1
		second.next = third;  //10-->1-->11
		third.next = fourth;  //10-->1-->11-->31
		fourth.next = fifth;  //10-->1-->11-->31-->16-->null
		
		
		
		
		sl.printElements();
		int findLengthOfSingList = sl.length();
		System.out.println("Length of list is "+findLengthOfSingList);
		
		//sl.insertAtBegining(65);
		//sl.printElements();
		
//		sl.insertAtEnd(121);
//		sl.printElements();
//		
//		sl.insertAtGivenPosition(334, 4);
//		sl.insertAtGivenPosition(222, 4);
//		sl.printElements();
//		
//		
//		sl.deletefirst();
//		sl.printElements();
//		
//		sl.deleteLastNode();
//		sl.printElements();
//		
//		sl.delete(3);
//		sl.printElements();
		
		sl.printElements();
		
//		ListNode reverseSinglyLinkedList = sl.reverseSinglyLinkedList();
//		sl.display(reverseSinglyLinkedList);
		
		//System.out.println(reverseSinglyLinkedList);
		
//		ListNode findMiddleNode = sl.findMiddleNode();
//		System.out.println(findMiddleNode.data);
	//	sl.removeduplicateInSortedList();
	//	sl.printElements();
//		sl.insertNodeInSortedList(12);
	//	sl.removeKey(11);
//		sl.printElements();
	}
	
	
	
	
	//print elements in singly linked list
	
	public void display(ListNode node) {
		while(node != null) {
			System.out.print(node.data+"-->");
			node = node.next;
		}
	}
	public void printElements() {
		ListNode current = head;
		
		while(current != null) {
			System.out.print(current.data+" ---> ");
			current = current.next;
		}
		System.out.println("");
	}
	
	
	public int length() {
		if(head == null) {
			return 0;
		}
		
		int count = 0;
		ListNode current = head;
		
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void insertAtBegining(int value) {
		ListNode node = new ListNode(value);
		node.next = head;
		head = node;
		
	}
	
	public void insertAtEnd(int value) {
		ListNode newNode = new ListNode(value);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		ListNode current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;
	
	}
	
	public void insertAtGivenPosition(int value ,int position) {
		ListNode listnode = new ListNode(value);
		if (position == 1) {
			listnode.next = head;
			head = listnode;
			return;
		}
		
		ListNode previous = head;
		int count = 1;
		while(count < position-1) {
			count++;
			previous = previous.next;
		}
		
		ListNode current = previous.next;
		listnode.next = current;
		previous.next = listnode;
		
	}
	
	
	
	public ListNode deletefirst() {
		if(head == null) {
			return null;
		}

		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	public ListNode deleteLastNode() {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
		
	}
	
	
	public ListNode delete(int position) {
		
		if(position == 1) {
			head = head.next;
		}else {
			ListNode current = head;
			
			int count = 1;
			while(count < position-1) {
				current = current.next;
				count ++;
			}
			
			ListNode previous = current.next;
			current.next = previous.next;
			return previous;
			
		}
		
		
		return null;
		
	}
	
	
	public boolean find(int key) {
		ListNode current = head;
		
		while(current != null) {
			if(current.data == key) {
				return true;
			}
			current = current.next;
		}
		
		return false;
	}
	
	public ListNode reverseSinglyLinkedList() {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public ListNode findMiddleNode() {
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		
		while (fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return slowPointer;
	}
	
	public void removeduplicateInSortedList() {
		ListNode current = head;
		
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
			
		}
		
	}
	
	public void insertNodeInSortedList(int value) {
		ListNode newNode = new ListNode(value);
		ListNode current = head;
		ListNode temp = null;
		
		while(current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		
		newNode.next = current;
		temp.next = newNode;
	}
	
	public void removeKey(int key) {
		ListNode current = head;
		ListNode temp =null;
		
		while(current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		
		if(current == null)
			return;
		temp.next = current.next;
	}
	
	
	public boolean findLoop() {
		ListNode fastPointer = head;
		ListNode slowPointer = head;
		
		while(fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (slowPointer == fastPointer) {
				return true;
			}
		}
		
		return false;
	}

	public void findStartingOfLoop() {
		ListNode fastPointer = head;
		ListNode slowPointer = head;
		
		while(fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (slowPointer == fastPointer) {
				getStartingNode(slowPointer);
			}
		}
		
	}




	private ListNode getStartingNode(ListNode slowPointer) {
		// TODO Auto-generated method stub
		
		ListNode temp = head;
		
		while (slowPointer != temp) {
			temp = temp.next;
			slowPointer = slowPointer.next;
		}
		
		return temp;
		
	}
	
	public void removeLoop(ListNode slowPointer) {
		ListNode temp = head;
		
		while(slowPointer.next != temp.next) {
			temp = temp.next;
			slowPointer = slowPointer.next;
		}
		
		slowPointer.next = null;
	}
}

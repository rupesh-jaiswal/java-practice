package com.linkedlist;

public class CountingLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hellow World");
		Node head = new Node(1);
		Node a = new Node(2);
		head.next=a;
		a.next = new Node(3);
		a.next.next = new Node(4);
		System.out.println("length of linked list : "+ calculatelengthRecursion(head,0));
	}
	public static int calculatelength(Node node) {
		int count =0;
		do {
			
			System.out.println(node.data);
			node=node.next;
			count++;
		}while(node!=null);
		return count;
	}
	
	public static int calculatelengthRecursion(Node head, int count) {
		if(head !=null) {
			System.out.println(head.data);
			return calculatelengthRecursion(head.next, ++count);
		} else {
			return count;
		}
	}

}

package com.bridgelabz.week2;



public class LinkedList
{
	Node head;
class Node
{
int data;
Node next;
Node(int d)
{
	data=d;
	next=null;
}
}

public void printList()
{
	Node n=head;
	while(n!=null)
	{
		System.out.println(n.data+" ");
		n=n.next;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll=new LinkedList();
ll.head=new Node(1);
	}

}

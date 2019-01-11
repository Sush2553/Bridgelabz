package com.bridgelabz.SearchingAndSorting;
public class LinkedListExample {

	Node head;

	public void insert(int data)
	{
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		if(head==null)
		{
			head=newNode;
			
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newNode;
		}
	}
	
	public void display()
	{
		Node n=head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
System.out.println(n.data);
	}
	
	
}

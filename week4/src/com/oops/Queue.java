package com.oops;

@SuppressWarnings({"rawtypes","unchecked","hiding"})
/**
 * @author Sushant Patwari
 * @purpose To implement queue operations
 */
public class Queue<T> 
{
	Node head;
	int length = 0;
	class Node<T>
	{
		T data1;
		T data2;
		T data3;
		Node next;
		 Node(T data1,T data2,T data3)
		{
			this.data1 = data1;
			this.data2 = data2;
			this.data3 = data3;
			next = null;
		}
		
	}
	

//add element in queue

public Node enque(T data1,T data2,T data3)
{
	
	Node new_node = new Node(data1,data2,data3);  //create new node
	Node temp = head;
	if(head == null)  // if no element present in queue new node will be head
	{
		head = new_node;
		length++;
		return head;
	}
	while(temp.next != null) // traverse till last node
	{
		temp = temp.next;
	}
	temp.next = new_node; // add element after present element
	length++;
	new_node.next = null;
	return head;
}

//remove first in element

public void deque(T data1)
{
Node temp = head;
Node prev = temp;
if(((T)temp.data1).equals(data1)) // if head contain data
{ 
	head=temp.next;//change head to next
	length--;
	return;
}
while(temp.next != null )  //traverse till last
{
	prev = temp;
	temp =temp.next; //increment
	if(((T)temp.data1).equals(data1)) //compare data
	{
		prev.next = temp.next;
		length--;
		return;
	}
}

}

//check queue is empty or not

public boolean isEmpty()
{
	return(length == 0);
}

//find size 
public int size()
{
	return length;
}

//return first element from queue

public <T>T topElement()
{
	return (T)head.data1;
}

//print queue
public void display()
{
	Node new_node = head;
	int size = size();
	if(size==0)
		System.out.println("no data found...please add first..");
	else {
	for(int i = 0 ; i <size;i++)  //traverse till last
	{
		System.out.println("   "+new_node.data1+"\t  "+new_node.data2+"\t  "+new_node.data3);
		new_node = new_node.next;
	}
	
	}
	return;
}

//get element at perticular position
public <T>T get(int position)
{
	Node new_node = head;
	int count = 1;
	if(position == 1)  //if position is 1,return head data
	{
		return (T) new_node.data1;
	}
	T element;
		while(new_node.next != null)  //to traverse till last
		{
		new_node = 	new_node.next;
		count++;
		if(count == position)   //when reached that position,return data
		{
			element = (T)new_node.data1;
			return (T) element;
		}
		}
	return null ;
}


public int deque1()
{
	Node temp=head;
	if(length == 0)  //if queue is empty
	{
		System.out.println("No element present in List");
		return 0;
	}
	head = head.next;  //else shift head to next node
	length--;
	return (int) temp.data1;
	
}
}

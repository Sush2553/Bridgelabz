package com.orderedlist;

@SuppressWarnings({"hiding","rawtypes","unchecked"})
/**
 * @author Sushant Patwari
 * @purpose define methods for linked list
 */

public class OrderList<T> 
{
	
	Node head;
	int length = 0;

public class Node<T>  //node class
{
	T data;  //node data
	
	Node next;  //referencre
	public Node(T data)
	{
		this.data = data;
		this.next = null; 
	}
	
}


//add node , sort it

public <T extends Comparable<T>> void add(T data)
{
	
	Node new_node = new Node(data);
	Node temp = head;
	Node prev = temp;
	if(head == null)   //check if list is empty
	{
		head = new_node;  //new node will be head
		length++;
		return;
	}
	 if(((T)head.data).compareTo(data)>0)   // check if head data is greater than input
	{
		new_node.next = head;   
		head = new_node;  //if yes new node will be head
		length++;
		return;
	}
	while(temp.next != null)
	{
		prev = temp;
		temp = temp.next;
		
		if(((T)temp.data).compareTo(data)>0)  // check if temp node's data is greater than input
		{
			prev.next =new_node;  //if yes,new nodes reference will store in previous node of current node
			new_node.next =temp;  //current nodes reference will be stored in new node
			length++;
			return;
		}
	}
	if(temp.next == null )  //to add at last position
	{
		temp.next = new_node;
		length++;
	}
	
}

//remove data element

public void remove(T data)
{
Node temp = head;
Node prev = temp;
if(((T)temp.data).equals(data)) // if head contain data
{ 
	head=temp.next;//change head to next
	length--;
	return;
}
while(temp.next != null )  //traverse till last
{
	prev = temp;
	temp =temp.next; //increment
	if(((T)temp.data).equals(data)) //compare data
	{
		prev.next = temp.next;
		length--;
		return;
	}
}

}



//search data 
	public int search(T data)
	{
		int count  = 1 ;
		Node temp = head;
		if(head.data==(data))  //compare with head data
			return count;
	
	  	while(temp.next != null)
		{   //travels nodes and compare node data with user input
			temp = temp.next;
			count++;
			if(temp.data == (data))  //if data matches with input,return position
			{
				return count;
			}
		}
		
		return -1;  
	}

//print linkedlist
	public void display()
	{
		System.out.println("\nyour linked list is:");
		Node n = head;
		while(n.next!=null)  //traverse till last
		{
		System.out.print(n.data+" ");  //print data of node
		n=n.next;
		}
		System.out.print(n.data);  //to print data of last node
		return;
	}
	
	


//check linkedlist is empty or not
		
		public boolean isEmpty()
		{
			return(length == 0);
		}

//find length
		public int size()
		{
			return length;
		}

//get element at particular position
		public <T>T get(int position)
		{
			Node new_node = head;
			int count = 1;
			if(position == 1)  //if 1,return head node's data
			{
				return (T) new_node.data;
			}
			T element;
				while(new_node.next != null) //traverse list
				{
				new_node = 	new_node.next;
				count++;
				if(count == position)  //traverse till position and return data
				{
					element =  (T) new_node.data;
					return element;
				}
				}
			return null ;
		}
}



  


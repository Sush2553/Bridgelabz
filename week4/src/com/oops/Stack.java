package com.oops;

@SuppressWarnings({ "rawtypes", "unchecked", "hiding" })
/**
 * @author Sushant Patwari
 * @purpose To define stack operations
 */
public class Stack<T> {

	Node head;

	int top = -1;

	static class Node<T> {
		T data1;
		T data2;
		T data3;
		Node next;

		Node(T data1, T data2, T data3) {
			this.data1 = data1;
			this.data2 = data2;
			this.data3 = data3;
			next = null;
		}
	}

	// push element in stack
	public void push(T data1, T data2, T data3) {
		Node new_node = new Node(data1, data2, data3);
		Node temp = head;
		if (head == null) {
			head = new_node;
			top++;
			return;
		}

		while (temp.next != null) {

			temp = temp.next;
		}
		top++;
		temp.next = new_node;
		new_node.next = null;
	}

	// check my stack is empty or not
	public boolean isEmpty() {
		return (head == null);
	}

	// pop stack element
	public String pop() {
		Node current = head;
		for(int i=0;i<top;i++) {
		current= current.next;
		}
		current.next=null;
		top--;
		return (String) current.data1;
	}

	// check size of stack
	public int size() {
		return top;
	}

	// print stack
	public void display() {
		int size = size();
		Node current = head;
		if (size == -1)
			System.out.println("data not found..");
		else {
			for (int i = 0; i <= size; i++) {
				System.out.println(current.data1 + " \t" + current.data2 + " \t" + current.data3 + " ");
				current = current.next;
			}
		}
	}

	// return top element of stack
	public <T> T peek() {
		if (head.data1 == null) {
			System.out.println("no element present");
			return null;
		}
		return (T) head.data1;
	}

}

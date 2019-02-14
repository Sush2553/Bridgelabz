package com.oops;

import com.utility.Utility;

/**
 * @author Sushant Patwari
 * @since  12/02/2019
 * @aim To store purchased symbol unto the stack using linked list
 */
public class StoreSymbolPurchasedInStack {
	public static void main(String args[]) {
		String companyName;
		String symbol;
		String value;
		Stack<String> stack = new Stack<>(); //create object of stack class
		while (true) {
			System.out.println("\n1. Buy symbol\n2. Sell symbol\n3. display data\n");
			System.out.println("enter your choice:");
			int choice = Utility.getInt(); //get users choice
			switch (choice) {
			case 1:
				System.out.println("enter company name:");
				companyName = Utility.getString();
				System.out.println("enter symbol:");
				symbol = Utility.getString();
				System.out.println("enter price:");
				value = Utility.getString();
				stack.push(companyName,symbol,value); //push data into the stack
				System.out.println("buyed.........");
				break;
			case 2:
				stack.pop();
				System.out.println("selled.....");  //pop data from stack
				break;
			case 3:
				System.out.println("company\tsymbol\tvalue");
				stack.display();  //display data from the stack
				break;
			default:
				System.out.println("invalid choice");
			}
		}
	}
}

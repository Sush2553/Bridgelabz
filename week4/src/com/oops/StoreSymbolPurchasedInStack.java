package com.oops;

import com.utility.Utility;

public class StoreSymbolPurchasedInStack {
	public static void main(String args[]) {
		String companyName;
		String symbol;
		String value;
		Stack<String> stack = new Stack<>();
		while (true) {
			System.out.println("\n1. Buy symbol\n2. Sell symbol\n3. display data\n");
			System.out.println("enter your choice:");
			int choice = Utility.getInt();
			switch (choice) {
			case 1:
				System.out.println("enter company name:");
				companyName = Utility.getString();
				System.out.println("enter symbol:");
				symbol = Utility.getString();
				System.out.println("enter price:");
				value = Utility.getString();
				stack.push(companyName,symbol,value);
				System.out.println("buyed.........");
				break;
			case 2:
				stack.pop();
				System.out.println("selled.....");
				break;
			case 3:
				System.out.println("company\tsymbol\tvalue");
				stack.display();
				break;
			default:
				System.out.println("invalid choice");
			}
		}
	}
}

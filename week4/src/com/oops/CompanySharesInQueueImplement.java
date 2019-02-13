package com.oops;

import com.utility.Utility;

public class CompanySharesInQueueImplement {
	public static void main(String args[]) {
		String companyName;
		String noOfShares;
		String shareValue;
		Queue<String> queue = new Queue<>();
		while (true) {
			System.out.println("\n1. add new company shares\n2. delete company shares\n3. display data\n");
			System.out.println("enter your choice:");
			int choice = Utility.getInt();
			switch (choice) {
			case 1:
				System.out.println("enter company name:");
				companyName = Utility.getString();
				System.out.println("enter no of shares:");
				noOfShares = Utility.getString();
				System.out.println("enter share price:");
				shareValue = Utility.getString();
				queue.enque(companyName,noOfShares,shareValue);
				System.out.println("data added successfully.........");
				break;
			case 2:
				System.out.println("enter company name:");
				companyName=Utility.getString();
				queue.deque(companyName);
				System.out.println("data deleted.....");
				break;
			case 3:
				System.out.println("company name\t total shares\t share value");
				queue.display();
				break;
			default:
				System.out.println("invalid choice");
			}
		}
	}
}

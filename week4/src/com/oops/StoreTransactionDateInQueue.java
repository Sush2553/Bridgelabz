package com.oops;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.utility.Utility;

public class StoreTransactionDateInQueue {
	public static void main(String args[]) {
		String companyName;
		String symbol;
	
		Queue<String> queue = new Queue<>();
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
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
				   LocalDateTime now = LocalDateTime.now();  
				   String date=(dtf.format(now));  
				queue.enque(companyName,symbol,date);
				System.out.println("buyed.........");
				break;
			case 2:
				System.out.println("enter company name:");
				String name=Utility.getString();
				queue.deque(name);
				System.out.println("selled.....");
				break;
			case 3:
				System.out.println("company\t symbol\t date of transaction");
				queue.display();
				break;
			default:
				System.out.println("invalid choice");
			}
		}
	}
}

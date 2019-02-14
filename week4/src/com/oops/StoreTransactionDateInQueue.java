package com.oops;
/**
 * @author Sushant Patwari
 * @since  10/02/2019
 * @aim to store date and time of transaction into queue
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.utility.Utility;

public class StoreTransactionDateInQueue {
	public static void main(String args[]) {
		String companyName;
		String symbol;
		//object of queue class
		Queue<String> queue = new Queue<>();
		while (true) {
			System.out.println("\n1. Buy symbol\n2. Sell symbol\n3. display data\n");
			System.out.println("enter your choice:");
			int choice = Utility.getInt();
			switch (choice) {
			case 1:
				//to buy symbol
				System.out.println("enter company name:");
				companyName = Utility.getString();
				System.out.println("enter symbol:");
				symbol = Utility.getString();
				//set time and date format
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
				LocalDateTime now = LocalDateTime.now(); //get current time
				String date = (dtf.format(now));
				queue.enque(companyName, symbol, date); //add data to queue
				System.out.println("buyed.........");
				break;
			case 2:
				//to sell symbol
				System.out.println("enter company name:");
				String name = Utility.getString();
				queue.deque(name); //delete data FROM QUEUE
				System.out.println("selled.....");
				break;
			case 3:
				//display queue data
				System.out.println("company symbol  date of transaction");
				queue.display();
				break;
			default:
				System.out.println("invalid choice");
			}
		}
	}
}

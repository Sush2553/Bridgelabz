package data_structure_programs;

import java.util.Scanner;

/**
 * @author Sushant Patwari
 * @purpose To implement banking cash counter logic
 */
public class ImplementBankingCashCounter {
	public static int bankcounter(int persons) {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> queue = new Queue<Integer>(); // create Queue class object
		for (int i = 1; i <= persons; i++)
			queue.enque(i); // add peoples to queue
		int personAccount[][] = new int[persons][1]; // array to store balance
		while (queue.isEmpty() != true) // check if queue is empty
		{
			System.out.println("\n1. Deposit cash ");
			System.out.println("2. withdraw cash\n plz enter your choice.....");
			int choice = scanner.nextInt(); // take users choice
			int amount = 0;
			switch (choice) {
			case 1:
				System.out.println("enter account number:(0 to" + persons + ")");
				int acc = scanner.nextInt();
				System.out.println("Enter amount to Deposit");
				amount = scanner.nextInt();
				personAccount[acc][0] = personAccount[acc][0] + amount; // add new deposited amount to existing balance
				System.out.println("current balance for account number " + acc + " is:" + personAccount[acc][0]); // display
																													// current
																													// balance
				queue.deque(); // remove person from queue
				break;

			case 2:
				System.out.println("enter account number:(0 to" + persons + ")");
				acc = scanner.nextInt();
				System.out.println("Enter amount you want to Withdraw");
				amount = scanner.nextInt();
				if (amount > personAccount[acc][0]) // check if amount to be withdraw is greater than current balance
				{
					System.out.println("Insufficient balance..!");
					queue.deque(); // remove person from queue
					break;
				}
				personAccount[acc][0] = personAccount[acc][0] - amount; // deduct current balance by withdrawn ammount
				System.out.println("current balance for account number " + acc + " is:" + personAccount[acc][0]);
				queue.deque(); // remove person from queue
				break;
			}
		}
		scanner.close();
		return 0;
	}

}

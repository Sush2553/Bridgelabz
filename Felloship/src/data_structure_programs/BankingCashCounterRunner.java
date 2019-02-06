package data_structure_programs;

import java.util.Scanner;

/**
 * @author Sushant Patwari
 * @purpose To implement banking cash counter using queue
 */
public class BankingCashCounterRunner 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("how many peoples are standing there in a queue????");
		int persons = scanner.nextInt();
		ImplementBankingCashCounter.bankcounter(persons);
		scanner.close();
}
}

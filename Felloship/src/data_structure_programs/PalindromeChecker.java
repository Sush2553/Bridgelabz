package data_structure_programs;

import java.util.Scanner;

/**
 * @author Sushant Patwari
 * @purpose To check palindrome or not
 */
public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String input = sc.next();
		sc.close();
		if (Utility_datastructure.palindromCheker(input))
			System.out.println(input + " is palindrome");
		else
			System.out.println(input + " is not palindrome");

	}

}

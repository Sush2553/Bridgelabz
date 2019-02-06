package data_structure_programs;

import java.util.Scanner;

import utility.Utility;

/**
 * @author Sushant Patwari
 * @purpose To print number of binary search tree
 */
public class NumberOfBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long result1, result2, result3;
		System.out.println("enter number of tests:");
		int a = sc.nextInt();
		int testInput[] = new int[a];
		System.out.println("Enter " + a + " test values one by one:");
		for (int i = 0; i < a; i++) {
			testInput[i] = sc.nextInt();
		}

		for (int i = 0; i < testInput.length; i++) {
			result1 = Utility.factorial(2 * testInput[i]);
			result2 = Utility.factorial(testInput[i] + 1);
			result3 = Utility.factorial(testInput[i]);

			System.out.println(result1 / (result2 * result3));
		}
		sc.close();

	}

}

package data_structure_programs;

import java.io.FileNotFoundException;
import java.io.IOException;

import utility.Utility;

/**
 * @author Sushant Patwari
 * @purpose To implement hash function
 */
public class HashingFunction {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter Number To Search");
		int search = Utility.getInt();
		boolean b = Utility.hashingSearch(search);
		if (!b) {
			System.out.println("Number not found ...and now added to list");
		} else {
			System.out.println("Number found.....and deleted from list");
		}
	}

}

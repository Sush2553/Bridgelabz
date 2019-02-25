package oops_programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utility_OOPs {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * This method takes integer input from user
	 * 
	 * @return integer value
	 */
	public static int getInt() {
		int integer = sc.nextInt();
		return integer;
	}

	/**
	 * This method is used to take long input from user
	 * 
	 * @return long value
	 */
	public static long getLong() {
		long longValue = sc.nextLong();
		return longValue;
	}

	/**
	 * This method is used to take double input from user
	 * 
	 * @return double value
	 */
	public static double getDouble() {
		double doubleValue = sc.nextDouble();
		return doubleValue;
	}

	/**
	 * This method is used to take float input from user
	 * 
	 * @return float value
	 */
	public static float getFloat() {
		float floatValue = sc.nextFloat();
		return floatValue;
	}

	/**
	 * This method is used to take String input from user
	 * 
	 * @return String
	 */
	public static String getString() {
		String string = sc.nextLine();
		return string;
	}

	public static boolean getBoolean() {
		boolean booleanValue = sc.nextBoolean();
		return booleanValue;
	}
	
	
	/******** method to read file **********/
	public static String readFile(String path) throws FileNotFoundException {
		Scanner file = new Scanner(new File(path)); // file path
		String str = ""; // define an empty string
		while (file.hasNext()) // if file is having next data
		{
			str = str + file.nextLine(); // read line from file and concat to str
		}
		file.close(); // close the file after reading
		return str;
	}

}

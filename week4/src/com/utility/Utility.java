package com.utility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.json.simple.JSONObject;

public class Utility {
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

		String string = sc.next();
		return string;
	}

	public static boolean getBoolean() {
		boolean booleanValue = sc.nextBoolean();
		return booleanValue;
	}

	/*********** read poem from file *********/
	public static void readPoemFromFile() throws IOException {
		Scanner file = new Scanner(new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/lyrics.txt"));
		String poem = "";
		while (file.hasNext()) {
			poem = poem + "\n" + file.nextLine();

		}
		file.close();
		for (int i = 1; i <= 9; i++) {
			if (i == 1) {
				String fin = poem.replaceAll("<<ANIMAL>>", "Chicks").replaceAll("<<SOUND>>", "chick-chick");
				System.out.println(fin + "\n");

			}

			if (i == 2) {
				String fin = poem.replaceAll("<<ANIMAL>>", "Duck").replaceAll("<<SOUND>>", "Quack-quack");
				System.out.println(fin + "\n");

			}

			if (i == 3) {
				String fin = poem.replaceAll("<<ANIMAL>>", "Turkey").replaceAll("<<SOUND>>", "gobble-gobble");
				System.out.println(fin + "\n");

			}
			if (i == 4) {
				String fin = poem.replaceAll("<<ANIMAL>>", "Cow").replaceAll("<<SOUND>>", "moo-moo");
				System.out.println(fin + "\n");

			}
			if (i == 5) {
				String fin = poem.replaceAll("<<ANIMAL>>", "Pig").replaceAll("<<SOUND>>", "oink-oink");
				System.out.println(fin + "\n");

			}
			if (i == 6) {
				String fin = poem.replaceAll("<<ANIMAL>>", "Cat").replaceAll("<<SOUND>>", "meow-meow");
				System.out.println(fin + "\n");

			}
			if (i == 7) {
				String fin = poem.replaceAll("<<ANIMAL>>", "Dog").replaceAll("<<SOUND>>", "Bow-Bow");
				System.out.println(fin + "\n");

			}
			if (i == 8) {
				String fin = poem.replaceAll("<<ANIMAL>>", "Mule").replaceAll("<<SOUND>>", "Heehaw-Heehaw");
				System.out.println(fin + "\n");

			}
			if (i == 9) {
				String fin = poem.replaceAll("<<ANIMAL>>", "Turtle").replaceAll("<<SOUND>>", "nerp-nerp");
				System.out.println(fin);

			}

		}
	}

	/**************** birth dates ************/
	public static void getBirthDate(int maximum, int minimum) throws IOException {
		FileWriter fw = new FileWriter(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/birthdates.txt"));
		int st[][] = new int[50][3];

		// date
		for (int i = 0; i < 50; i++) {
			int n = ((int) (Math.random() * (maximum - minimum))) + minimum;
			st[i][0] = n;
		}

		// month
		int min = 1, max = 13;
		for (int j = 0; j < 50; j++) {
			int n = ((int) (Math.random() * (max - min))) + min;
			st[j][1] = n;
		}

		// year
		int min1 = 1992, max1 = 1994;
		for (int j = 0; j < 50; j++) {
			int n = ((int) (Math.random() * (max1 - min1))) + min1;

			st[j][2] = n;
		}

		// display

		fw.write("\tDate\tMonth\tYear\n");
		for (int k = 0; k < 50; k++) {
			fw.write((k + 1) + ":\t");
			for (int l = 0; l < 3; l++) {
				if (st[k][l] >= 28 && st[k][1] == 2)
					st[k][l] = st[k][l] - 2;

				if (st[k][2] < 1992)
					st[k][2] = 1993;
				String newArr = (Integer.toString(st[k][l]) + "\t\t");
				fw.write(newArr);

			}
			fw.write("\n");

		}
		fw.close();
	}

	/******************
	 * minimum and maximum from file
	 * 
	 * @throws IOException
	 **********/

	public static void getMinimumMaximum() throws IOException {
		Scanner file = new Scanner(new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/MinMax.txt"));

		int arr[] = new int[6];
		// read from file
		while (file.hasNext()) {

			for (int i = 0; i < 6; i++) {
				String n = file.nextLine();
				int a = Integer.parseInt(n);
				arr[i] = a;
			}

		}
		file.close();

		FileWriter fw = new FileWriter(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/week4/file/MinMaxOutput.txt"));
		// compare to find min
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < temp) {
				temp = arr[i];
			}
		}
		fw.write("minimum is:" + temp + "\n");

		// max
		int temp1 = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > temp1) {
				temp1 = arr[i];
			}
		}

		fw.write("maximum is:" + temp1);
		fw.close();
		file.close();
	}

	/*******************
	 * average of floting point numbers in file
	 * 
	 * @throws IOException
	 *********/

	public static void getAverage() throws IOException {
		Scanner file = new Scanner(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/week4/file/average.txt"));
		float arr[] = new float[10];
		while (file.hasNextLine()) {
			for (int i = 0; i < 10; i++) {
				String input = file.nextLine();
				float n = Float.parseFloat(input);
				arr[i] = n;
			}
		}
		file.close();

		FileWriter fw = new FileWriter(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/week4/file/averageOutput.txt"));
		int count = 0;
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			sum = sum + arr[i];
		}
		System.out.println("sum:" + sum);

		float average = sum / count;
		System.out.println("average of is:" + average);
		fw.write("average:" + average);
		fw.close();
	}

	/************
	 * Transpose of matrix
	 * 
	 * @throws IOException
	 *************/

	public static void transposeOfMatrix() throws IOException {
		Scanner file = new Scanner(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/week4/file/Transpose.txt"));
		FileWriter fw = new FileWriter(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/week4/file/TransposeOutput"));

		int array[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				String input = file.nextLine();
				int n = Integer.parseInt(input);
				array[i][j] = n;
			}
		}

		System.out.println("original matrix:");
		fw.write("original matrix:\n");
		fw.write("\t\t");
		for (int x = 0; x < 3; x++) {
			System.out.print("\tcol" + (x + 1));
			fw.write("\tcol" + (x + 1) + " ");
		}
		System.out.println();
		fw.write("\n");

		for (int i = 0; i < 3; i++) {
			System.out.print("row" + (i + 1) + " ");
			fw.write("row" + (i + 1) + " ");
			for (int j = 0; j < 3; j++) {
				System.out.print("\t " + array[i][j]);
				fw.write("\t\t" + " " + array[i][j]);

			}
			System.out.println();
			fw.write("\n");
		}

		// print final result
		System.out.println("\nafter transpose:");
		fw.write("\n after transpose:\n");
		fw.write("\t\t");
		for (int x = 0; x < 3; x++) {
			System.out.print("\tcol" + (x + 1));
			fw.write("\tcol" + (x + 1) + " ");
		}
		System.out.println();
		fw.write("\n");

		int newArray[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			System.out.print("row" + (i + 1) + " ");
			fw.write("row" + (i + 1) + " ");
			for (int j = 0; j < 3; j++) {

				System.out.print("\t " + array[j][i]);
				fw.write("\t\t" + " " + array[j][i]);
				newArray[j][i] = array[i][j];
			}
			System.out.println();
			fw.write("\n");
		}
		fw.close();
		file.close();

	}

	/************
	 * Determinant of matrix
	 * 
	 * @throws IOException
	 ************/

	public static void calculateDeterminantOfMatrix() throws IOException {
		Scanner file = new Scanner(
				new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/week4/file/Transpose.txt"));
		FileWriter fw = new FileWriter(new File(
				"/home/admin1/Desktop/pre-felloship-programs/week4/src/com/week4/file/DeterminantOfMatrix.txt"));

		int array[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				String input = file.nextLine();
				int n = Integer.parseInt(input);
				array[i][j] = n;
			}
		}
		// display
		System.out.println("your matrix:");
		fw.write("your matrix:\n");
		fw.write("\t\t");
		for (int x = 0; x < 3; x++) {
			System.out.print("\tcol" + (x + 1));
			fw.write("col" + (x + 1) + " ");
		}
		System.out.println();
		fw.write("\n");

		for (int i = 0; i < 3; i++) {
			System.out.print("row" + (i + 1) + " ");
			fw.write("row" + (i + 1) + " ");
			for (int j = 0; j < 3; j++) {
				System.out.print("\t " + array[i][j]);
				fw.write("\t " + " " + array[i][j]);

			}
			System.out.println();
			fw.write("\n");
		}
		int result1 = array[0][0] * ((array[1][1] * array[2][2]) - (array[2][1] * array[1][2]));
		int result2 = array[0][1] * ((array[1][0] * array[2][2]) - (array[2][0] * array[1][2]));
		int result3 = array[0][2] * ((array[1][0] * array[2][1]) - (array[2][0] * array[1][1]));
		int finalResult = result1 - result2 + result3;
		System.out.println("Determinant:" + finalResult);
		fw.write("\nDeterminant:" + finalResult);

		fw.close();
		file.close();
	}

	@SuppressWarnings("unchecked")
	public static void jSonWrite() {
		JSONObject empobj1 = new JSONObject();
		empobj1.put("fname", "Sushant");
		empobj1.put("lname", "Patwari");
		empobj1.put("phone", "7558525201");

		// JSONObject employee=new JSONObject();
		// employee.put("emp details",empobj1);

		System.out.println(empobj1);
	}

	public static Date printDate(String date) throws java.text.ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return sdf.parse(date);
	}

//format date object in this format 01/12/2016 
	public String getFormatedDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);
	}

}
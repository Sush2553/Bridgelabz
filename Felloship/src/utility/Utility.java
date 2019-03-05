package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.unoderedList.UnOrderList;

import data_structure_programs.*;

import utility.Utility;

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
		String string = sc.nextLine();
		return string;
	}

	public static boolean getBoolean() {
		boolean booleanValue = sc.nextBoolean();
		return booleanValue;
	}

	/******** anagram ***************/
	public static boolean isAnagram() {
		System.out.println("enter first string:");
		String a = sc.next();
		System.out.println("enter second string:");
		String b = sc.next();
		// remove white spaces
		String c = a.replaceAll("\\s", " ");
		String d = b.replaceAll("\\s", " ");
		System.out.println("first string:" + a + "\n" + "second string:" + b);

		if (c.length() != d.length()) // check for length equality
			return false;
		else {
			// convert to lower case and character array
			char[] s1Array = c.toLowerCase().toCharArray();
			char[] s2Array = d.toLowerCase().toCharArray();

			Arrays.sort(s1Array); // sort
			Arrays.sort(s2Array); // sort

			// Check if both arrays are equal

			Arrays.equals(s1Array, s2Array);
			return true;
		}

	}

	/************ palindrome **********/

	public static boolean isPalindrome() {
		System.out.println("enter string");
		String s = sc.next();
		String temp = s;
		String rev = "";
		int length = s.length();

		// reverse the string
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("original string:" + s + "\n" + "reversed string:" + rev);
		// check for equality of strings(original and reversed)
		if (temp.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

//prime check
	public static boolean isPrime(int n) {

		for (int j = 2; j <= n / 2; j++) {
			int rem = n % j;

			if (rem == 0) // if remainder is equal to 0,then not prime
			{
				return false;
			}

		}
		return true; // else prime

	}

//binary search word
	public static int binarySearchWord() {
		String a, temp = null;

//read file
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/admin1/searchWord.txt"));

			try {
				// read line from file
				a = br.readLine();
				// split line into words when you get comma and store words in array
				String arr[] = a.split(",");
				br.close();
				// sort names
				for (int i = 0; i < arr.length; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i].compareTo(arr[j]) > 0) // check if arr[j] is greater than arr[i]

						{
							// if yes then swap positions
							temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}

					}

				}

				// display names
				System.out.println("\nyour file contents are:");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]);
					if (i == arr.length - 1)
						break;
					System.out.print(",");

				}

				System.out.println();
				// ask user for word to be search
				String input;
				System.out.println("which word you want to search????");

				input = sc.next();
				// sc.close();

				int first = 0, last = arr.length - 1;

				while (first <= last) {
					int mid = (first + last) / 2; // get mid
					if (input.compareTo(arr[mid]) == 0) // compare mid with user entered word
					{
						return mid;
					} else if (input.compareTo(arr[mid]) > 0) // check whether word is greater than mid
					{
						first = mid + 1; // change first to mid+1
					} else {
						last = mid - 1; // change last to mid-1
					}
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return -1;
	}

//binary search for integer
	public static int binarySearchForInteger() {
		int temp;
		// take user input
		System.out.println("enter number of elements:");
		int b = sc.nextInt();
		int array[] = new int[b];
		int n = array.length;
		// take input from user
		System.out.println("enter numbers one by one:");
		for (int i = 0; i < b; i++) {
			array[i] = sc.nextInt();
		}

		// sort numbers
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[j] < (array[i])) // check if array[j] is less than array[i]

				{
					// if yes then swap
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}

		}

		// display sorted order
		System.out.println("sorted order:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

		System.out.println();
		// ask user for word to be search
		int input;
		System.out.println("which number you want to search????");
		input = sc.nextInt();
		// sc.close();

		int first = 0, last = array.length - 1;

		while (first <= last) {
			int mid = (first + last) / 2; // get mid
			if (input == array[mid]) // compare mid with user entered word
			{
				return mid;
			} else if (input > array[mid]) // check whether word is greater than mid
			{
				first = mid + 1; // change first to mid+1
			} else {
				last = mid - 1; // change last to mid-1
			}
		}

		return -1;
	}

	/***************** Binary presentation of decimal numbers ***********/
	public static String getBinary() {

		System.out.println("enter decimal number:");
		int d = sc.nextInt();
		int n = d;
		String binary = "";
		String reverse = "";

		// getting remainder

		while (n >= 1) {
			binary = binary + (n % 2);
			n = n / 2;
		}

		// padding to complete 1 byte
		int z = binary.length();
		String padding = "";
		for (int i = z; i < 8; i++) {
			padding = padding + 0;
		}
		// display
		System.out.print("binary of " + d + ":");
		for (int i = binary.length() - 1; i >= 0; i--) {
			reverse = reverse + binary.charAt(i);
		}
		System.out.println(padding + reverse);
		return padding + reverse;

	}

	/********** temperature conversion ************/
	public static void tempConversion() {
		double temperature = 0.0;
		double result = 0.0;
		int choice;
		System.out.println(
				"Enter your choice for temperature conversion :\n 1. From celcius to fahrenheit. \n 2. From fahrenheit to celcius \n");
		choice = sc.nextInt();
		// condition for choice 1 and 2

		switch (choice) {
		case 1:
			System.out.println("Enter temperature in celcius: ");
			temperature = Utility.getDouble();
			result = (temperature * 9 / 5) + 32;
			System.out.println(temperature + "C in fahrenheit: " + result + "F");
			break;

		case 2:

			System.out.println("Enter the temperature in fahrenheit: ");
			temperature = Utility.getDouble();
			result = (temperature - 32) * 5 / 9;
			System.out.println(temperature + "F in celcius: " + result + "C");
			break;

		default:
			System.out.println("invalid choice");
			tempConversion();
		}
	}

	/****************** program to calculate interest ******************/

	public static void calculateInterestOnLoan() {
		System.out.println("enter principle loan amount:");
		double P = sc.nextDouble();
		System.out.println("enter duration in year:");
		int Y = sc.nextInt();
		System.out.println("enter interest rate:");
		double R = sc.nextDouble();
		int n = 12 * Y; // years to months
		double r = R / (12 * 100);
		double l = 1 + r;
		double payment = (P * r) / (1 - Math.pow(l, -n)); // calculate payment
		System.out.println("Your monthly interest Payment is:" + payment);
	}

	/******************
	 * program to find square root of non negative number
	 ****************/
	public static void findSqrtOfNumber() {
		System.out.println("Please enter positive number: ");
		int c = sc.nextInt();
		double e = 1e-15;
		double t = c;
		if (c < 0) {
			findSqrtOfNumber();
		} else {
			while (Math.abs(t - c / t) > e * t) {
				t = (c / t + t) / 2;
			}
			System.out.println("sqrt=" + Math.sqrt(t));
		}
	}

	// ****************** method for to check prime palindrome *********//

	public static int[] primePalindromeCheck(int range) {
		int count = 0;
		int palindrome[] = new int[20];

		for (int index = 2; index < range; index++) {
			if (isPrime(index) && isPallindrome(index)) // check for prime as well as palindrome
			{

				palindrome[count] = index;
				count++;

			}

		}
		return palindrome;

	}

	// palindrome check
	public static boolean isPallindrome(int number) {
		int temp = number;
		int reverseNumber = 0;
		while (number > 0) {
			int remainder = number % 10; // get remainder
			reverseNumber = (reverseNumber * 10) + remainder; // reverse
			number /= 10;
		}
		return (temp == reverseNumber);
	}

	/********** prime anagrams check **********/
	public static int[] primeAnagrams(int range) {
		int index = 0;
		String[] array1 = new String[170];
		int[] anagram = new int[170];
		int count = 0;

		for (int i = 2; i < range; i++) {
			if (Utility.isPrime(i)) // check for prime
			{
				array1[index] = String.valueOf(i); // convert int to string for anagram detection
				index++;
			}
		}

		for (int i = 0; i < index; i++) {
			for (int j = i + 1; j < index; j++) {
				if (Utility.isAnagram(array1[j], array1[i])) {
					anagram[count] = Integer.parseInt(array1[i]);// string to int
					count++;
					anagram[count] = Integer.parseInt(array1[j]); // string to int
					count++;
				}
			}
		}

		return anagram;
	}

//check for anagram	
	public static boolean isAnagram(String str1, String str2) {
		boolean status = true;
		// check for equal length
		if (str1.length() != str2.length())
			status = false;
		else {
			char[] str1Array = str1.toCharArray(); // convert string to character array for sorting
			char[] str2Array = str2.toCharArray();

			Arrays.sort(str1Array); // sort character arrays
			Arrays.sort(str2Array);

			status = Arrays.equals(str1Array, str2Array); // compare for equality
		}
		if (status)
			return true;
		else
			return false;
	}

//day of week
	public static int dayOfWeek() {
		System.out.println("enter date:");
		int d = sc.nextInt();
		System.out.println("enter month:");
		int m = sc.nextInt();
		System.out.println("enter year:");
		int y = sc.nextInt();
		if (y < 0 || m < 0 && m > 12 || d < 0) {
			System.out.println("please enter valid inputs:");
			y = Utility.getInt();
			m = Utility.getInt();
			d = Utility.getInt();
			dayOfWeek();
		}

		int y0 = y - (14 - m) / 12;

		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

		int m0 = m + 12 * ((14 - m) / 12) - 2;

		int d0 = (d + x + (31 * m0) / 12) % 7;

		return d0;
	}

	/************* Bubble sort for integers ***********/
	public static int[] bubbleSortForIntegers() {
		System.out.println("enter number of elements:");
		int a = sc.nextInt();
		int array[] = new int[a];
		int n = array.length;
		// take input from user
		System.out.println("enter numbers one by one:");
		for (int i = 0; i < a; i++) {
			array[i] = sc.nextInt();
		}

		// sort numbers
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[i]) // if j is less than i then swap
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}

	/************* Bubble sort for integers ***********/
	public static String[] bubbleSortForStrings() {
		System.out.println("enter number of words:");
		int a = sc.nextInt();
		String array[] = new String[a];
		int n = array.length;
		// take input from user
		System.out.println("enter words one by one:");
		for (int i = 0; i < a; i++) {
			array[i] = sc.next();
		}

		// sort numbers
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[j].compareTo(array[i]) < 0) // if j is less than i then swap
				{
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}

	// insertion sort for String
	public static String[] insertionSortForString() {

		System.out.println("enter number of words:");
		int a = sc.nextInt();
		String array[] = new String[a];
		int n = array.length;
		// take input from user
		System.out.println("enter words one by one:");
		for (int i = 0; i < a; i++) {
			array[i] = sc.next();
		}
		sc.close();

		// sort
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i].compareTo(array[j]) < 0) // if i is less than j then swap
				{
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	// insertion sort for String
	public static int[] insertionSortForInteger() {
		System.out.println("enter number of elements:");
		int a = sc.nextInt();
		int array[] = new int[a];
		int n = array.length;
		// take input from user
		System.out.println("enter numbers one by one:");
		for (int i = 0; i < a; i++) {
			array[i] = sc.nextInt();
		}

		// sort
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] < array[j]) // if i is less than j then swap
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	/*********** find magic number ************/
	public static void findNumber() {
		System.out.println("enter value of n such that n should be power of 2:");
		int n = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {

			a[i] = i;

		}

		// display
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
		System.out.println();

		System.out.println("guess any number between 0 to " + (n - 1));
		int low = 0;
		int high = a.length;
		int mid, temp = 0;
		String ch1;

		while (low <= high) {
			// get mid
			mid = (low + high) / 2;

			if (temp == mid)
				System.out.println("not found");
			// check whether imagined number is at mid or not
			System.out.println("is your number: " + a[mid]);
			ch1 = sc.next();
			if (ch1.equals("yes")) {
				System.out.println(" number: " + a[mid] + " found at:" + mid);
				break;
			}

			temp = mid;
			// checks boundry values
			if (a[mid] == a[0] || a[mid] == n) {
				System.out.println("not found");
				break;
			}

			if (a[mid] - a[low] == 2) {
				System.out.println("your number must be: " + a[mid - 1] + " or " + a[mid + 1]);
				break;
			}

			System.out.println("is your number greater than: " + a[mid]);
			ch1 = sc.next();

			if (ch1.equals("no"))

				high = mid; // assign mid as high

			else

				low = mid; // assign mid as low

		}

	}

//notes to be returned by vending machine

	public static void vending(int n) {
		int count = 0, count1000 = 0, count500 = 0, count100 = 0, count50 = 0, count20 = 0, count10 = 0, count5 = 0,
				count2 = 0, count1 = 0;
		while (n > 0) {
			if (n >= 1000) {
				n = n - 1000;
				count1000++;
			} else if (n >= 500) {
				n = n - 500;
				count500++;
			} else if (n >= 100) {
				n = n - 100;
				count100++;
			} else if (n >= 50) {
				n = n - 50;
				count50++;
			} else if (n >= 20) {
				n = n - 20;
				count20++;
			}

			else if (n >= 10) {
				n = n - 10;
				count10++;
			} else if (n >= 5) {
				n = n - 5;
				count5++;
			} else if (n >= 2) {
				n = n - 2;
				count2++;
			} else if (n >= 1) {
				n = n - 1;
				count1++;
			}

			count++;

		}
		System.out.println("minimum notes to be returned:" + count);
		if (count1000 != 0)
			System.out.println("1000 rs notes:" + count1000);
		if (count500 != 0)
			System.out.println("500 rs notes:" + count500);
		if (count100 != 0)
			System.out.println("100 rs notes:" + count100);
		if (count50 != 0)
			System.out.println("50 rs notes:" + count50);
		if (count20 != 0)
			System.out.println("20 rs notes:" + count20);
		if (count10 != 0)
			System.out.println("10 rs notes:" + count10);
		if (count5 != 0)
			System.out.println("5 rs notes:" + count5);
		if (count2 != 0)
			System.out.println("2 rs notes:" + count2);
		if (count1 != 0)
			System.out.println("1 rs notes:" + count1);
	}

	/************** merge sort **********/
// First subarray is arr[l..m] 
// Second subarray is arr[m+1..r] 
	public static void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

// Main function that sorts arr[l..r] using 
// merge() 
	public static void sort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	/* print array */
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

//random coupon
	public static int RandomNumberGeneration(int n) {
		boolean[] isDistinct = new boolean[n];
		int temp = 0, count = 0;
		while (temp < n) {
			int randomnumber = (int) (Math.random() * n); // return a random coupon between 0 and n-1
			count++;
			if (!isDistinct[randomnumber]) // not already present
			{
				temp++;
				isDistinct[randomnumber] = true; // set generated distinct to true to avoid that no. again
				System.out.println("Distinct coupons are : " + randomnumber);
			}
		}
		return count;
	}

//permutations

	public static void getPermutation(String str, int startIndex, int lastIndex) {
		if (startIndex > lastIndex)
			System.out.println("last index should be greater than start index");
		if (startIndex == lastIndex) {
			System.out.println(str);
		} else {
			// startindex=0 , lastindex=2
			for (int i = startIndex; i <= lastIndex; i++) {
				str = swap(str, startIndex, i); // swap
				getPermutation(str, startIndex + 1, lastIndex);
				str = swap(str, startIndex, i);
			}
		}
	}

	private static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];   //assign charArray[i] value to temp
		charArray[i] = charArray[j];  //assign charArray[j] value to charArray[i]
		charArray[j] = temp;//assign temp value to charArray[j] 
		return String.valueOf(charArray);
	}

	/********************** data structure programs ************************/

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

//add words from list to linked list
	public static Node addToLinkedList(String wordArray[]) {
		Node head = null; // initially head node will be null
		for (int i = 0; i < wordArray.length; i++) {
			Node newNode = new Node(); // create new node for linked list
			newNode.data = wordArray[i]; // assign ith word to data field of new node
			newNode.next = null; // new node will have null reference to next

			if (head == null) // if linked list is empty
			{
				head = newNode; // assign new node as head node
			} else // if linked list is not empty
			{
				Node n = head; // create temp node n for traversing present list
				while (n.next != null) // traverese till last node
				{
					n = n.next; // increment each time for traversing
				}
				n.next = newNode; // add newnode to last
			}
		}
		return head;
	}

//display linked list
	public static void displayLinkedList(Node head) {

		System.out.println("your linked list is:");
		Node n = head;
		while (n.next != null) // traverse till last
		{
			System.out.print(n.data + " "); // print data of node
			n = n.next;
		}
		System.out.print(n.data); // to print data of last node
	}

//search word from linked list
	public static int search(String wordArray[], String wordToSearch, Node head) {

		Node a = head; // temp nod eto traverse

		int n = 0;
		for (int i = 0; i < wordArray.length; i++) {
			if (wordToSearch.compareToIgnoreCase(a.data) == 0) // compare word to be search with node data
			{
				System.out.println("found");

				return n; // return position of word that found

			}
			a = a.next; // increment pointer to check with next node's data
			n++;
			if (i == wordArray.length - 1)
				System.out.println("Sry not found");
		}
		return -1;
	}

//if word not found then add that word to linked list
	public static Node addIfNotFound(String wordToSearch, Node head) {

		Node newNode = new Node(); // create new node
		newNode.data = wordToSearch; // assign that word as data to created node
		newNode.next = null;

		Node b = head;
		while (b.next != null) // check for last node
		{
			b = b.next;
		}
		b.next = newNode; // add node
		System.out.println(wordToSearch + " added to linked list.\n");
		return head;
	}

	public static Node addIfNotInAscendingOrder(String NoToSearch, Node head, int length) {

		Node newNode = new Node(); // create new node
		newNode.data = NoToSearch; // assign that word as data to created node
		newNode.next = null;

		Node b = head;

		for (int i = 0; i < length;) {

			if (NoToSearch.compareTo(b.data) < 0 && i == 0) {
				Node temp = head;
				head = newNode;
				newNode.next = temp;
				if (NoToSearch.compareTo(b.data) < 0 && i == length - 2 && (b.next).next == null) {
					b.next = newNode;
					newNode.next = null;

				}
			}
			// b=b.next;

		}
		System.out.println(NoToSearch + " added to linked list.\n");
		return head;
	}
//delete node from linkedlist

	public static Node deleteFromLinkedList(int result, Node head) {
		// here result is a value of position at which it is present returned by search
		// method
		Node b = head;
		if (result == 0) // if word is present at head then assign next node as head
			head = b.next;

		else
			for (int i = 0; i <= result; i++) // traverse till position
			{

				if (i == result - 1) // previous node of node which is going to be deleted
				{
					if ((b.next).next == null) // check if deleting node is last or not
					{
						b.next = null; // if last,assign null reference to previous
						break;
					} else {
						b.next = (b.next).next; // if not last,add reference of next node to previous node
						break;
					}
				}
				b = b.next;

			}

		return head;
	}

//to check entered year is leap year or not
	public static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
			return true;
		else
			return false;
	}

//calendar using queue
	public static void calenderQueue(int month, int year) {
		String s[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		Queue<String> q1 = new Queue<>();
		// get d0 value hence upto d0 we will add null values
		int d = 1, y = year, m = month;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;

		int start = d0;
		int totalDaysOfMonth = 0, count = 1;
		if (month == 2) {
			if (Utility.isLeapYear(year)) // if leap year days = 29
				totalDaysOfMonth = 29;
			else
				totalDaysOfMonth = 28; // if not leap year days= 28
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			totalDaysOfMonth = 31;
		else
			totalDaysOfMonth = 30;

		while (start != 0) {
			q1.enque("   ");
			start--;
		}

		while (count <= totalDaysOfMonth) {
			if (count <= 9)
				q1.enque(String.valueOf(count) + "  "); // add data to the queue
			else
				q1.enque(String.valueOf(count) + " "); // add data to the queue
			count++;
		}

		System.out.println(s[month - 1] + " " + year);
		System.out.println("S  M  T  W  T  F  S");
		count = 1;
		while (!q1.isEmpty()) // traverse till queue is not empty
		{
			String result = q1.deque();
			System.out.print(result);
			if (count % 7 == 0) {
				System.out.println();
			}
			count++;
		}
	}

//factorial program
	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	
//Program for hashing function
	@SuppressWarnings("unchecked")
	public static boolean hashingSearch(int search) throws FileNotFoundException,IOException
	{
		FileInputStream fis=new FileInputStream("/home/admin1/eclipse-workspace/Felloship/src/Hashing.txt");
		UnOrderList<Integer> arr[]=new UnOrderList[11];
		
		for(int i=0;i<arr.length;i++)
		{arr[i]=null;
			arr[i]=new UnOrderList<Integer>();  //create list for each array element
		}
		Scanner sc=new Scanner(fis);
		while(sc.hasNext())
		{
			int value=Integer.parseInt(sc.next());
		
			int temp_val=value%11;  //get index
			
			arr[temp_val].add(value);  //add key to that index
		}
		sc.close();
		System.out.println();
		
		
		int value=search%11;  //get index
		boolean flag=arr[value].search(search);  //search value at that index
		if(flag)
		{
			arr[value].remove(search);  //if value found,then remove
		}
		else
		{
		arr[value].add(search);  //add if not found
		}
		
		
		fis.close();
		return flag;
}

//program to print calendar using stack	
	public static void calenderStack(int month, int year) {
		String s[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		Stack<String> stack = new Stack<>();
		// get d0 value hence upto d0 we will add null values
		int d = 1, y = year, m = month;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;

		int start = d0;
		int totalDaysOfMonth = 0, count = 1;
		if (month == 2) {
			if (Utility.isLeapYear(year)) // if leap year days = 29
				totalDaysOfMonth = 29;
			else
				totalDaysOfMonth = 28; // if not leap year days= 28
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			totalDaysOfMonth = 31;
		else
			totalDaysOfMonth = 30;

		while (start != 0) {
			stack.push("   ");
			start--;
		}

		while (count <= totalDaysOfMonth) {
			if (count <= 9)
				stack.push(String.valueOf(count) + "  "); // add data to the stack
			else
				stack.push(String.valueOf(count) + " "); // add data to the stack
			count++;
		}

		System.out.println(s[month - 1] + " " + year);
		System.out.println("S  M  T  W  T  F  S");
		count = 1;
		while (!stack.isEmpty()) // traverse till stack is not empty
		{
			String result = stack.pop();
			System.out.print(result);
			if (count % 7 == 0) {
				System.out.println();
			}
			count++;
		}
		
		
}
}

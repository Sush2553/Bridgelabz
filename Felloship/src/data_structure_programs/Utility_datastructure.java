package data_structure_programs;

import java.util.Arrays;
import java.util.Scanner;


public class Utility_datastructure 
{

	static Scanner sc= new Scanner(System.in);

		/**This method takes integer input from user
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

		

    	//prime check
    	public static boolean isPrime(int n)
    	{
    		
    		for(int j=2;j<=n/2;j++) {
    			int rem = n % j;
    			
    			if(rem == 0) {
    				return false;
    			}
    			
    		}
    		return true;

    	}
    	
    	
    	/***************prime numbers between 1-1000**************/
        
    	 
    	public static int[][] prime2DArray(int n) 
    	{
    		int [][]prime = new int [10][25];
    		int first=0,second=0,third=0,fourth=0;
    		int fifth=0,sixth=0,seventh=0,eight=0,nineth=0,ten=0;
    	
    		for(int i=2;i<n;i++) 
    		{
    			
    			if(isPrime(i))  //check foo prime
    			{
    			
    			if((i > 0) && (i<= 100))
    			prime[0][first++] = i;
    	
    			else if((i > 100) && (i <= 200))
    				prime[1][second++]=i;
    			
    			else if((i > 200) && (i<= 300)) 
    				prime[2][third++] = i;
    			
    			else if((i> 300) && (i <= 400)) 
    				prime[3][fourth++] =i;
    			
    			else if((i > 400) && (i <= 500)) 
    				prime[4][fifth++] = i;
    			
    			else if((i> 500) && (i <= 600)) 
    				prime[5][sixth++] = i;
    			
    			else if((i>600)&&(i<=700)) 
    				prime[6][seventh++]=i;
    			
    			else if((i> 700) && (i <= 800)) 
    				prime[7][eight++] = i;
    			
    			else if((i> 800) && (i <= 900)) 
    				prime[8][nineth++] = i;
    			
    			else if((i> 900) && (i <= 1000)){	
    				prime[9][ten++] = i;
    			}
    		}
    		}
    		
    		
    		return prime;
    				
    	}
    	
    	
    	/**********prime anagrams check**********/
    	public static int[] primeAnagrams(int range) {
    			int index = 0;
    			String[] array1 = new String[168];
    			int[] anagram = new int[158];  //to store anagrams
    			int count = 0;
    			
    			for(int i=2;i<range;i++)
    			{
    				if(isPrime(i)) //check for prime
    				{
    					array1[index] = String.valueOf(i); // integer to string conversion
    					index++;
    				}
    			}
    			
    			
    			
    			for(int i=0;i<index;i++)  //to traverse array
    			{
    				for(int j=i+1;j<index;j++)
    				{
    					if(isAnagram(array1[j], array1[i])) //to compare ith element with jth element
    					{ 
    						//store ith as well as jth positions numbers
    						anagram[count] = Integer.parseInt(array1[i]);  //String to integer
    						count++;
    						anagram[count] = Integer.parseInt(array1[j]);
    						count++;
    					}
    				}
    			}
    			
    			return anagram;
    		}
    	
   //anagram check
    	public static boolean isAnagram(String str1, String str2)
    	{
    			boolean status=true;
    			
    			if(str1.length() != str2.length())  //check length of two strings are equal or not
    				status = false;
    			else 
    			{ 
    				//convert strings to character array to compare their characters
    				char[] str1Array = str1.toCharArray();
    				char[] str2Array = str2.toCharArray();
    				
    				//sort both char arrays
    				Arrays.sort(str1Array);
    				Arrays.sort(str2Array);
    				
    				status = Arrays.equals(str1Array, str2Array); //compare two arrays
    	 		}
    			if(status)
    				return true;
    			else 
    				return false;
    		}
    	
    	
    // palindrome checker using deque	
    	public static boolean palindromCheker(String input)
    	{
    		input = input.toLowerCase().replaceAll(" ", "");
    		Deque <Character> deque = new Deque<>(); 
    		boolean result = false ;
    		for(int i=0;i<input.length();i++)
    		{
    			char c =input.charAt(i);
    			//adding each character to the rear of the deque
    			deque.addRear(c);
    		}
    		int flag=0;
    		
    		//traverse upto size of the deque greater than 1
    		while(deque.size()>1)
    		{
    			char first = (char) ((deque.removeFront())); //remove from front
    			char last =(char) (deque.removeRear());   //remove from rear
    			if( first== last)  //if equal set flag to 0.
    			{
    				flag=0;
    				
    			}
    			else
    			{
    				flag = 1;
    				break;
    			}
    		}
    		
    		
    		if(flag==0)
    		{
    		result = true;  //is palindrome
    		}
    		else
    		{
    			result = false;  //not palindrome
    		}
    		return result;
    	}

    }





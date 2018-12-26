package com.utility.week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Utility {
	
public static Scanner sc= new Scanner(System.in);

	

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

	/*****************Binary search the world from list**************/
	
	public static String binarySearchWord(String search) 
	{
		String a,temp = null;
		int count=0,t =0;
		try {
			BufferedReader br=new BufferedReader(new FileReader("/home/admin1/searchWord.txt"));
			
			try {
				a=br.readLine();
				String arr[]=a.split(",");
				
				//sort names
		        for (int i = 0; i < arr.length; i++) 
		        {
		        	for (int j = i + 1; j < arr.length; j++) 
		        	{
		        		if (arr[i].compareTo(arr[j])>0) 

		                {
		        			temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }

		            }

		        }
				
		        //display names
				System.out.println("\nyour file contents are:");
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]);
					if(i==arr.length-1)
					break;
					System.out.print(",");
					
				}
				
					
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i].equals(search))
					{
						t=i;count++;
						//return "\n"+search+" found at:"+i;
					}
					}	
					
				br.close();
				
				} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
	}System.out.println();
		if(count==1)
			return "found at:"+t;
		else
		return "\n"+search+"not found";
		


}}

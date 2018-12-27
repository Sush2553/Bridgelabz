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
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("/home/admin1/searchWord.txt"));
			
			try {
				a=br.readLine();
				String arr[]=a.split(",");
				br.close();
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
				
				System.out.println();
				int first=0,last=arr.length-1;
				
				while(first<=last) 
				{
					int mid = (first + last)/2;
					if(search.compareTo(arr[mid])==0)
					{
						return "found at:"+mid;
					}
					else if(search.compareTo(arr[mid]) > 0)
					{
						first=mid+1;
					}
					else
						last=mid-1;
				}
					

				
				} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
	}
		
		return "not found";
	}

	
	/***********find magic number************/
	public static void findNumber() 
	{
		int a[]= {2,4,8,16,32,64,128,256,512,1024,2048,4096};
		int low =0;
		int high =a.length;
		int mid;
		String ch1;
		

		while(low<=high) 
		{
			mid = (low+high)/2;
			
			System.out.println("is your number: "+a[mid]);
			ch1=sc.next();
			if(ch1.equals("yes")) 
			{
			System.out.println(" number: "+a[mid]+" found at:"+mid);
			break;
			}
			
			if(a[mid]==a[0] || a[mid]==4096)
			{
				System.out.println("not found");
				break;
			}
			System.out.println("is your number greater than: "+a[mid]);
			ch1=sc.next();
			if(ch1.equals("no")) 
		
				high = mid ;
		
			else 
			
				low= mid ;
			
		}
		
	}
	
	
	/*****************insertion sort using string**************/
	
	public static void insertionSort()
	{
		int max;
		System.out.println("please enter no. of elements:");
		max=sc.nextInt();
		String array[]=new String[max];
	
		System.out.println("enter array elements:");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.next();
		}
		
		System.out.println("original array:");
		for(int i=0;i<array.length;i++)
		{
		System.out.print(array[i]);
		if(i==array.length)
			break;
		System.out.print(",");
		}
		
		//sort
		for(int i=1;i<array.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(array[i].compareTo(array[j])<0)
				{
					String temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		//print
		
		System.out.println("\nsorted array:");
		for(int i=0;i<array.length;i++)
		{
		System.out.print(array[i]);
		if(i==array.length)
			break;
		System.out.print(",");
		}
		
	}
	
	/*************Bubble sort***********/
	public static int[]  bubbleSort( int[] array) {

		int n = array.length;
		
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
				if(array[j]<array[i]) 
				   {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
              		}
		      	}
      		}
		
			return array;
	}	 
	
	
	/**************frequency count**************/
	public static int frequecyCount(String str) 
	{
		 String s[] = str.split(" ");
         System.out.println("original String:");
         for(int i = 0; i< s.length ; i++)
         {
         System.out.print(s[i]);
         System.out.print(" ");
         }
         for(int i = 0; i< s.length ; i++)
         {
         	for(int j = i+1; j < s.length; j++)
         	{
         	if(s[i].compareTo(s[j]) > 0)
         	{
         		String temp = s[i];
         		s[i] = s[j];
         		s[j] = temp;
         	}
         }
         }
         System.out.println();
         System.out.println("\nSorted String:");
         
         for(int i = 0; i< s.length ; i++)
         {
         System.out.print(s[i]);
         System.out.print(" ");
         }
         System.out.println("\n");
         
         int count = 1;
         for(int i = 0; i< s.length ; i++)
         {
        	
         	for(int j = i+1; j < s.length; j++)
         	{
         		if(s[i].equals(s[j]))
         		{
         			count ++;
         			s[j] = "0";
         		}
         }
         	if(s[i] != "0")
         	{
         		System.out.println("Frequency of '" + s[i]+"':"+count );
         	}
         count = 1;
 }
		return count;

	}		
	
	


}

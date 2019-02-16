package com.orderedlist;

import java.io.FileNotFoundException;
import java.util.Scanner;

import utility.Utility;
/**
 * @author Sushant Patwari
 * @purpose search integer from linked list
 */
public class Runner 
{
	public static void main(String args[]) throws FileNotFoundException
		{
		OrderList <Integer> linkedlist = new OrderList<Integer>(); //create object
		Scanner sc = new Scanner(System.in);
		String file ="/home/admin1/eclipse-workspace/Felloship/src/SearchInteger";
		String str = Utility.readFile(file);  //read file
		String num[] = str.split(",");
		int number[] = new int[num.length];
		int i =0 ;
		for( i = 0; i <number.length;i++ )  
		{
			number[i] =(int) Integer.parseInt(num[i]); //convert readed string to integer
		}
		
		 for(i = 0; i < number.length;i++)
	     {
	    	 linkedlist.add(number[i]);       //add element into list    
	     }
		 linkedlist.display();
		
		 System.out.println("\nEnter number to be searched:");
		 int dataToBeSearched = sc.nextInt();
		 sc.close();
		
		int result=linkedlist.search(dataToBeSearched);  //check if word is present or not
		if( result>0)
		   {
			 System.out.println("\nyour number found and now it is removed");  
			 linkedlist.remove(dataToBeSearched);   //if found then remove
			 linkedlist.display();
			 
		   }
			
	 if( result==-1)
	   {
		  System.out.println("\nyour number not found and it is added now...");
		  linkedlist.add(dataToBeSearched); //if not found then add
		  linkedlist.display();
		  
	   }
	   
	}
}
	


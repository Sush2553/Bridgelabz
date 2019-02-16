package com.unoderedList;

import java.io.FileNotFoundException;

import utility.Utility;
/**
 * @author Sushant Patwari
 * @purpose seach word from linked list
 */
public class UnOrderListRunner 
{
	public static void main(String args[]) throws FileNotFoundException
	{
	  UnOrderList<String> list = new UnOrderList<>();	
	 String file = ("/home/admin1/Desktop/pre-felloship-programs/week5/src/searchWord.txt");
				 String str = Utility.readFile(file);  
	    	     String array[] =str.split(" "); // add element into array
	    	     for(int i = 0; i < array.length;i++)
	    	     {
	    	    	 list.add(array[i]);                  //add element to list    
	    	     }
	    	     list.display(); //display list
	    	    
	    	     System.out.println("\n\nEnter which word you want to search:");
	    	     String search = Utility.getString();
	    	     
	  
	    	     if(list.search(search))     //if found then remove
	    	     {
	    	    	 System.out.println("your word found..");
	    	    	 list.remove(search);
	    	    	 System.out.println("found word removed....");
	    	     }
	    	     else 
	    	     {
	    	    	 System.out.println("your word not found..");	//if not found,then add
	    	    	 list.add(search);
	    	    	 System.out.println("your word added to linked list....");
	    	     }
	    	     list.display();                      //display new list
	    	    
	   
	    	    }
}

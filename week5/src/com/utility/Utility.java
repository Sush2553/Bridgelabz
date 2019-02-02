package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.week5.dataStructure.Node;

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
	
	public static boolean getBoolean() {
		boolean booleanValue = sc.nextBoolean();
		return booleanValue;
	}
	
	
	
	/***********search word from linked list
	 * @throws FileNotFoundException *******/
	
	public static void seachWordFromLinkedList() throws FileNotFoundException
	{
		Scanner file=new Scanner(new File("/home/admin1/Desktop/pre-felloship-programs/week5/src/searchWord.txt"));
		String str="";
		while(file.hasNext())
		{
			str=str+file.nextLine();
		}
		file.close();
		String wordArray[]=str.split(" ");
	
		//add to linked list
		Node head=null;
		for(int i=0;i<wordArray.length;i++)
			{
			Node newNode=new Node();
			newNode.data=wordArray[i];
			newNode.next=null;
	
			if(head==null)
			{
			head=newNode;
			}
			else
			{
			Node n=head;
				while(n.next!=null)
				{
				n=n.next;
				}
				n.next=newNode;
			}
			}
	
		//display
		System.out.println("your linked list is:\n");
		Node n=head;
		while(n.next!=null)
		{
		System.out.print(n.data+" ");
		n=n.next;
		}
		System.out.print(n.data);

		//search
		System.out.println("\nwhich word you want to search??");
		String wordToSearch=sc.next();
		Node a=head;
		int result=0;
		for(int i=0;i<wordArray.length;i++)
		{
			if(wordToSearch.compareToIgnoreCase(a.data)==0)
			{
			System.out.println("found");
			result=1;
			break;
			}
			a=a.next;
			if(i==wordArray.length-1)
			System.out.println("Sry not found");
		} 
		//if not found then add
		if(result==0)
		{
			Node newNode=new Node();
			newNode.data=wordToSearch;
			newNode.next=null;
	   
			Node b=head;
			while(b.next!=null)
			{
			b=b.next;
			}
			b.next=newNode;
			System.out.println(wordToSearch+" added to linked list.\n new list is :\n");
		//display
			Node c=head;
		while(c.next!=null)
		{
			System.out.print(c.data+" ");
			c=c.next;
		}
	System.out.print(c.data);
   }
	   
}


	
	
	//program for balanced parenthesis
	//expression is balanced or not
	public static void checkForBalancedParenthesis()
	{
		int top =-1,result=0;
		char stack[]=new char[20];
		char a = 0,b = 0;
		String expression;
		System.out.println("enter your expression:");
		expression=sc.next();
		int strLength=expression.length();
		
		for(int i=0;i<strLength;i++)
		{
			
			if(expression.charAt(i)=='{' || expression.charAt(i)=='[' || expression.charAt(i)=='(' )
			{
				top++;
				stack[top]=expression.charAt(i);
				
			}			
			
			else if(expression.charAt(i)=='}' || expression.charAt(i)==']' || expression.charAt(i)==')')
			{
				 b=expression.charAt(i);
				 a=stack[top];
				top--;
				
			}
			
			result=0;
			if((a=='{' && b=='}') ||( a=='[' && b==']') || (a=='(' && b==')'))
				result=1;
		}
			
		if(result==1 && top==-1)
				System.out.println("expression is balanced..");
			
		else
				System.out.println("unbalanced");
	}
	
	
	
	
}

package com.bridgelabz.week2;

import com.utility.week2.Utility;

public class StringFunctions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(" 1.anagram \n 2.palindrome\n 3.permutation using Iterative\n 4.permutation recursion\n 5.check String equality\n Please enter your choice:");
		int ch=Utility.sc.nextInt();
		
			switch(ch)
			{
			case 1:
					if(Utility.checkAnagram()) 
					System.out.println("string is anagram");	
					else
					System.out.println("not anagram");
					break;
			case 2:
					if(Utility.isPalindrome())
					System.out.println("string is palindrome");
					else
						System.out.println("string isn't palindrome");	
					break;
					
			case 3:
					Utility.getPermutation("abc",0, 2);
					break;	
				
		//	case 4:
			//		Utility.permutations("abc");
				//	break;	
					
			case 5:
					Utility.getStringEquality("Sushant","Sushant");
					break;
			default:
					System.out.println("Envalid choice");
		}

	}
}
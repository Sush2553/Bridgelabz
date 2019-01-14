package com.bridgelabz.SearchingAndSorting;

import com.utility.week3.Utility;

public class PrimePalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("prime palindromes:");
		int result[][]=Utility.primePalindromeCheck(1000);
		for(int i=0;i<20;i++)
		{
			System.out.print(result[0][i]);
			if(i==19)
				break;
			System.out.print(",");
		}
	}

}
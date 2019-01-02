package com.bridgelabz.SearchingAndSorting;

import com.utility.week3.Utility;

public class PrimeAnagram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int res[]=Utility.primeAnagrams(1000);
		System.out.println("prime anagram pairs are:");
		for(int i=0;i<158;i=i+2)
		{
			System.out.print(res[i]+" & "+res[i+1]+"\n");
		}
	}

}
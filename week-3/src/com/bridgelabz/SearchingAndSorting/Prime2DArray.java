package com.bridgelabz.SearchingAndSorting;

import com.utility.week3.Utility;

public class Prime2DArray{

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter number upto which you want to find prime number:");
		
		System.out.print("\t\t\t\t");
		for(int x=1;x<=20;x++)
		{
			System.out.print("col"+x+"\t");
		}
		System.out.println("\n");
		
		int prime[][]=	Utility.prime2DArray(1000);
		
		for(int k=0;k<10;k++)
		{
		System.out.print("range:"+(k*100+1)+"-"+(k*100+100)+"\t");
		System.out.print(" row"+(k+1)+"-->\t");
			for(int l=0;l<20;l++) 
			{
			System.out.print(prime[k][l]+"\t");
			}
			System.out.println();
		}
		
		
	}
}

package com.bridgelabz.SearchingAndSorting;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=121,rev=0,rem;
		int temp=i;
		while(i>0)
		{
			rem=i%10;
			rev=rev*10+rem;
			i=i/10;
		}
	
	if(temp==rev) {
		System.out.println("palin");
	}
	}}


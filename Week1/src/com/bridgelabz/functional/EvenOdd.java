package com.bridgelabz.functional;



public class EvenOdd {

	public  int checkEven(int n)
	{
		if(n==0) {	System.out.println(n+" ..");
			return 0;}
	
		if(n%2==0) {	System.out.println(n+" is even..");
			return 1;}
		else {	System.out.println("odd..");
			return 0;}
	}
}
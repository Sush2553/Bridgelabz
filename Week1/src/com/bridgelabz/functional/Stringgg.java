package com.bridgelabz.functional;

public class Stringgg {
	 
	public static void getName(String str1,String str2,String str3)
	{
		
	String arr[] = str1.split (" ");
	for(int i=0;i<=arr.length-1;i++)
		{
		
		if(arr[i].equals(str2))
			{
			arr[i]=str3;
			}
		
		}
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getName("My name is Sushant","Sushant","S.s.p");
	}

}

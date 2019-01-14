package com.bridgelabz.SearchingAndSorting;



import com.utility.week3.Utility;

public class BinarySeachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		res=Utility.binarySearchWord();
		if(res==-1)
			System.out.println("your word not found");
		  else
		    System.out.println("your word found at index:"+res);

	}

}

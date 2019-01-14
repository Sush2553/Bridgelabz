package com.bridgelabz.SearchingAndSorting;

import java.util.Scanner;

import com.utility.week3.Utility;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of rows:");
		int row=sc.nextInt();
		System.out.println("enter no. of columns:");
		int col=sc.nextInt();
		int [][]array = new int [row][col];
		System.out.println("Enter element of matrix :");
  	  
  	  for(int i=0;i<row;i++) 
  	  {
  		  for(int j=0;j<col;j++) 
  		  {
  			   array[i][j] = Utility.getInt();
  		  }
  	  }
  	  System.out.println();
  	  sc.close();
  	  Utility.matricTraspos(row,col,array);
	
	}
}
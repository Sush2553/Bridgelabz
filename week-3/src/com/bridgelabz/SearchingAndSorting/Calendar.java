package com.bridgelabz.SearchingAndSorting;

import java.util.Scanner;

import com.utility.week3.Utility;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m,y;
		System.out.println("enter month");
		m=sc.nextInt();
		System.out.println("enter year");
		y=sc.nextInt();
		sc.close();
		Utility.calender(m, y);
	}

}
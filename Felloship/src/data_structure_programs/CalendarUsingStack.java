package data_structure_programs;

import java.util.Scanner;

import utility.Utility;
/**
 * @author Sushant Patwari
 * @purpose To print calendar using stack
 */
public class CalendarUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month");
		int month=sc.nextInt();
		System.out.println("enter year");
		int year=sc.nextInt();
		sc.close();
		Utility.calenderStack(month,year);
	}

}

package algorithm_programs;

import java.util.Scanner;

import utility.Utility;

public class VendingMachine {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1,2,5,10,50,100,500,100
		System.out.println("how much money should be returned?");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		Utility.vending(n);
	}

}

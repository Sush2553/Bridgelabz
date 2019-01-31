package algorithm_programs;

import utility.Utility;

public class PrimePalimdromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result[]=Utility.primePalindromeCheck(1000);
		System.out.println("prime palindromes are:");
		for(int i:result)
		{
			System.out.println(i);
		}
	}

}

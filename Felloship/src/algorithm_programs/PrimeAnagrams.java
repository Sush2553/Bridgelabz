package algorithm_programs;

import utility.Utility;

/**
 * @author Sushant Patwari
 * @since  29/01/2019
 */
public class PrimeAnagrams 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int result[]=Utility.primeAnagrams(1000);
		System.out.println("prime anagram pairs are:");
		for(int i=0;i<158;i=i+2)
		{
			System.out.print(result[i]+" & "+result[i+1]+"\n");
		}
	}

}

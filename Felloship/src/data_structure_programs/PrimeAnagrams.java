package data_structure_programs;
/**
 * @author Sushant Patwari
 * @purpose To get prime anagrams between 0-1000
 */

public class PrimeAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res[]=Utility_datastructure.primeAnagrams(1000);
		System.out.println("prime anagram pairs are:");
		for(int i=0;i<158;i=i+2)
		{
			System.out.print(res[i]+" & "+res[i+1]+"\n");
		}
	}

}

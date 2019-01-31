package functional_Programs;

import utility.Utility;
/**
 * @author Sushant Patwari
 * @version 1.0
 */
public class HarmonicSeries {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter value of n:");
		n=Utility.getInt(); //user input
		if(n>0)	//check for given number greater than 0
		{
		System.out.print("Harmonic series:\n\t\tHn=");
		for(int i=1;i<=n;i++)
		{
			System.out.print("1/"+i);
			if(i==n)
				break;
			System.out.print(" +");
		}
		}
		else
			System.out.println("n should be greater than 0");
	}

}

package functional_Programs;

import utility.Utility;
/**
 * @author Sushant Patwari
 * @version 1.0
 */
public class PowerOfTwo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("enter +ve number");
		int n=Utility.getInt();
		int power=0;
		if(n<0) 
			{
			System.out.println("value of n should be greater than or equal to zero");
			}
		else 
			if(n<=31)
			{
			System.out.println("power of 2: ");
			for(int i=0;i<=n;i++) 
				{
				power = (int) Math.pow(2, i);
				System.out.println("2 ^ "+i+" = "+power);
				}
			}
			else
				System.out.println("integer value should be less than or equal to 31");

	}

}

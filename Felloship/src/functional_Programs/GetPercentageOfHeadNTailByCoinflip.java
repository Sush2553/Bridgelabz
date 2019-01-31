package functional_Programs;

import utility.Utility;
/**
 * @author Sushant Patwari
 * @version 1.0
 */
public class GetPercentageOfHeadNTailByCoinflip 
{
	public static void main(String args[]) 
	{
	int f;
	System.out.println("enter number of flips:");
	f=Utility.getInt();
	int tail = 0;
	int head = 0;
	
	if(f>0) 
	{
		double d[]=new double[f];
		for(int i=0;i<f;i++) 
		{
			d[i]= Math.random();
			System.out.println(d[i]);
			if(d[i]<0.5) 
			{
				System.out.println("Head");
				head++;
			}
			else 
			{
				System.out.println("Tail");
				tail++;
			}
		}
	System.out.println();
	float Heads  = (head*100)/f;
	System.out.println("head  %= "+Heads);
	float Tails  = (tail*100)/f;
	System.out.println("tail %= "+Tails);
	}	
		
	else 
	{
		System.out.println("flips should be greater than 0");
		
	}	
	}
}

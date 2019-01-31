package algorithm_programs;

import utility.Utility;

public class PrimeBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter value of n:");
		int n=Utility.getInt();
		int a=1;	//starting point
		if(a==1)
			a++;
		if(a>0 && n>0) 		//check for negative intervals
		{
			for(int i=a;i<=n;i++)
			{
				if(Utility.isPrime(i)) 	//prime check
						System.out.print(i+" ");
			}
		}
		else
		{
			System.out.println("please enter +ve intervals only..");
		}
	}

}

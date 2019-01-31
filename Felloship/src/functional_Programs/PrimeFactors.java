package functional_Programs;

import utility.Utility;

/**
 * @author Sushant Patwari
 * @version 1.0
 */
public class PrimeFactors {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i, j, number, isPrime;
		//take user input
		System.out.println("enter number to find prime factors:");
		number=Utility.getInt();
	   
		//check for prime number
	    System.out.println("prime factors of "+number+" are:");
	    for(i=2; i<=number; i++)
	    {
	         isPrime = 1;
	            for(j=2; j*j<=i-1; j++)
	            {
	                if(i%j==0)
	                {
	                    isPrime = 0;
	                    break;
	                }
	            }
	            
	            //if prime,check whether it divides given no. or not
	            if(isPrime==1)
	            {
	            	if(number%i==0)
	                System.out.println(i);
	            }
	
	        
	    }
	}

}

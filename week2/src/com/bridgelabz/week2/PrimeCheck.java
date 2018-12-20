package com.bridgelabz.week2;

import com.utility.week2.Utility;

public class PrimeCheck {

	public static void main(String[] args) 
	{
				System.out.println("Enter no.");
				int n = Utility.getInt();
				if(isPrime(n)) 
				{
					System.out.println("true");
				}
				else 
				{
					System.out.print("false");
				}
			}

			public static boolean isPrime(int n) 
			{
				int temp;
				if(n<0) 
				{
					System.out.println("please enter positive number: ");
					 temp = Utility.getInt();
					 return PrimeCheck.isPrime(temp);
				}
				
				if(n<=1)
				{
					return false;
				}
				else 
				{
					for(int i = 2 ; i <=n-1 ; i++) 
					{
						if(n%i==0)
						{
							return false;
						}
					}
				}
				return true;
			}

		
	}



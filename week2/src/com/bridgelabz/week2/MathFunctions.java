package com.bridgelabz.week2;

import com.utility.week2.Utility;

public class MathFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 1. Harmonic series\n 2. Sine of angle\n 3. Cosine of angle\n 4. Decimal to binary conversion \n 5. factorial \n 6. find maximum from array\n 7. find minimum from array \n enter your choice:");
		int ch=Utility.sc.nextInt();
		
		switch(ch)
		{
		case 1:
				double z=Utility.findHarmonicSeries();
				System.out.println(z);
				break;
		case 2:
				double y=Utility.evaluateSineFunction();
				System.out.println(y);
				break;
				
		case 3:
				double x=Utility.evaluateCosineFunction();
				System.out.println(x);
				break;
		case 4:
				String a=Utility.getBinary();
				System.out.println(a);
				break;
			
		case 5:
				int b=Utility.printFactorial();
				System.out.println(b);
				break;
				
		case 6:
				int d=Utility.findLargestFromArray();
				System.out.println(d);
				break;
				
		case 7:
			int e=Utility.findSmallestFromArray();
			System.out.println(e);
			break;
	}
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
}

package functional_Programs;

import utility.Utility;

public class Coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("how many distinct coupons you wants to generate :");
		int n = Utility.getInt();
		int result=Utility.RandomNumberGeneration(n);
		System.out.println("to generate "+n+" random distinct numbers we require "+result+" random numbers.");
	}

}

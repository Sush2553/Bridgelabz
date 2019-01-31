package functional_Programs;

import utility.Utility;

public class WindChill {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		System.out.println("enter value for v between 3-120 and less than 50 for t:");
		double v=Utility.getDouble();
		double t=Utility.getDouble();
		//check for valid input
		if(t>50 || v>120 || v<3) 
		{
			System.out.println("invalid values: ");
			
		}

		else
		{
			double w = 35.74 + 0.6215*t + ((0.4275*t) - 35.75) * Math.pow(v, 0.16);
			System.out.println("wind-chill: "+w);
		}
	}

}

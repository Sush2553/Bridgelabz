package functional_Programs;

import utility.Utility;

public class Quadratic {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter values for a,b,c");
		int a=Utility.getInt();
		int b=Utility.getInt();
		int c=Utility.getInt();
		double delta,root1,root2;
		delta=(b*b)-(4*a*c);
		root1=(-b+Math.sqrt(delta))/(2*a);
		root2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("Two roots are as  follows:\n"+root1+" and "+root2);
	
	}

}

package functional_Programs;

import utility.Utility;

public class EuclideanDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value of point x,y");
		int x=Utility.getInt();
		int y=Utility.getInt();
		double distance=Math.sqrt((Math.pow(x,x))+(Math.pow(y,y)));
		System.out.println("Euclidean distance from point "+"("+x+","+y+")"+" to the origin(0,0) is: "+distance);

	}

}

package com.bridgelabz.week2;

import com.utility.week2.Utility;

public class CollinearUsingSlope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(Utility.checkSlope(2,4,4,6,6,8))
			System.out.println("given points are collinear");
		else
			System.out.println("given points are not collinear");
	}

}

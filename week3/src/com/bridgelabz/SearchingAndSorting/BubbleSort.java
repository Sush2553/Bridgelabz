package com.bridgelabz.SearchingAndSorting;

import com.utility.week3.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {5,6,1,9,3};
		int res[]=Utility.bubbleSort(array);
		for(int i=0;i<res.length;i++) {
		System.out.print(res[i]);
		if(i==res.length-1)
			break;
		System.out.print(",");
		}
	}

}

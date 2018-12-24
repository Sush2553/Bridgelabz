package com.bridgelabz.week2;

import com.bridgelabz.lib.BLStdOut;
import com.utility.week2.Utility;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("Enter Year: ");
		int y = Utility.getInt();
		System.out.println("Enter Month: ");
		int m = Utility.getInt();
		
		if(y<0 ) {
			System.out.println("Please enter positive year: ");
			y = Utility.getInt();

		}if(m<0) {
			System.out.println("Please enter positive month: ");
			m = Utility.getInt();

		}
		
		
		
		String[] months = {" ","January","February","March","April","May","Jun",
				"July","August","September","October","November","December"};//from 1=january upto 12=Dec
		
		int[] days= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(months[m] == "January") {
		}
		if(months[m] == "February") {
		}
		if(months[m] == "March") {
		}
		if(months[m] == "April") {
		}
		if(months[m] == "May") {
		}
		if(months[m] == "Jun") {
		}
		if(months[m] == "July") {
		}
		if(months[m] == "August") {
		}
		if(months[m] == "September") {
		}
		if(months[m] == "October") {
		}
		if(months[m] == "November") {
		}
		if(months[m] == "December") {
		}
		
		if(m == 2) {
			if(y%4==0 || y%400==0 && y%100!=0)
			days[m] = 29;		
			}
	
		
		int dy = Utility.dayOfWeek1(y, m,1);	

		
		System .out.println(" ");
		
		System.out.println(months[m]+ "  "+y);
		System.out.println("S  M  T  W  Th  F  S");

		
		//call day of week
		
		
        //String array2;
			    for (int i = 0; i < dy; i++)
			        BLStdOut.print("   ");
			    for (int i = 1; i <= days[m]; i++) {
			    	System.out.printf("%2d ",i);
			        if (((i + dy) % 7 == 0)) 
			        	System.out.println();
			    }
	       }
	}

	

		//System.out.println(array2);
		
		//System.out.println(array1[k]);
		//System.out.println(array2[]);
			/*for(int i = 0; i < row; i++)
		 	{
		 		for(j = 0; j < column; j++) 
		 		{
		 			array[i][j] = k;
					System.out.print(array[i][j]+" ");
		 			System.out.print(" ");
		 		}
		 	}*/
			
		
	 	


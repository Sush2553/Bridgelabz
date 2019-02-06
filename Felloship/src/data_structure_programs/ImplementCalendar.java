package data_structure_programs;

import utility.Utility;

public class ImplementCalendar
{
	public static void calenderShow(int month, int year) {

		String s[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		int arr[][] = new int[6][7];
		//get d0 value hence upto d0 we will add null values
		int d=1,y=year,m=month;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		System.out.println(d0);
		int start=d0;
		int count =1;
		//assign total number of days in month
		int totalDaysInMonth = 0;
		if (month == 2) 
		{
		if(Utility.isLeapYear(year)) //if leap year,days in feb will be 29
			totalDaysInMonth = 29;
		else 
			totalDaysInMonth = 28;
		}
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) 
			totalDaysInMonth = 31;
		else 
			totalDaysInMonth = 30;
		
		
	outer:	for (int i = 0; i < 6; i++) 
		{
			for (int j = start; j < 7; j++) 
			{
				if (count <= totalDaysInMonth) 
				{
					arr[i][j] = count;
					count++;
				} 
				else 
				{
					break outer;
				}
			}
			start = 0;
		}
		System.out.println(s[month - 1] + " " + year);
		System.out.println("S  M  T  W  T  F  S");
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 0; j < 7; j++) 
			{
				if (arr[i][j] == 0) 
				{
					System.out.print("   ");
				} 
				else if (arr[i][j] > 9) 
				{
					System.out.print(arr[i][j] + " ");
				} 
				else 
				{
					System.out.print(arr[i][j] + "  ");
				}
			}
			System.out.println();
		}

}

}



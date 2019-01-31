package functional_Programs;

import utility.Utility;
/**
 * @author Sushant Patwari
 * @version 1.0
 */
public class LeapYearCheck {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int year;
		System.out.println("please enter year: ");
		year=Utility.getInt();

			if(year>=1582)
			{
				if(year%4 == 0 && year%100 != 0 || year%400 == 0) 
				{
					System.out.println(year+" is a leap year");
				}	
				else 
				{
					System.out.println(year+" is not a aleap year");;
				}
			}
			else
			{
				System.out.println("year should be greater than or equals to 1582");
				
			}
	}

}

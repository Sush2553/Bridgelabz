package cliniqueManagement;

import java.text.ParseException;
import java.util.Date;
import com.utility.Utility;
public class Clinique {
static Date date;
	
	public static void main(String[] args) throws ParseException 
	{ 
		int choice=0;
		
		do {
			System.out.println("\n1. Add Doctor or Patient or fix an Appointment");
			System.out.println("2. Search doctor");
			System.out.println("3. Display details");
			System.out.println("4. Close");
			choice=Utility.getInt();
			switch(choice)
			{
			case 1:
				new DoctorPatientImplementation().operation();
				break;
			case 2:
				new SearchingImplementation().operation();
				break;
			case 3:
				new InformationDisplayImplementation().operation();
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		}while(choice!=4);

	}

}


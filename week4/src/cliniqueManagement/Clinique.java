package cliniqueManagement;

import java.text.ParseException;
import java.util.Date;
import com.utility.Utility;
/**
 * @author Sushant Patwari
 * @since  10/02/2019
 * @aim runner class for clinique management
 */

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
				//to add doctor or patients details or to fix appointment
				new DoctorPatientImplementation().operation();
				break;
			case 2:
				//to search doctor details
				new SearchingImplementation().operation();
				break;
			case 3:
				//to display information
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


package cliniqueManagement;
import java.text.ParseException;
import java.util.Date;
import com.utility.Utility;
/**
 * @author Sushant Patwari
 * @since 10/02/2019
 * @aim runner class for clinique management
 */
public class Clinique {
	static Date date;
	public static void main(String[] args) throws ParseException {
		int choice = 0;
		do {
			System.out.println(
					"\n1. Add Doctor or Patient or fix an Appointment\n2. Search doctor\n3. Display details\n4. Close");
			choice = Utility.getInt();
			switch (choice) {
			case 1:
				new DoctorPatientImplementation().operation(); // to add doctor or patients details or to fix appointment
				break;
			case 2:
				new SearchingImplementation().operation(); // to search doctor details
				break;
			case 3:
				new InformationDisplayImplementation().operation(); 	// to display information
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (choice != 4);
	}
}

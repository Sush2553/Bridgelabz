package cliniqueManagement;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.utility.Utility;

public class InformationDisplayImplementation implements InformationDisplay {

	static ObjectMapper mapper = new ObjectMapper();
	List<Patients> personlist = new ArrayList<>();
	List<Doctor> doctorlist = new ArrayList<>();
	List<Appointment> appointmentlist = new ArrayList<>();

	{
		try {
			personlist = mapper.readValue(
					new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/cliniqueManagement/Patients.json"),
					new TypeReference<List<Patients>>() {
					});
			doctorlist = mapper.readValue(
					new File("/home/admin1/Desktop/pre-felloship-programs/week4/src/cliniqueManagement/Doctors.json"),
					new TypeReference<List<Doctor>>() {
					});
			appointmentlist = mapper.readValue(new File(
					"/home/admin1/Desktop/pre-felloship-programs/week4/src/cliniqueManagement/Appointment.json"),
					new TypeReference<List<Appointment>>() {
					});

		} catch (Exception e) {

		}
	}

	public void operation() {
		int Answer = 0;
		do {
			System.out.println("\n1. Print Doctors Information");
			System.out.println("2. Print Patients Information");
			System.out.println("3. Print Appointments Information");
			System.out.println("4. Exit");
			Answer = Utility.getInt();
			switch (Answer) {
			case 1:
				doctorInformation();
				break;
			case 2:
				patientInformation();
				break;
			case 3:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (Answer != 3);
	}

	@Override
	public void patientInformation() {
		// TODO Auto-generated method stub
		// String spaces=" ";
		System.out.println("Name     id \t Phone  \tage");
		personlist.stream().forEach(i -> {
			System.out.println(i.getName() + "\t  " + i.getId() + "\t" + i.getPhone() + "\t" + i.getAge());
		});

	}

	@Override
	public void doctorInformation() {
		// TODO Auto-generated method stub
		// String spaces=" ";
		System.out.println("Name     id  availability  specialization");
		doctorlist.stream().forEach(i -> {
			System.out.println(
					i.getName() + "\t  " + i.getId() + "\t" + i.getAvailability() + "\t\t" + i.getSpecialization());
		});
	}

}
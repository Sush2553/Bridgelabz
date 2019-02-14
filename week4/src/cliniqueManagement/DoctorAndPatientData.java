package cliniqueManagement;
/**
 * @author Sushant Patwari
 * @since  10/02/2019
 * @aim interface for doctor and patient data
 */
public interface DoctorAndPatientData {
	public void operation();
	void addPatient();
	void deletePatient();
	void addDoctor();
	void deleteDoctor();
	void fixAppointment();
	void save();
}


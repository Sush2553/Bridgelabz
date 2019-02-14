package addressBook;
/**
 * @author Sushant Patwari
 * @since  10/02/2019
 * @aim pojo class for PersonDetails
 */
public class PersonDetails {
	private String firstName;
	private String lastName;
	private Address address;
	private PhoneNumber phoneNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "PersonDetails [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	

	
}
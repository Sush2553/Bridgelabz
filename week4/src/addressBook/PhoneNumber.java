package addressBook;
/**
 * @author Sushant Patwari
 * @since  10/02/2019
 * @aim pojo class for mobile number
 */
public class PhoneNumber 
{
	long mobileNumber;
	@Override
	public String toString() {
		return "PhoneNumber [mobileNumber=" + mobileNumber + "]";
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	

}
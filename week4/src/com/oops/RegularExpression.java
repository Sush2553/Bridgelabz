package com.oops;
/**
 * @author Sushant Patwari
 * @since  11/02/2019
 * @aim to implenment regular expression
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegularExpression {
	public static void regexExpression(String fullName, String mobile, String firstName) {
		// your message to be displayed
		String Message = "Hello <<name>>, We have your full name "
				+ "as <<full name>> in our system. \nYour contact number is +91­xxxxxxxxxx. \nPlease,let us "
				+ "know in case of any clarification.\n\t\t\t Thank you!!!\n\t\t\t BridgeLabz 01/01/2016. ";
		// create regex
		String regexName = "<<name>>";
		String regexFname = "<<full name>>";
		String regexNum = "­xxxxxxxxxx";
		String regexDate = "01/01/2016";
		SimpleDateFormat Date = new SimpleDateFormat("dd/MM/yyyy"); // define date format
		Date date = new Date(); // to get current time and date
		String fdate = Date.format(date);

		Message = Message.replaceAll(regexName, firstName);// replace regexname with firstName
		Message = Message.replaceAll(regexFname, fullName);// replace regexFname with fullName
		Message = Message.replaceAll(regexNum, mobile);// replace regexNum with mobile
		Message = Message.replaceAll(regexDate, fdate);// repalce regexDate with fdate

		System.out.println(Message);//display modified message
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		regexExpression("Sushant Shridhar Patwari", "7558525201", "Sush");
	}

}

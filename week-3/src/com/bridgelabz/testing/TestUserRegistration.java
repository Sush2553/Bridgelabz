package com.bridgelabz.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.utility.week3.Utility;

public class TestUserRegistration {

	@Test
	public void testUserRegistration() {
		String a,b,c,d,e,f;
		a=Utility.checkFname();
		b=Utility.checkLname();
		c=Utility.checkPhoneNumber();
		d=Utility.checkEmail("sush@gmail.com");
		e=Utility.checkUserId();
		f=Utility.checkPassword();
		System.out.println("\nYour details are as follows:");
		System.out.println("first name:"+a+"\n"+"last name:"+b+"\n"+"contact:"+c+"\n"+"email:"+d+"\n"+"useId:"+e+"\n"+"password:"+f);
		assertEquals("sush@gmail.com",d);	
	}

}

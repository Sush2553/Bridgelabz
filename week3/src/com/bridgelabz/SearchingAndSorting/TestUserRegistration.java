package com.bridgelabz.SearchingAndSorting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.utility.week3.Utility;

public class TestUserRegistration {

	@Test
	public void testUserRegistration() {
		String a,b,c,d,e,f;
		a=Utility.checkFname();
		b=Utility.checkLname();
		c=Utility.checkPhoneNumber();
		d=Utility.checkEmail("sush");
		e=Utility.checkUserId();
		f=Utility.checkPassword();
		System.out.println("Your details are as follows:");
		System.out.println("first name:"+a+"\n"+"last name:"+b+"\n"+"contact:"+c+"\n"+"email:"+d+"\n"+"useId:"+e+"\n"+"password:"+f);
		assertEquals("invalid",d);	
	}

}

package com.bridgelabz.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.utility.week3.Utility;

public class TestRepeatedNumber {

	@Test
	public void testReapeatedNumber() {
		int array[]= {5,15,10,7,6,65,57,7,91,78};
		int expected[]= {7};
		int actual[]=Utility.findrepeatedNumber(array);	
		assertArrayEquals(expected, actual);
	}

}

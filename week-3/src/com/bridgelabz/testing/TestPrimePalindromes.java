package com.bridgelabz.testing;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.utility.week3.Utility;

public class TestPrimePalindromes {

	@Test
	public void testPrimePalindromes() {
		int expected[][]= {{2,3,5,7,11,101,131,151,181,191,313,353,373,383,727,757,787,797,919,929}};
		int actual[][]=Utility.primePalindromeCheck(1000);
		assertArrayEquals(expected, actual);
	}

}

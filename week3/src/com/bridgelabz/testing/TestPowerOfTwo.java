 package com.bridgelabz.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.utility.week3.Utility;

public class TestPowerOfTwo {

	@Test
	public void powerOfTwotest() {
		int res[][]=new int[3][3];
			res=Utility.getPowerOfTwo();
		int expected[][]= {{1,2,4,8},{16,32,64,0},{128,256,512,0}};
		
		assertArrayEquals(expected,res);
	}
}

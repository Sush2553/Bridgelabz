package com.bridgelabz.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.utility.week3.Utility;

public class TestTransposeOfMatrix {

	@Test
	public void testTransposeOfMatrix() 
	{
	int inputArray[][]= {{1,2,3},{4,5,6},{7,8,9}};	
	int expectedArray[][]= {{1,4,7},{2,5,8},{3,6,9}};
	int actualArray[][]=new int[3][3];
	actualArray=Utility.matricTraspos(3,3,inputArray);
	assertArrayEquals(expectedArray, actualArray);
	}

}

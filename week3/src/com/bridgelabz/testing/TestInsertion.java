package com.bridgelabz.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.utility.week3.Utility;
public class TestInsertion
{
@Test
	public void testInsertionSort() 
	{
	String array[]= {"cat","apple","banana"};
	String actual[]=Utility.insertionSort(array);
	String expected[]= {"apple","banana","cat"};
	assertArrayEquals(expected, actual);
	}

}

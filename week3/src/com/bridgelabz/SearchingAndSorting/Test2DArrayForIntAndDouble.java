package com.bridgelabz.SearchingAndSorting;




import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.utility.week3.Utility;

public class Test2DArrayForIntAndDouble {

	@Test
	public void test2DArrayForIntAndDouble() 
	{
		 ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		 Utility.print2DArray(1);
	        System.setOut(new PrintStream(outContent));
	               		System.out.println( outContent.toString());
	               		System.out.println( outContent.toString());
	 
		
	}

}

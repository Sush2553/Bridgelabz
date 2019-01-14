package com.bridgelabz.testing;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.utility.week3.Utility;

public class TestBinarySearchWord 
{
	@Test
	public void testBinaryWord() throws IOException 
	{
		int res;
		int expected=-1;
		res=Utility.binarySearchWord();
		{
			for(int i=0;i<8;i++)
			{
				if(res==i) 
				expected=i;
			}
		}
	assertEquals(expected,res);
	}
}

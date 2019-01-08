
package com.bridgelabz.testing;

import static org.junit.Assert.*;

import java.io.IOException;


import org.junit.Test;

import com.utility.week3.Utility;

public class TestBinarySearchWord {

	@Test
	public void testBinaryWord() throws IOException {
				int res;
				int expected=-1;
				res=Utility.binarySearchWord();
				{
					if(res==0)
						expected=0;
				if(res==1)
					expected=1;
				if(res==2)
					expected=2;
				if(res==3)
					expected=3;
				if(res==4)
					expected=4;
				if(res==5)
					expected=5;
				if(res==6)
					expected=6;
				if(res==7)
					expected=7;
				}
				
				assertEquals(expected,res);
				
				
				
	}

}

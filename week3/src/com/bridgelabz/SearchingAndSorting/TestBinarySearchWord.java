package com.bridgelabz.SearchingAndSorting;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.utility.week3.Utility;

public class TestBinarySearchWord {

	@Test
	public void test() throws IOException {
				String res;
				assertEquals(res=Utility.binarySearchWord("banana"),"found at:1");
				System.out.println(res);
				
				assertEquals(res=Utility.binarySearchWord("cat"),"found at:2");
				System.out.println(res);
			
	}

}

package com.bridgelabz.functional;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.runner.JUnitCore;


public class Test {

	@org.junit.Test
	public void test() {
		EvenOdd t=new EvenOdd();
		//int result=t.checkEven(2);
		Assert.assertEquals(0,t.checkEven(0));
	
		assertTrue((t.checkEven(4)==1));
		

	
	}
}

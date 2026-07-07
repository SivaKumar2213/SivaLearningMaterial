package com.javabasic.fortesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc c=new Calc();
		int actualResult=c.divide(10, 5);
		int expectedResult=2;
		assertEquals(actualResult, expectedResult);
		System.out.println("success first case passed");
	}

}

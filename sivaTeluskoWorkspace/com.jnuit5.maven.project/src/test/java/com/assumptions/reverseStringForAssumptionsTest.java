package com.assumptions;
//Assumptions are used when: A test should run only under certain conditions

//assumeTrue(condition)
  //1)If the condition is true → test continues executing
  //2)If the condition is false → test is skipped (aborted)
//assumeFalse(condition)
   //1)If the condition is false → test continues executing
   //2)If the condition is true → test is skipped (aborted)
//Skipped ≠ Failed
//JUnit marks the test as Aborted / Ignored, not failed.

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

class reverseStringForAssumptionsTest {

	@Test
	void test() {
		String str="Java";
		assumeTrue(str.length()>5);
		System.out.println("Execute Running for assume True");
		assumeTrue(System.getProperty("os.name").contains("Windows"));
        System.out.println("This runs only on Windows");
		
	}
	@Test
	void test1() {
		String str="Java";
		assumeFalse(str.length()>5);
		System.out.println("Execute Running for Assume False");
		
	}
	@Test
	void testOnWindowsWithAssumeTrue() {
		assumeTrue(System.getProperty("os.name").contains("Windows"));
        System.out.println("This runs only on Windows by Assume True");
		
	}

}

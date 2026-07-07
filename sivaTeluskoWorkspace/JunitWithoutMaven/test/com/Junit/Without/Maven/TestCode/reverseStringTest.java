package com.Junit.Without.Maven.TestCode;
//@Test is an annotation used to tell JUnit that the annotated method is a test case 
//@Test-->present inside the package --> org.junit.jupiter.api.Test
//and should be executed by the test runner.
//Junit 4 -> Test methods must be public.
//JUnit 5 (Jupiter API)-->Test methods do not need to be public.They can be:
//public,protected,package-private (default)
//private methods are not allowed.
//If all test cases pass, JUnit shows a green success bar.
//If any test case fails, JUnit shows a red failure bar.
//If a test method contains no code and no failing assertions, JUnit will:Consider the test as PASSED
//Because no exception or assertion failure occurred.

//Assertions
//Assertions are used to validate test results by comparing the expected value with the actual value.
//In JUnit 5, assertion methods are present in the package --> org.junit.jupiter.api.Assertions
//All assertion methods are static, so they can be used directly or via static import.
//Result Behavior
//If expected == actual(Reality result) -->Test PASS -->Green success bar is shown
//If expected ≠ actual --> Test FAIL -->Red failure bar is shown
//Common Assertion Methods (JUnit 5)
//1)assertEquals(expected, actual);
//2)assertNotEquals(expected, actual);
//3)assertTrue(condition);
//4)assertFalse(condition);
//5)assertNull(object);
//6)assertNotNull(object);
//7)assertThrows(Exception.class, () -> methodCall());
import static org.junit.Assert.*;

import org.junit.Test;

import com.Junit.Without.Maven.JavaCode.reverseString;

public class reverseStringTest {

	@Test
	public void test() {
		reverseString rs=new reverseString();
		assertEquals("avaJ",rs.reverseGivenString("Java"));
	}

}

package com.jnuit5.maven.project;
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
//Result Behavior for assertEquals
//If expected == actual(Reality result) -->Test PASS -->Green success bar is shown
//If expected ≠ actual --> Test FAIL -->Red failure bar is shown

//Result Behavior for assertNotEquals
//If expected == actual(Reality result) -->Test Fail -->Red Failure bar is shown
//If expected ≠ actual --> Test Pass -->Green Success bar is shown

//Common Assertion Methods (JUnit 5)
//1)assertEquals(expected, actual);
//2)assertNotEquals(expected, actual);
//3)assertTrue(condition);
//4)assertFalse(condition);
//5)assertNull(object);
//6)assertNotNull(object);
//7)assertThrows(Exception.class, () -> methodCall());
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape=new Shapes();
	@Test
	void testAreaOfSquare() {
		assertEquals(576, shape.computeAreaofSquare(24));
	}
	@Test
	//The below is not an efficient way because ,if the test pass or fails the message in which string format will evaluate and test fails it will display
		
	void testAreaOfCircle() {
		assertEquals(75, shape.computeAreaofCircle(8),"Area of Circle is Wrong for input value 8 the excepted value should be 200.96");
	}
	//The below is efficient way because ,if the test fails only the message which we passing through supplier interface will evalute
	//or else it wont evaluate
	@Test
	void testAreaOfCircle_WithSupplierFunctionalInterface() {
		assertEquals(75, shape.computeAreaofCircle(8),()->"Area of Circle is Wrong for input value 8 the excepted value should be 200.96");
	}

	
	@Test
	void testAreaOfSquare_NotEquals() {
		assertNotEquals(576, shape.computeAreaofSquare(24));
	}
	@Test
	//The below is not an efficient way because ,if the test pass or fails the message in which string format will evaluate and test fails it will display
		
	void testAreaOfCircle_NotEquals() {
		assertNotEquals(75, shape.computeAreaofCircle(8),"Area of Circle is Wrong for input value 8 the excepted value should be 200.96");
	}
	//The below is efficient way because ,if the test fails only the message which we passing through supplier interface will evalute
	//or else it wont evaluate
	@Test
	void testAreaOfCircle_NotEqualsWithSupplierFunctionalInterface() {
		assertNotEquals(75, shape.computeAreaofCircle(8),()->"Area of Circle is Wrong for input value 8 the excepted value should be 200.96");
	}
}

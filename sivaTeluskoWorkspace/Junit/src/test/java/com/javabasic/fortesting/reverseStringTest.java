package com.javabasic.fortesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class reverseStringTest {
	reverseString rs=new reverseString();
	@Test
	void reverseString_OneWord() {
		assertEquals("avaJ", rs.reverseGivenString("Java"));
	}
	@Test
	public void reverseString_multipleWord() {
		assertEquals("ysae si avaJ", rs.reverseGivenString("Java is easy"));

	}
}

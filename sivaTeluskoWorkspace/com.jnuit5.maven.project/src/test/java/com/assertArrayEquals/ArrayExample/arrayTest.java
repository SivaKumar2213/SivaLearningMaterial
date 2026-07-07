package com.assertArrayEquals.ArrayExample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
//assertArrayEquals --> passes (true) only if both arrays are exactly equal
//1) Number of elements must be the same
//2) Values inside the array must be the same
//3) Order of elements must be the same
class arrayTest {

	@Test
	void testArray() {
		array ac=new array();
		int actual[]=ac.arrayExample();
		int expected[]= {2,4,6,8};
		//assertArrayEquals(expected, actual);Uncomment the line to check the fail//array contents differ at index [0], expected: <2> but was: <8>
		                                   //because first element in expected is 2 but in actual is 8
		                                   //so if we perform sort means it will be order
		
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);

		
		}
		
	}



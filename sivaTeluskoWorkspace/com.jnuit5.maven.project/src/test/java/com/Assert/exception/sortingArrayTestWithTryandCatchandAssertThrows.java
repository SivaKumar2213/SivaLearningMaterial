package com.Assert.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class sortingArrayTestWithTryandCatchandAssertThrows {
	sortingArray sa=new sortingArray();
	@Test
	void Sorttest_withTryandCatch() {
		int nums[]= {2,1,4,8};
		int nums1[]= null;
		try {
		sa.sortedArray(nums);//If it does not throw an exception we need to fail this unit
		sa.sortedArray(nums1);//if we pass nums1 it will throw an exception and execute catch block and it will pass
		fail("No Exception Occurs");
		}catch(NullPointerException e) {
			System.out.println("Exception Generated");
		}
		
	}
	
	@Test
	void Sorttest_withAssertThrows() {
		int nums[]= {2,1,4,8};
		int nums1[]= null;
		
			//assertThrows(NullPointerException.class, ()->sa.sortedArray(nums));//uncomment the line to check below exception //it will fail because does not get an exception
			                                                                 //Expected java.lang.NullPointerException to be thrown, but nothing was thrown.
			


			assertThrows(NullPointerException.class, ()->sa.sortedArray(nums1));//it will pass because givea an null pointer exception
	}

}

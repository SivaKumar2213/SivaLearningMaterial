package com.Assert.exception;
// if we pass the int array with value it will sort and return the same array
//or else it will throw an null pointer exception
import java.util.Arrays;

public class sortingArray {
public int[] sortedArray(int [] array){
	Arrays.sort(array);
	return array;
}
}

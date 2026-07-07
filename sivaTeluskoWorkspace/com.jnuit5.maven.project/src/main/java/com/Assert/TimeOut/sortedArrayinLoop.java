package com.Assert.TimeOut;

import java.util.Arrays;

public class sortedArrayinLoop {
	public int[] sortedArray(int [] array){
		for(int i=0;i<100000;i++) {
		Arrays.sort(array);
		}
		return array;
	}
}

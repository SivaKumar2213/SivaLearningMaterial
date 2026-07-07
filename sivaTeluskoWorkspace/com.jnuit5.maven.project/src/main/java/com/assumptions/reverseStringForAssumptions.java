package com.assumptions;

public class reverseStringForAssumptions {
	public String reverseGivenString(String s) {
		String reversedString="";
		for(int i=s.length()-1;i>=0;i--) {
			reversedString+=s.charAt(i);
		}
		System.out.println("Reversed String : "+reversedString);
		return reversedString;
		
	}
}

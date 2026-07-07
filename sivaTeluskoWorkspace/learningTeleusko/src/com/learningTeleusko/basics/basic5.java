package com.learningTeleusko.basics;
//Logical Operator
//&,|,!
//&&,||,!->short circuit logical operator if the first condition does not satisfy ,it will not check the next condition
public class basic5 {

	public static void main(String[] args) {
int num1=9;
int num2=7;
double x=5.6;
double y=5.8;

boolean result1=(num1>num2) && (x<y);
System.out.println(result1);

boolean result2=(num1>num2) || (x<y);
System.out.println(result2);

boolean result3=(num1<num2) && (x<y);
System.out.println(result3);

boolean result4=(num1<num2) || (x<y);
System.out.println(result4);
	}

}

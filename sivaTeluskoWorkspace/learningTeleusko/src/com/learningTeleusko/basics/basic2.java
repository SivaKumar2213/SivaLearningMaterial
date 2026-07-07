package com.learningTeleusko.basics;

public class basic2 {

	public static void main(String[] args) {
int a=12;
byte b=(byte)a;//-->we are explicitly converting the integer to byte is called as casting
int c=b;//--> without any conversion it is working hence it is known as typeConversion
System.out.println(b);//-->o/p is 12
System.out.println(c);//-->o/p is 12

//Byte range is from -128 to 127 so if is in the range means it will work directly or else we will loose the data 
//Because it will perform modulo % operation with the value example 257%256 reminder is 1 so we will get the output as 1
int a1=257;
byte b1=(byte)a1;
System.out.println(b1);//-->o/p is 1

//if we are going from float to int means we will loose the value after the point
float f=5.6f;
int d=(int)f;
System.out.println(d);//-->o/p is 5;

int e=6;
float f1=e;//--> without any conversion it is working hence it is known as typeConversion
System.out.println(f1);//-->o/p is 6.0;

// we are having another concept which is typepromotion 
//Example if we are multiplying two byte values and the result falls in int 
//It will automatically promote the result as int

byte b2=10;
byte b3=30;
//byte b4=b2*b3;// we are getting compile time error because compiler is assigned the value and it known the o/p is int
int result=b2*b3;
System.out.println(result);//-->o/p is 300;

	}

}

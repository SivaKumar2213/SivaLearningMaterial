package com.learningTeleusko.basics;
//Arithmetic operator
public class basic3 {

	public static void main(String[] args) {
int  num1=7;
int num2=5;
System.out.println("Add :"+(num1+num2));//-->o/p is 12
System.out.println("sub :"+(num1-num2));//-->o/p is 2

System.out.println("mul :"+num1*num2);//-->o/p is 35
System.out.println("div :"+num1/num2);//-->o/p is 1 the quotient will be output

System.out.println("modulo :"+num1%num2);//-->o/p is 2 the reminder will be the output

//if we want to add the number with any other numbers like 2 means
int a=10;
int b=10;
int a1=10;
int result =a+2;//or a=+2 or 
  a1=+2;
  a1=-2;// the above two lines will not work for modulo and division and multiplication

//if we want to increment or decrement a number by1 means we are having
	//Post Increment
System.out.println("post increment"+(a++));
//pre increment 
System.out.println("pre increment"+(++a));

System.out.println("post decrement"+(a--));
//pre increment 
System.out.println("pre decrement"+(--a));
	//both are same if it is in differnt statement

//but if we are assign to same other variable by assignment operator means

int postIncrement=a++;//First assign the value and gets incremented
System.out.println("postIncrement"+postIncrement);//o/p is 10

int preIncrement=++a;//After executing the 34 line a will be 11 and then it will increment to 12 and assign the value
System.out.println("preIncrement"+preIncrement);//o/p is 12

int preIncrement1=++b;
System.out.println("preIncrement1"+preIncrement1);//o/p is 11

	}

}

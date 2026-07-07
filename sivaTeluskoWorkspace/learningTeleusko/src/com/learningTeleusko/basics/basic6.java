package com.learningTeleusko.basics;

public class basic6 {
//If else and if else if else and ternary operator ?
	public static void main(String[] args) {
      int x=10;
      
      if(x>8)
    	  System.out.println("Hello");
      else
    	  System.out.println("World");
      
      int y=20;
      int z=30;
      
      if(x>y && x>z)
    	  System.out.println(x);
      else if(y>z)
    	  System.out.println(y);
      else{
    	  System.out.println(z);
      }
      
      int number=21;
      String result="";
      if(number%2==0)
    	  result="even";
      else
    	  result="odd";
      
      System.out.println("If and else :"+result);
      //The same above code is written by ternary operator
      String result1=number%2==0? "even":"odd";
      
      System.out.println("Ternary operator :"+result1);

      
	}

}

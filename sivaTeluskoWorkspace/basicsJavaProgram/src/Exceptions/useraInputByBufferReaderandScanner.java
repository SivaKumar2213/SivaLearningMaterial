package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//in Java aversion 1.5 only we have a class called scanner to get the input from user
//before that we can use System.in but it will return on ASCII values example for 0->48,5-53,a-97 like that
//so for a single number like 0 to 9 we can subtratct the 48 For a proper way 
//we should use BufferReader,
public class useraInputByBufferReaderandScanner {

	public static void main(String[] args) throws IOException {
		/*System.out.println("Enter a number");
        int num=System.in.read();//return ASCII value
        System.out.println(num);
        System.out.println("SUBTRACTED THE 48 TO GET THE CORRECT VALUE : "+(num-48));//because zero ASCII valus is 48 so until 9 it will work fine
	System.out.println("Before 1.5 getting the input from user");*/
	System.out.println("Enter the Input");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);
        int num1=Integer.parseInt(bf.readLine());
        System.out.println("Before 1.5 version : "+num1);
        System.out.println("Enter the value");
        Scanner sc=new Scanner(System.in);
        int num2=sc.nextInt();
        System.out.println(num2);
        bf.close();
	}

}

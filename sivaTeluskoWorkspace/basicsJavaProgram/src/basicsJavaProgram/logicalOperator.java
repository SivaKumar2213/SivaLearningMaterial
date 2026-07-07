package basicsJavaProgram;

import java.util.ArrayList;

public class logicalOperator {

	public static void main(String[] args) {
int a=2;
int b=3;
int c=2;
int d=5;
boolean Andresult=a<b && c>d ;
boolean orresult= a<b || c>d;
boolean notresult=!(a<b && c>d);
System.out.println("And Result :"+Andresult);
System.out.println("Or Result :"+orresult);
System.out.println("Not Result :"+notresult);

ArrayList<String> al=new ArrayList<String>();
al.add("apple");
al.add("mango");
al.add("orange");
al.add("watermelon");
if(!al.isEmpty()) {
	System.out.println("List Is Not Empty");
	
}else {
	System.out.println("List Is  Empty");

}



	}

}

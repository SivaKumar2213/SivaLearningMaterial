package basicsJavaProgram;

public class arithmeticOperator {

	public static void main(String[] args) {
int num1=7;
int num2=5;
int result1=num1+num2;
int result2=num1-num2;
int result3=num1*num2; 
int result4=num1/num2;
int result5=num1%num2;
System.out.println("add :"+result1);
System.out.println("sub :"+result2);
System.out.println("multiply :"+result3);
System.out.println("divide :"+result4);
System.out.println("modulo :"+result5);
System.out.println("-------------------------------------------------------------------------------");
System.out.println("if we want to add or subtract with the same number we can use the folowing code ");
num1=num1+1;
System.out.println(num1);
num1+=1;
System.out.println(num1);
num1++;//Increment
System.out.println(num1);

num2=num1-1;
System.out.println(num2);
num2-=1;
System.out.println(num2);
num2--;//decrement
System.out.println(num2);

//post increment - at the time of assigning it will assign the value first and increment
int x=6;
int y=x++;
System.out.println("post incrment Y value is :"+y+" and the x value is :"+x);

//pre increment - at the time of assigning it will increment first and the value is assigned
int x1=6;
int y1=++x1;
System.out.println("post incrment Y1 value is :"+y1+" and the x1 value is :"+x1);


//post decrement - at the time of assigning it will assign the value first and decrement
int x2=6;
int y2=x2--;
System.out.println("post incrment Y2 value is :"+y2+" and the x2 value is :"+x2);

//pre increment - at the time of assigning it will decrement first and the value is assigned
int x3=6;
int y3=--x3;
System.out.println("post incrment Y3 value is :"+y3+" and the x1 value is :"+x3);
	}

}

package OOPS;
//I am using the classes in the same file but we can use in a different file
//For Inheritance we does not even require a java file , the class file is enough which generate after compile
//It allows a class (child/subclass) to acquire properties and behaviors (fields and methods) from 
//another class (parent/superclass) is known as inheritance.

//Inheritance means reusing code of an existing class in a new class.
       //1)The existing class is called the parent (or superclass).
       //2)The new class that inherits it is called the child (or subclass).

public class inheritance {

	public static void main(String[] args) {
		Calc c=new Calc();//if we don't compile the Calc class also when this line starts to execute it will automatically compile the Calc java
      int a= c.add(4, 5);
      int b=c.sub(5, 3);
      c.sum=20;
       System.out.println("Add : "+a+" Sub : "+b);
       c.show();
       System.out.println("---------------------------------------------------------");
       AdvanceCalc adv=new AdvanceCalc();//if we want to use add and sub method also then we should use extends keyword
       int a1=adv.div(15, 4);
       int b1=adv.mul(3, 5);
       int c1= adv.add(4, 5);
       int d1=adv.sub(5, 3);
       adv.sum=30;
       System.out.println("Div : "+a1+" Mul : "+b1+" Add : "+c1+" Sub : "+d1);
       adv.show();
       
	}

}
class Calc{
	int sum;
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public int sub(int n1,int n2) {
		return n1-n2;
	}
	public void show() {
		System.out.println("The sum value is : "+sum);
	}
}
class AdvanceCalc extends Calc{
	public int div(int n1,int n2) {
		return n1/n2;
	}
	public int mul(int n1,int n2) {
		return n1*n2;
	}
}

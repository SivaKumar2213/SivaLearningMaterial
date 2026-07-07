package OOPS;
//Inbuilt of we call any constructor ,the super() will be there and call the parent class constructor 
//in the below program A is a parent class ,and b is the child class
//in B class constructor the first line will be super() which will call parent class A default constructor
//in java all the class are sub class of Object class,in A class constructor super() will be there to call Object Class constructor
//in child class even if parameterized constructor calls also ,it will call only default constructor of A class because the default code is super()
//if we are using this() in the constructor ,first it will call super class constructor like normal 
//and it will call his own class constructor
public class thisAndSuperKeyword {

	public static void main(String[] args) {
B b=new B();
System.out.println("-------------------------------------------------------------------------");
B b1=new B(3);
System.out.println("-------------------------------------------------------------------------");
B1 b2=new B1();
System.out.println("-------------------------------------------------------------------------");
B1 b3=new B1(5);
System.out.println("-----------------------Using this keyword Strats-----------------------------");
B2 b4=new B2();
	}

}
class A{

	public A() {
		System.out.println("Inside A Class Default constructor");
	}
public A(int n) {
		System.out.println("Inside A class Parametrized Constructor");
	}
	
}
class B extends A{
	public B() {
		System.out.println("Inside B1 Class Default constructor");
	}
public B(int n) {
		System.out.println("Inside B1 class Parametrized Constructor");
	}
}

class A1{

	public A1() {
		System.out.println("Inside A1 Class Default constructor");
	}
public A1(int n) {
		System.out.println("Inside A1 class Parametrized Constructor");
	}
	
}
class B1 extends A1{
	public B1() {
		
		System.out.println("Inside B1 Class Default constructor");
	}
public B1(int n) {
	super(n);
		System.out.println("Inside B1 class Parametrized Constructor");
	}
}


class A2{

	public A2() {
		System.out.println("Inside A2 Class Default constructor");
	}
public A2(int n) {
		System.out.println("Inside A2 class Parametrized Constructor");
	}
	
}
class B2 extends A2{
	public B2() {
		this(5);
		System.out.println("Inside B2 Class Default constructor");
	}
public B2(int n) {
	this(5,"Siva");
		System.out.println("Inside B2 class Parametrized Constructor");
	}
public B2(int n,String a) {
	System.out.println("Inside B2 class two Parametrized Constructor");
}
}
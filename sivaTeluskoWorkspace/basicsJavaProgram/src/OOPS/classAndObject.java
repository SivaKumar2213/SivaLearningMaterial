package OOPS;

public class classAndObject {

	public static void main(String[] args) {
int num1=5;
int num2=6;
Calculator calc=new Calculator();
int result=calc.add(num1, num2);
System.out.println(result);
	}

}

 /*class calculator{
	
	public int add() {
		int r;
		return r;
	}
}*/
 //If we Uncomment the code we will get the error
//Does not assigned default value because variable r is in method scope which is called as(Local variable)
// r here is a local variable inside the method add().
//Java does not automatically initialize local variables — they must be explicitly assigned before use.
//Since you try to return r; before assigning any value, the compiler throws:

class Calculator{
	int r;
	public int add(int n1,int n2) {
		r=n1+n2;
		return r;
	}
}

//Here create inside the class not in the method, so r is an (instance variable), declared at the class level.
//Java automatically initializes all instance variables to their default values.
//For int, the default value is 0.
//So when you return r;, it is already initialized (to 0), and no error occurs.


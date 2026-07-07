package Exceptions;
//We can use multiple catch block for a try block but one condition is
//the Order should be there like child class(ArithmeticException ae)(ArrayIndexOutOfBoundExceptin) first 
//then paraent class exception(Exception e)
//because when we keep the parent class Exception first ,then the remaining code is unreacheable because
//ArithmeticException Class extends RunTimeException
//RunTime Exceotion class extends Exception
//Uncomment the line 21 to see the Compile time error  like below
     //1)Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
    //2)Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception
public class tryWithMultipleCatch {

	public static void main(String[] args) {
int i=2;//for arithmtic exception make this to zero
int j=18;
int num[]=new int[5];
String name=null;
try{
	j=j/i;
	System.out.println(name.length());//To get last generic exception we can handle by NullPointerException
	System.out.println(num[2]);
	System.out.println(num[5]);// we will get ArrayIndexOutOfBoundException
	
}/*catch(Exception e) {
	System.out.println("Something Went Wrong : "+e);
}*/
catch (ArithmeticException ae){
	System.out.println("We cannot divide a number by Zero");
}catch(ArrayIndexOutOfBoundsException ae) {
	System.out.println("You are trying to access the value which is out of array size declared");
}catch(Exception e) {
	System.out.println("Something Went Wrong : "+e);
}
	}

}

package Exceptions;
//Exceptions -> RunTime error
//If we get an run time error the code execution stops there ,to avoid the stopping and continue with the
//remaining code we are giving try and catch,if we get a exception in try block it will jump to catch block
//simply try block means ,the java will try to execute the code inside try block ,if any error occurs
//it will execute the catch block

public class exceptionHandlingWithTryAndCatch {

	public static void main(String[] args) {
int i=0;//it will work fine now ,but if we change to zero we will get run time exception arithmetic exception
int j=18;
try
{
	j=j/i;
}catch(Exception obj) {
	System.out.println(obj.getLocalizedMessage() +" Something went wrong : ");
}

System.out.println(j);
System.out.println("Calcultaion done");
	}

}

package Exceptions;
//throw keyword is used to throw the exception to catch block
//if we want to print any meesge we can add that in throw keyword 
//the constructio will append the message with exception ,like beow program output
public class throwKeyword {

	public static void main(String[] args) {
int i=20;
int j=0;
try {
j=18/i;
if(j==0)
throw new ArithmeticException("Cannot divide by zero");
}catch(ArithmeticException ae) {
	System.out.println(ae);
}catch (Exception e) {
	System.out.println("Something went wrong : ");
}
	}

}

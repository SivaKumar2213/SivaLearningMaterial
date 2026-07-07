package Exceptions;
//For custom exception we need to create a class and that class should extends Exception or RunTimeException
//if we want to add any other message with the exception message ,then we need to create a constructor
//and pass the message to it's super class constructor
//and we need to catch the created custom exception or eslse it will call the generic catch(Exception),if it is there 
public class customException {

	public static void main(String[] args) {
		int i=20;
		int j=0;
		try {
		j=18/i;
		if(j==0)
		throw new MyCustomException("The output value cannot be zero");
		}catch(MyCustomException ae) {
			System.out.println(ae);
		}catch (Exception e) {
			System.out.println("Something went wrong : ");
		}
	}

}

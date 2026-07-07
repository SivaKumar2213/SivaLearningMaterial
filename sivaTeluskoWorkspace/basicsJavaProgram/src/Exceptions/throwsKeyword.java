package Exceptions;
//throws is Used in method signature to declare that a method may throw an exception.
//Tells the caller of the method:"I may throw this exception, handle it yourself."
//Mainly used for checked exceptions.it can used for unchecked exception but meaningless because 
//java will tell to handly only the checked exception like ,classnot found,IO exception,SQL Exception and not for 
//runtime excetion like nullpointerexception,arithmeticexception,arrayindexoutofboundexception
//A method can declare multiple exceptions using a comma.
public class throwsKeyword {

	public static void main(String[] args) {
		throwsKeywordException t=new throwsKeywordException();
		
			try {
				t.show();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
	}

}
class throwsKeywordException {
	public void show() throws ClassNotFoundException  {
		//System.out.println(Class.forName("Demo"));Exception Occue : we should use package name ,
		                                           //if the class is present inside the particular package
		                                           // or else we will get an error
		System.out.println(Class.forName("Exceptions.Demo"));
	}
}

class Demo{
	
}
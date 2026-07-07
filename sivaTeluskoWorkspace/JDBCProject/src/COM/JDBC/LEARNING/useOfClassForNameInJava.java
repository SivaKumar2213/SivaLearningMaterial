package COM.JDBC.LEARNING;
//Loads the class into JVM
//Executes static blocks only
//Does NOT create an object
public class useOfClassForNameInJava {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class.forName("COM.JDBC.LEARNING.demo");//It will just load the class ,so statih block only executes
		Class.forName("COM.JDBC.LEARNING.demo").newInstance();//It will load and create an object of that class
		demo d=new demo();//Comment the above two lines of code to check fully
                           //first it will load the class(In this case the class is already loaded so it wont load again)
                           //and print the value in static block
                           //after that it will create a object , so Instance block will printed


	
	}

}

class demo{
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Non Static block --> Instance Block");
	}
}

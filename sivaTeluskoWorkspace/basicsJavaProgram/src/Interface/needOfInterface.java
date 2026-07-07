package Interface;
//1)Multiple Inheritance support
      //A class can implement multiple interfaces but cannot extend multiple classes.
//2)Standardization / Contract
       //Interface defines what a class must do, not how to do it.
       //Like writing rules → classes must follow those rules.
       //Example: JDBC, Selenium, Spring all use interfaces to provide standard behavior.
//3)Loose Coupling
       //Interfaces help in designing flexible systems—components depend on behavior, not implementation.
//4)Achieve Full Abstraction
      //Interfaces hide implementation details completely.
public class needOfInterface {

	public static void main(String[] args) {
computer c=new laptop();
computer d=new desktop();
developer siva=new developer();
siva.devApp(c);
//siva.devApp(d);
	}

}
interface computer{
	public void code();
}
class laptop implements computer{

	public void code() {
		System.out.println("Code ,run and compile");
		
}
}
class desktop implements computer{

	public void code() {
		System.out.println("Code ,run and compile faster");
		
	}
	
}
class developer {
	public void devApp(computer C) {
            C.code();
	}
}
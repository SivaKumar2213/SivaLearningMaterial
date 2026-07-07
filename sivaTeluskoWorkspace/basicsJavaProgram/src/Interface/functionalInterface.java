package Interface;
//Functionl Interface will contain only one method and that method should be abstract method(SAM)
//Single Abstract Method
//By adding the annotaion as @FunctionalInterface we can tell the compiler that it is a Functionl Interface
//by default inside the functional interface the method will be public abstract
public class functionalInterface {

	public static void main(String[] args) {
//1)we can do it in two ways either by creating a new class and implementing the interface
//2)by anonymous class
		System.out.println("first Way");
		B b=new B();
		b.show();
		System.out.println("Second Way Anonymous class");
		D d=new D() {

			@Override
			public void show() {
                 System.out.println("In Show Of Anonymous Class");				
			}
			
		};
		d.show();
	}

}
@FunctionalInterface
interface D{
	void show();
	//void run();//it will allow until you make this as functionalInterface before annotating after that Compile time erroe
}
class B implements D{

	@Override
	public void show() {
System.out.println("in B show");		
	}
	
}
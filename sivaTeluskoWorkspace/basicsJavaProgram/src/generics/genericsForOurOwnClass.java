package generics;
//For our own class how we can create Generics
//near the class name itself we can create the type of generics
//here we are Using T-> it will  of type what we are passing
public class genericsForOurOwnClass {

	public static void main(String[] args) {
Student s=new Student(10);
System.out.println("Without Generics : ");
s.display();
System.out.println("Value of Object in Without Generics : " +s.getObject());
System.out.println("--------------------------------------------------------");
Student<String> s1=new Student(10);//here we need to specify the generics both side they only it will be of that type
//Student<String> s1=new Student<String>(10);//Compile time error stating that to pass the value as String
Student<String> s2=new Student<String>("Siva");
System.out.println("with Generics String: ");
s2.display();
System.out.println("Value of Object in With Generics : " +s2.getObject());

	}

}
class Student<T>{
	T object;
	public Student(T object) {
		super();
		this.object = object;
	}
	public T getObject() {
		return object;
	}

	public void display() {
		System.out.println("The Student is of Type : "+object.getClass().getName());
	}
	
}
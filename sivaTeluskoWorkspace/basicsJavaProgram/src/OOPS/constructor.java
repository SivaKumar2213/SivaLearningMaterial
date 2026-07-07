package OOPS;
//Constructor method name should be same as class name
//When we create an object it will call the constructor(Default) 
//which will be automatically taken care by java and assign a default value like line number 7
public class constructor {

	public static void main(String[] args) {
Human h=new Human(); 
System.out.println("The Name is : "+h.getName()+ " and the age is : "+h.getAge());
System.out.println("--------------------------------------------------------------------------------------");
Human1 h1=new Human1(); 
System.out.println("The Name is : "+h1.getName()+ " and the age is : "+h1.getAge());

	}

}
class Human{
	private int age;
	private String name;
	public Human() {
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class Human1{
	private int age;
	private String name;
	public Human1() {
		age=25;
		name="Siva Kumar";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

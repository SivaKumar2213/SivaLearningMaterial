package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Constructor Reference is one of the most useful features introduced in Java 1.8
//it allows you to create objects without using new directly inside your lambda expressions.
//A constructor reference is a short way of writing code that creates an object using the ::new syntax.
public class ConstructorReference {

	public static void main(String[] args) {
		List<String> studentNames=Arrays.asList("Siva","Raj","Kiran","Bala");
		List<Student>studentsList=new ArrayList<>();
System.out.println("By Normal way by using enhanced for loop Creating an object");
for(String name:studentNames) {
	studentsList.add(new Student(name));
}
System.out.println("Normal Way : "+studentsList);

System.out.println("By Using stream and lambda");
List<Student>studentsList1=studentNames.stream()
                                             .map(name -> new Student(name))
                                             .toList();
System.out.println("By Using stream and lambda : "+studentsList1);

System.out.println("By Using stream and ConstructorReference");
studentNames.stream()
                   .map(Student::new)
                   .forEach(System.out::println);

	}

}
class Student{
	private int age;
	private String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public Student(String name) {
		this.name = name;
	}
	public Student() {
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
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
}
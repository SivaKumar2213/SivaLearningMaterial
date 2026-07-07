package generics;

import java.util.ArrayList;

//WildCardType Generics ->?(The data type is unknown)
public class WildCardTypeGenerics {

	public static void main(String[] args) {
		Human hu=new Human();
		Employee emp=new Employee();
		hu=emp;//This is called runtime polymorphism where parent refernce holds child object
		ArrayList <Human> humanList=new ArrayList<Human>();
		ArrayList <Employee> empList=new ArrayList<Employee>();
		//humanList=empList;will throw an compile time error
		
		//But with ?WildCardType Generics it will allow
		ArrayList <?> humanList2=new ArrayList<>();
		humanList2=empList;
		humanList2=humanList;
	}

}
class Human{
	
}
class Employee extends Human{
	
}
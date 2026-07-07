package generics;

import java.util.ArrayList;
import java.util.List;

public class upperBoundANDLowerBound {

	public static void main(String[] args) {
Bag b=new Bag();
Employees e=new Employees();
Students s=new Students();

System.out.println("Upper Bound");
ArrayList<Employees> empList=new ArrayList<>();
ArrayList<Bag> bagList=new ArrayList<>();
ArrayList<Students> stuList=new ArrayList<>();
empList.add(e);
bagList.add(b);
stuList.add(s);
invockBagUpperBound(empList);
invockBagUpperBound(bagList);
//invockBagUpperBound(stuList);//will get compile time error if dont know why we are getting compile time error means refer (BasicupperANDLowerBound) class

System.out.println("Lower Bound");
ArrayList<Employees> empList1=new ArrayList<>();
ArrayList<Bag> bagList1=new ArrayList<>();
ArrayList<Students> stuList1=new ArrayList<>();
ArrayList<Object> objList1=new ArrayList<>();
Object o=new Object();
empList1.add(e);
bagList1.add(b);
stuList1.add(s);
objList1.add(o);
//invockBagLowerBound(empList1);//will get compile time error if dont know why we are getting compile time error means refer (BasicupperANDLowerBound) class
//invockBagLowerBound(stuList1);//will get compile time error if dont know why we are getting compile time error means refer (BasicupperANDLowerBound) class
invockBagLowerBound(bagList1);
invockBagLowerBound(objList1);
	}
	public static void invockBagUpperBound(List<? extends Bag>list) {
		for(Bag bag:list) {
			bag.BagDetails();
		}
	}
	public static void invockBagLowerBound(List<? super Bag>list) {
		for(Object bag:list) {
			//bag.BagDetails();// we cannot call this because object does not contain BagDetails method
			                 //Because we are using lowerBound Here (Super)so it will always refer to Parent class
			System.out.println(bag.getClass().getName());
		}
	}

}
class Bag{
	public void BagDetails() {
		System.out.println("Bags Are Made for Employee and Student");
	}
}
class Employees extends Bag{
	public void BagDetails() {
		System.out.println("Employee contains the Bag which Holds the Laptop");
	}
}
class Students{
	public void BagDetails() {
		System.out.println("Employee contains the Bag which Holds the Laptop");
	}
}

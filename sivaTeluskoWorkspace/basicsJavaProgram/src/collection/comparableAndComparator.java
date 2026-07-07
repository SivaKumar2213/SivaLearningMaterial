package collection;
//To sort , we are having a special class called collections inside that we can sort in two ways
//Default Sortint or Natural Sorting by using Comparable Interface which has compareTo method
//but the Classes like Integer,String etc are implements Comparable interface
//but only one logic of sorting is allowed in comparable 
//comparator has compare method and use in a different class,and compare method is a sbstract method
//comparator is functional interface
//comparable sorting logic cannot de done outside the class ,
//because compareTo takes only one object as a input for the method
//it will compareTo with this object,the class object,so only it can be used only in inside the class

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class comparableAndComparator {

	public static void main(String[] args) {

List<Integer> l=new ArrayList();
l.add(10);
l.add(20);
l.add(2);
l.add(28);
l.add(14);
System.out.println("Before sorting of List by Comparable : "+l);
Collections.sort(l);//l is a List Of Integer ,so Integer Class already Implements Comparable Interface
System.out.println("After Sorting of List by Comparable" +l);

List<employee> employees=new ArrayList<>();
employees.add(new employee(1,10000,"Mani"));
employees.add(new employee(2,10001,"Ram"));
employees.add(new employee(3,8000,"Raj"));
employees.add(new employee(4,13000,"Bala"));
employees.add(new employee(5,7500,"Murali"));
//System.out.println(employees);
Collections.sort(employees);
for(employee e:employees) {
	System.out.println(e);
}
System.out.println("Comparator");
List<student> studs=new ArrayList();
studs.add(new student(1,97,"Abdul","A"));
studs.add(new student(3,65,"ram","B"));
studs.add(new student(4,29,"rajkumar","F"));
studs.add(new student(2,100,"Abdul","O"));
studs.add(new student(5,55,"babu","C"));
Comparator<student> com=new Comparator<student>() {

	@Override
	public int compare(student o1, student o2) {
		if(o1.marks > o2.marks) {
			return 1;
		}else {
			return -1;
		}
	}
};
Comparator<student> com1=new Comparator<student>() {
	@Override
	public int compare(student o1, student o2) {
		if(o1.rollNo > o2.rollNo) {
			return 1;
		}else {
			return -1;
		}
	}
};
//below i had written by using lambda expression
//Comparator<student> comlambda=( o1, o2)-> (o1.rollNo>o2.rollNo ? 1:-1);
	Collections.sort(studs, student.sortByMarks);
	Collections.sort(studs, student.sortByName);
	Comparator<student> comlambda=( o1, o2)-> (o1.rollNo>o2.rollNo ? 1:-1);
	Collections.sort(studs, comlambda);
System.out.println("Students By Comparator");
for(student s:studs) {
	System.out.println(s);
}
	}
}

//Collections.sort(studs);

	

class employee implements Comparable<employee>{
	int eid;
	int salary;
	String name;
	public employee(int eid, int salary, String name) {
		super();
		this.eid = eid;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", salary=" + salary + ", name=" + name + "]";
	}
	
	public int compareTo(employee o) {
		if(this.salary > o.salary) {
			return -1;
		}else {
			return 1;
		}
		/*if(this.eid > o.eid) {
			return 1;
		}else {
			return -1;
		}*///Unreacheable code compile time error
	}
}
	
	class student implements Comparator<student> {
		int rollNo;
		int marks;
		public student(int rollNo, int marks, String name, String grade) {
			super();
			this.rollNo = rollNo;
			this.marks = marks;
			this.name = name;
			this.grade = grade;
		}
		String name;
		String grade;
		@Override
		public String toString() {
			return "student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + ", grade=" + grade + "]";
		}
		@Override
		public int compare(student o1, student o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		static Comparator<student> sortByMarks =
	            (s1, s2) -> s2.marks - s1.marks;

	    // Comparator inside class → name sorting
	    static Comparator<student> sortByName =
	            (s1, s2) -> s1.name.compareTo(s2.name);
		
	}
	

package array;

public class ArrayOfObject {

	public static void main(String[] args) {
Student s=new Student();
s.rollNo=1;
s.name="Arun";
s.marks=49;

Student s1=new Student();
s1.rollNo=2;
s1.name="Babu";
s1.marks=88;
Student s2=new Student();
s2.rollNo=3;
s2.name="Kiran";
s2.marks=97;
Student students[]=new Student[3];
//in two ways we can assign
students[0]=s;
students[1]=s1;
students[2]=s2;
//or else the second way of assiging is create an another array by using loop
Student list[]= {s,s1,s2};

for(int i=0;i<students.length;i++) {
	students[i]=list[i];
}

//Printing by using enchanced for loop
for (Student stud:students) {
	if(stud.marks>=50) {
	System.out.println("Roll Number : "+stud.rollNo+" Name : "+stud.name+" Marks : "+stud.marks+" Result : Pass");
	}else {
	System.err.println("Roll Number : "+stud.rollNo+" Name : "+stud.name+" Marks : "+stud.marks+" Result : Fail");
	}
}
	}

	
}
class Student{
	int rollNo;
	String name;
	int marks;
}
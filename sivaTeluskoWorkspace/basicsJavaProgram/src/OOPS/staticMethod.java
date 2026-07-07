package OOPS;
//Static Method can be called by using Class Name or Object Reference
//we cannot use directly the non static variable inside static method(Line 22)throw compile time error
//,because it does not know which objects variable is that
//But indirectly if we are having the object reference by passing that we can use non static variable
public class staticMethod {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Mani";
		s1.rollNumber=23;
		Student.schoolName="CSI School";
		Student.showSchoolDetails();
		s1.showStudentDetails();
		s1.showStudentDetails3(s1);
		Student.showStudentDetails3(s1);

	}

}
class Student{
	String name;
	int rollNumber;
	static String schoolName;
	
	public void showStudentDetails(){
		System.out.println("Student Name :"+name+" Roll Number: "+rollNumber+" School Name :"+schoolName);
	}
	public static void showStudentDetails1(){
		//System.out.println("Student Name :"+name+" Roll Number: "+rollNumber+"School Name :"+schoolName);
	}
	public static void showSchoolDetails(){
		System.out.println("School Name :"+schoolName);
	}
	public static void showStudentDetails3(Student s){
		System.out.println("Student Name :"+s.name+" Roll Number: "+s.rollNumber +" School Name :"+schoolName);
	}
	
	
}
	

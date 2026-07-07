package generics;

import java.util.ArrayList;

//UpperBound -> uses ? with Extends keyword and Class name <? extends classname> so it will hold sametype and the child class which extends the parent class
//anything which extends the class name name will allow
//LowerBound --> uses ? with super keyword and class name <? super classname>,the parent class of the class name if there is no parent class is specified then Object Class
//anything which is the super class of the class name
public class BasicupperANDLowerBound {

	public static void main(String[] args) {
//UpperBound-Start
		HumanBeing HB=new HumanBeing();	
		Employee1 e=new Employee1();
		ArrayList<? extends HumanBeing>humanList=new ArrayList<>();
		ArrayList<Employee1>empList=new ArrayList<>();
		ArrayList<HumanBeing>completehumanList=new ArrayList<>();
		ArrayList<String>stringList=new ArrayList<>();
		ArrayList<Object>objectList=new ArrayList<>();
		
		humanList=empList;//will allow because Employee1 extends HumanBeing (UpperBound)
		humanList=completehumanList;//It will hold the same type
		//humanList=stringList;//Compile Time Error it will not allow  any other Class or Object
		//humanList=objectList;//Compile Time Error it will not Hold the parent of HumanBeing which is Object Class
		//UpperBound-End
		
//LowerBound-Start	
		HumanBeing HB1=new HumanBeing();	
		Employee1 e1=new Employee1();
		ArrayList<? super HumanBeing>humanList1=new ArrayList<>();
		ArrayList<Employee1>empList1=new ArrayList<>();
		ArrayList<HumanBeing>completehumanList1=new ArrayList<>();
		ArrayList<String>stringList1=new ArrayList<>();
		ArrayList<Object>objectList1=new ArrayList<>();
		
		//humanList1=empList;//Compile Time Error it will not allow any other chile Class (LowerBound)
		humanList1=objectList1;//It will allow because  HumanBeing parent class is Object(LowerBound)
		humanList1=completehumanList1;//It will hold the same type
		//humanList1=stringList1;//Compile Time Error it will not allow  any other Class.
	}

}
class HumanBeing{
	
}
class Employee1 extends HumanBeing {
	
}
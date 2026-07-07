package generics;

import java.util.ArrayList;

//for array we should mention the type like int,string etc
//generics was introduced in Java 1.5 version
//Because while working with collection,Collection can store the value in Object format
//To make that TypeSafety we are using generics
//Example ,we are having a arraylist were generics were not added and we are trying to add student name
//at the time if we try to add integer it will add without gicing any compile time error
//but when we are trying to retrieve the data and persorn any operation by treating it as string 
//we will get ClassCastException at run time to avoid that
//we can mention the arraylist is of generic type with syntax<>
//till java 1.8 version ,it was mandatory to give the generic both side but in 1.8 v only left side is enough
//one condition is we should use object reference not a primitive type(int,char,string) in generic 

public class needAndUsageAndSyntaxOfGenerics {
	public static void main(String[] args) {
System.out.println("Example with array");
String name[]=new String[5];
name[0]="Siva";
name[1]="Kumar";
name[2]="Mani";
//name[3]=10;//It will give compile time error because we had mentioned the type as String
	
System.out.println("Example with arraylist without generics");
ArrayList names=new ArrayList();
names.add("siva");
names.add("kumar");
names.add("Mani");
names.add(10);//It will not throw any compile time error

String name1=(String) names.get(0);//It will ask to downcaste from object to string
String name2=(String) names.get(3);//In this line we will run time exception classcastexception
                                   //Because the value will be int 
                                  //To Avoid this we need to use generics

System.out.println("Example with arraylist with generics");
ArrayList<String> names1=new ArrayList();
names1.add("siva");
names1.add("kumar");
names1.add("Mani");
//names1.add(10);//In this we will get compile time error because the list is of Type<String>

String name3=names1.get(0);
	
	
	}

}

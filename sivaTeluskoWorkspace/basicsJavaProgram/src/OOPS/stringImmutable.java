package OOPS;
//String is immutable it cannot be changed ,It will create a new object if we try to modify the old one

public class stringImmutable {

	public static void main(String[] args) {
String str="Siva";
System.out.println("before changing or modify the string value the address");
System.out.println(str.hashCode());	
str=str + " Kumar";
System.out.println("After changing or modify the string value the address");
System.out.println(str.hashCode());	

String str2="Siva Kumar";
System.out.println("If we assign the string to another string the address will be");
System.out.println(str2.hashCode());	

String str3=new String("Siva Kumar");//New object in heap memory
System.out.println("If we assign the string to another string the address will be");
System.out.println(str3.hashCode());	

if(str2==str3) {
	System.out.println("Hash code is same but memory wise  same");
}else {
	System.out.println("Hash code is same but memory wise not same");
}
	

String s1 = "FB";
String s2 = "Ea";

System.out.println("The hashcode is  for s1 string is: "+s1.hashCode());
System.out.println("The hashcode is  for s2 string is: "+s2.hashCode());
System.out.println("But when we compare with equals() and == method the output is");

System.out.println("With Equals() method "+(s1.equals(s2)));
System.out.println("With == method "+(s1==s2));
System.out.println("Both will return false because equals method will compare content should same");
System.out.println("Both will return false because == method will compare object reference should same");


	}

}

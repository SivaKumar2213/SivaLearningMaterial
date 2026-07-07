package OOPS;
//== → Reference (memory address) comparison
     //1)Compares whether two references point to the same object in memory.
     //2)Works well for primitive types (like int, char, etc.) but not for objects (like String).
//.equals() → Content (value) comparison
     //1)Used to compare the actual data/content inside two objects.
     //2)In the String class, it checks whether the sequence of characters is the same.
//For String always we should use .equals or .equalsIgnoreCase() because
              //String a = "Java";
              //String b = "Java";
              //System.out.println(a == b); // true
//Because ,This works only because Java string literals are stored in the String pool 
//— both a and b refer to the same object.
public class objectClass {

	public static void main(String[] args) {
Laptop lap=new Laptop();
lap.price=1000;
lap.brand="Lenovo";
System.out.println(lap);//It will call the .toString method in object class whenever we try to print the object directly
	                    //Internally what happens ,inside println method String.valueOf(obj)
                        //inside valueOf method ,if obj is null return null or return obj.toString
                        //so only it is calling .toString method of object class
                        //if we write the method in our class it will call that
Laptop lap1=new Laptop();
lap1.price=1000;
lap1.brand="Lenovo";
boolean result = lap.equals(lap1);
System.out.println(".equals: "+result);//return false
//eventhough the values are same it will check for the reference memory so it will return false
//for string and integer and all it will return true because object class .equals method is overridden in String and integer class
	}

}
class Laptop{
	int price;
	String brand;
	
	public String toString() {
		return "Laptop [price=" + price + ", brand=" + brand + "]";
	}
	
}
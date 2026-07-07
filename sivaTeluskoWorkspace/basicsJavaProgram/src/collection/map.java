package collection;

import java.util.HashMap;
import java.util.Map;

//HashTable and HashMap both are same but HashTable is synchronized and HashMap is not synchronized
//so for multiple thread will access we should use HashTable ,if not we can use HashMap
//HashMap is nothing put a Key and value pair
//Where Key is Set and value is List
//so Set cannot contain dulpicate and List can hold Duplicate values
//we are using put method instead of add method because put method will create a new pair if it not der 
//or else it will update the value for the pair
//it will not maintain order because for key it uses SET 
//Map is noyt under Collection because it does not extends Collection interface

public class map {

	public static void main(String[] args) {
Map<String ,Integer> students=new HashMap<String,Integer>();
students.put("Anil", 41);
students.put("Abdul", 76);
students.put("kiran", 96);
students.put("zahee", 43);
students.put("Anil", 54);
students.put("Mani", 43);
//There are two methods in map which will give the entire key and entire values
System.out.println("All key of set : "+ students.keySet());//only one time anil will come
System.out.println("List Of Values : "+ students.values());//43 wil come two times but 41 will not come because it was updated to 54
System.out.println("It will show all the key and value pair : " +students.entrySet());//Anil value will replace from 41 to 54

for(String key : students.keySet()) {
	System.out.println(key +" : " +students.get(key));
}



	}

}

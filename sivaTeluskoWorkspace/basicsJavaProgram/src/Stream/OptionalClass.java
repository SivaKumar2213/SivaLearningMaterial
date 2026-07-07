package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Optional class was introduced in Java 1.8.
//It represents a value that may or may not be present.
//It helps prevent NullPointerException by forcing us to handle missing values.
//Optional does NOT throw an exception automatically — it becomes Optional.empty().
//It throws an exception only if you call get() on an empty Optional → NoSuchElementException.
//We can use methods like orElse(), orElseGet(), orElseThrow() to handle empty cases.
public class OptionalClass {

	public static void main(String[] args) {
List<String> ls=Arrays.asList("siva","Laxmi","mani","raj","renie");
Optional<String> name=ls.stream()
                     .filter(names->names.contains("x"))
                     .findFirst();//Find First will find the first name if many names are found with x
System.out.println("Names Which Contain x : " +name.get());

//The exception will occur in below code
Optional<String> name1=ls.stream()
.filter(names->names.contains("y"))
.findFirst();//Find First will find the first name if many names are found with x
//System.out.println("Names Which Contain x : " +name1.get());//Uncomment this line to bget an exception
System.out.println("Names Which Contain x : " +name1.orElse("Not Found"));


System.out.println("The above program for Not Found Optional class can be written as");
String name2=ls.stream()
.filter(names->names.contains("Z"))
.findFirst().orElse("Not Found the name with Z");

System.out.println("Names Which Contain Z : " +name2);



List<String> namesList=ls.stream()
                               .filter(str->str.contains("a"))
                               .collect(Collectors.toList());
System.out.println("The Name list which contains letter a is  : "+namesList);
System.out.println("The above code can be written as below");

ls.stream()
.filter(str->str.contains("a"))
.collect(Collectors.toList())
.forEach(n -> System.out.println(n));





	}

}

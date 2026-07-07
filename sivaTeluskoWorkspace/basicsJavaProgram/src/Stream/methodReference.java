package Stream;

import java.util.Arrays;
import java.util.List;

//Method Reference is introduced in Java 1.8.
//It is a shorthand notation to call a method using the :: operator.
//Instead of writing a lambda expression, we can directly refer to an existing method.
//Method reference can be used with object name or class name depending on the method type.
//1)Reference to a static method ClassName::staticMethodName
//2)Reference to an instance method of a particular object object::instanceMethodName
//3)Reference to an instance method of ANY object of a particular type ClassName::instanceMethodName


//It provides a clean and short way to use existing methods with the :: operator.
//It is mainly used along with functional interfaces and lambda expressions.
//Types of method references:
//1. ClassName::staticMethod
//2. object::instanceMethod
//3. ClassName::instanceMethod (for any object of that class)
//4. ClassName::new (constructor reference)
public class methodReference {

	public static void main(String[] args) {
List<String>namesList=Arrays.asList("siva","kumar","ramesh");
namesList.stream()
             .map(str->str.toUpperCase())
             .forEach(n->System.out.println(n));

System.out.println("The same code we are goint to write using method reference");
List<String>namesList1=Arrays.asList("siva","kumar","ramesh");
namesList1.stream()
             .map(String::toUpperCase)//we know toUpperCase is an instance method not a static method
                               //But how we are calling using a class name because java internally converts this into
                               //s.toUppercase(siva.toUppercase,kumar.toUpperCase,ramesh.toUppercase)
             .forEach(System.out::println);
	}

}

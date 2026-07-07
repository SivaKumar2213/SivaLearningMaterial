package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//forEach method takes an input as Consumer object
//we know consumer is an interface and has an one method void accept(T t)
public class forEach {

	public static void main(String[] args) {
List<Integer> nums=Arrays.asList(3,9,8,7);
Consumer<Integer> con=new Consumer<Integer>() {
	public void accept(Integer t) {
		System.out.println(t);
	}
};
System.out.println("Printing the value by Using Consumer and Anonymous inner class");
nums.forEach(con);
System.out.println("Same above code is replaced with lambda expression");
Consumer<Integer> con1= t-> System.out.println(t);
	nums.forEach(con1);//or else we can pass this t-> System.out.println(t) directly because we know this is a consumer like below
	//nums.forEach(t-> System.out.println(t));

	}

}

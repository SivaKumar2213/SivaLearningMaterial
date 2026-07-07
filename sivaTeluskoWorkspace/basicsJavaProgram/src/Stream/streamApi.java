package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Stream → A feature introduced in Java 8 to process collection data in a functional style.
//A Stream in Java is not a data structure.It is a pipeline that helps you perform operations on a collection such as:
//Filtering,Sorting,Mapping,Reducing,Iterating
//Stream does NOT modify the original collection.
//Stream can be created only once (terminal operation closes it).
//Intermediate operations: filter, map, sorted
//Terminal operations: forEach, reduce, collect
public class streamApi {

	public static void main(String[] args) {
List<Integer> nums=Arrays.asList(2,5,7,8,6);
Stream<Integer> s1=nums.stream();
Stream<Integer> s2=s1.filter(n -> n%2==0);//o/p--> 2, 8, 6
//s2.forEach(n->System.out.println(n));
//s2.forEach(n->System.out.println(n));// we will get runtime exception here
                                   //stream has already been operated upon or closed
                                   //because we already used a terminal operation foreach in line 20 so uncomment for check
      Stream<Integer> s3=s2.map(n -> n*2);//o/p--> 4, 16, 12
      int result=s3.reduce(0, (c,e)->(c+e));//-->0 is a initial value 
                                            //c-->carry
                                            //e-->element
                                            //o/p--> 0+4=4 → 4+16=20 → 20+12=32
                                            
      System.out.println(result);//o/p-->32
      
      System.out.println("The same program can be written like below");
     int result1= nums.stream()
    		              .filter(n->n%2==0)
                          .map(n->n*2)
                          .reduce(0,(c,e)->(c+e));
     System.out.println(result1);
      
	}

}

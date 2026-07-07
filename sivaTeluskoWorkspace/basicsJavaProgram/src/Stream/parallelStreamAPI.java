package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Parallel Stream in Java divides the data into multiple parts and processes them in parallel (using multiple threads from the ForkJoinPool).
//It can be faster than a normal (sequential) stream when:
//The operation is computationally heavy (CPU-intensive).
//The data size is large.
//The elements can be processed independently (no dependency between elements).
//It should be used only when the values are independent because : 
//In parallel streams, each element is processed in a different thread — 
//so if elements depend on each other (shared mutable data, ordering requirements, etc.),and the
//results may be incorrect or unpredictable.
//Here we will use MapToInt because it will give the IntStream and in IntStream Class 
//we are having sum opertaion which we have written by reduce()operation in streamApi program
public class parallelStreamAPI {

	public static void main(String[] args) {
		int size=10000;
List<Integer> nums=new ArrayList<Integer>(size);
Random ran=new Random();
for(int i=1;i<=size;i++) {
nums.add(ran.nextInt(100));//We are giving 100 ,it will create the random numbers from 1 to 99
}
System.out.println("Start In Sequential or Stream");
long startSeqSeconds=System.currentTimeMillis();
int sum=nums.stream()
              .map(i->{
            	  try {
            		  Thread.sleep(1);
            	  }catch(Exception e) {
            		  
            	  }
            	  return i*2;
              })
              .mapToInt(i->i)
              .sum();
long endSeqSeconds=System.currentTimeMillis();  
System.out.println("Start In Parallel Stream");
long startParallelSeconds=System.currentTimeMillis();
int sum1=nums.parallelStream()
.map(i->{
	  try {
		  Thread.sleep(1);
	  }catch(Exception e) {
		  
	  }
	  return i*2;
})
.mapToInt(i->i)
.sum();
long endParallelSeconds=System.currentTimeMillis();  
System.out.println("Output from Sequential Stream : "+sum);
System.out.println("Output from Parallel Stream : "+sum1);
System.out.println("Time Taken By Both Stream and Parallel Stream");
System.out.println("Sequential Stream Time Taken : "+(endSeqSeconds-startSeqSeconds));
System.out.println("Parallel Stream Time Taken : "+(endParallelSeconds-startParallelSeconds));

	}

}

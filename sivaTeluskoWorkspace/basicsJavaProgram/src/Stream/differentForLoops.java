package Stream;
//Normal for loop
//enchanced for loop
//foreach method
import java.util.Arrays;
import java.util.List;

public class differentForLoops {

	public static void main(String[] args) {
List<Integer> nums=Arrays.asList(3,4,5,7,8);
System.out.println("Normal For Loop");
for(int i=0;i<nums.size();i++) {
	System.out.println(nums.get(i));
}
System.out.println("Enchanced For Loop");
for(Integer i:nums) {
	System.out.println(i);
}
System.out.println("For Each");
nums.forEach(j -> System.out.println(j));
	}

}

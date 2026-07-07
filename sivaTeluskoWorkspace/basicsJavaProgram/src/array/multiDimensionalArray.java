package array;

public class multiDimensionalArray {

	public static void main(String[] args) {
int nums[][]=new int[4][5];
for(int i=0;i<4;i++) {
	for(int j=0;j<5;j++) {
		nums[i][j]=(int)(Math.random()*10);
	}
}
for(int i=0;i<4;i++) {
	for(int j=0;j<5;j++) {
		System.out.print(nums[i][j] +" ");//to print in the same line
	}
	System.out.println();//whenever the inner loop is completed i want to go the next line
}
System.out.println("To print the same thing with enchanced for loop");
for(int num[] :nums) {
	for(int m:num) {
		//System.out.println(m+" ");//check the output by uncommenting the line
		System.out.print(m+" ");
		
	}
	System.out.println();//whenever the inner loop is completed i want to go the next line
}
	}

}

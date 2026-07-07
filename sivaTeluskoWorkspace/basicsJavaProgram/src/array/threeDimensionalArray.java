package array;

public class threeDimensionalArray {

	public static void main(String[] args) {
int num[][][]=new int[3][4][5];
for(int i=0;i<3;i++) {
	for(int j=0;j<4;j++) {
		for(int k=0;k<5;k++) {
			num[i][j][k]=(int)(Math.random()*10);
		}
	}
}
//By using enchanced for loop , for enchanced for loop we dont want to tell the size itself
for(int num1[][] : num) {
	for(int m[]:num1) {
	for(int n:m) {
		System.out.print(n +" ");
	}
	System.out.println();
	}
	
}
	}

}
//Important of memory allocation for above program
//Memory Address Fact
//Even if sizes are fixed (new int[3][4][5]), the JVM allocates each 1D array separately:
//3 references at level 1
//3 × 4 = 12 references at level 2
//3 × 4 × 5 = 60 actual integers

//So total allocated arrays:
//1 array of length 3
//3 arrays of length 4
//12 arrays of length 5
//Total: 16 array objects + 60 integers.
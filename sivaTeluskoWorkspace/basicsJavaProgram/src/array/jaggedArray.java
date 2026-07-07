package array;
//Jagged array the internal array size will be changed not fixed
//after that separately we need to tell the size
public class jaggedArray {

	public static void main(String[] args) {
int num[][]=new int[4][];//the internal size is not fixed so it is called as jagged array;
num[0]=new int[2];
num[1]=new int[3];
num[2]=new int[4];
num[3]=new int[5];
for(int i=0;i<num.length;i++) {
	for(int j=0;j<num[i].length;j++) {
		num[i][j]=(int)(Math.random()*10);
	}
}
//By using enchanced for loop , for enchanced for loop we dont want to tell the size itself
for(int num1[] : num) {
	for(int k:num1) {
		System.out.print(k+" ");
	}
	System.out.println();
}
	}

}

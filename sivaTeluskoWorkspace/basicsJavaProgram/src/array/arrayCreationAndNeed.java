package array;
//Instead of declaring multiple variables to store the data of same data type we are using array
//for creating array we need to initialize the value in staring or we need to give the size
//once the size is reached then it will throw an arrayndexOut of bound exception

public class arrayCreationAndNeed {

	public static void main(String[] args) {
int num[]= {1,3,5,7,9};//one way
int num1[]=new int[5];//another way
System.out.println("Num Array Values : " +num[2]);
System.out.println("Before adding gthe value in the array num1 : "+num1[2]);
num[2]=10;
System.out.println("After changing the value of Num Array by using index[2] then th value is : " +num[2]);
System.out.println("---After adding the value of Num1 Array by using index starts-----");
num1[0]=2;
num1[1]=4;
num1[2]=6;
num1[3]=8;
num1[4]=0;
for(int i=0;i<num1.length;i++) {
	System.out.println("The values present inside num1 array is : "+num1[i]);
}
	}

}

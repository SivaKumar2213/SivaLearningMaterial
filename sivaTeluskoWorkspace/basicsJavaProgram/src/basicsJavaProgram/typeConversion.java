package basicsJavaProgram;

public class typeConversion {

	public static void main(String[] args) {
		byte b=127;
		int a=b;//implicit conversion from low to high memory
		System.out.println(a);
		
		int c=12;
		byte b1=(byte)c;//eventhough the value 12 is in byte range(-127 to 127) it wont assign to an integer so we want
		            //explicit convert this
		System.out.println(b1);
		
		int d=412;//change the value to 257 and see the printed output is 1
		byte b2=(byte)d;//412 value is out of range for byte so it will perform modulo(remainder) on the value if the
		                //total number of range for byte(-127 to 127)256 like 412%256 
		                //output is 156 output will be print is -100 because
		                 //reminder is in range between -127 to 127 it will print the value or else it will subtract the 
		                 //reminder value like 156-256=-100
		                 //total number of range for byte(-127 to 127)256 like 412%256 output is 1054.72 output will be
	
		System.out.println(b2);
	
	int f=10;
	float e=f;
	}

}

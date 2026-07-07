package OOPS;
//AutoBoxing-->Converting a primitive type → Wrapper class	int → Integer
//AutoUnboxing-->Converting a Wrapper class → primitive type	Integer → int
public class wrapper {

	public static void main(String[] args) {
int num=5;
Integer num1=new Integer(num);//boxing
Integer num2=num;//Automatically conversion done so autoboxing

Integer num3=new Integer(6);
int num4=num3.intValue();//unboxing
Integer num5=6;
int num6=num5;//autounboxing
	}

}

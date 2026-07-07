package Interface;

import java.io.ObjectInputFilter.Status;

public class enumBasics {

	public static void main(String[] args) {
		status s=status.Wait;

System.out.println("Inbuild Enum : "+s);
System.out.println("Enum number Starts from 0 : "+s.ordinal());//-->ordinal() will gives the number for this

status ss[]=status.values();//To get all the values from the enum we need to use values() method
for (status s1 : ss) {
	System.out.println(s1+" : "+s1.ordinal());
}
	}

}
enum status{
	Running,Failed,Success,Wait;
}
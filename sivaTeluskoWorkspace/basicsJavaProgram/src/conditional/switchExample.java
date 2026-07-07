package conditional;

public class switchExample {

	public static void main(String[] args) {
int n=2;
switch(n) {

case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesday");
	break;
case 4:
	System.out.println("Thursday");
	break;
/*
 * default: System.out.println("Enter a valid number from 1 to 7");
 */
case 5:
	System.out.println("Friday");
	break;
case 6:
	System.out.println("Saturday");
	break;
case 7:
	System.out.println("Sunday");
	break;
default:
	System.out.println("Enter a valid number from 1 to 7");//If the defaut case is last 
	                                                      //it does not requires a break statement or else it would required break statement
	
}
	}

}

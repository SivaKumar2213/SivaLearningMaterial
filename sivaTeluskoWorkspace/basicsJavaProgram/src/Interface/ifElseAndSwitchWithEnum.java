package Interface;
//for switch statement we dont want to explicitly give department because 
//we are passing d in switch which is of type department
public class ifElseAndSwitchWithEnum {

	public static void main(String[] args) {
		department d=department.CSE;//This value can from method or DB
		if(d==department.IT) {
			System.out.println("The Fees for "+d+" department is : "+20000);
		}else if(d==department.ECE) {
			System.out.println("The Fees for "+d+" department is : "+60000);
		}else if(d==department.EEE) {
			System.out.println("The Fees for "+d+" department is : "+40000);
		}else if(d==department.MECH) {
			System.out.println("The Fees for "+d+" department is : "+45000);
		}else if(d==department.CSE) {
			System.out.println("The Fees for "+d+" department is : "+50000);
		}else {
			System.out.println("The Fees for "+d+" department is : "+80000);
		}
		
		//same code by Using Switch Statement
		System.out.println("The Output from Switch Statement");
		d=department.ECE;
		switch(d) {
		case IT:
			System.out.println("The Fees for "+d+" department is : "+20000);
			break;
		case ECE:
			System.out.println("The Fees for "+d+" department is : "+60000);
			break;
		case EEE:
			System.out.println("The Fees for "+d+" department is : "+40000);
			break;
		case MECH:
			System.out.println("The Fees for "+d+" department is : "+45000);
			break;
		case CSE:
			System.out.println("The Fees for "+d+" department is : "+50000);
			break;
		default:
			System.out.println("The Fees for "+d+" department is : "+80000);
			
			
		}
		
	}

}
enum department{
  IT,MECH,CSE,ECE,EEE,AI
}
package OOPS;
//A object which will not create in Stack ,that is it is not assigned to any reference,so
//that type of object is called anonymousObject
public class anonymousObject {

	public static void main(String[] args) {
      new anonymousObjectCheck();//anonymousObject
      System.out.println("----------------------------------------------------------------------");
      new anonymousObjectCheck().show();//we need to create a new object for everytime
	}

}
class anonymousObjectCheck{
	public anonymousObjectCheck() {
		System.out.println("inside constructor");
	}
	public void show() {
		System.out.println("showDetails");
	}
}
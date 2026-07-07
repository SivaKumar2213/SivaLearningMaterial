package Interface;
//Class --> Class : extends
//Class --> Interface : implements
//interface --> Interface : extends
public class moreOnInterface {

	public static void main(String[] args) {
		aeroplane d=new details();//if we create an object of class with an airplane interface we cannot call run method
		                          //because airplane does not have any idea what is run method
		                          //if we create an object of class with the reference of class 
		                          //then we can call all the methods including run method also
d.start();
d.fly();
//d.run();//Compile time error

cycle c=new details();//we cannot call fly method refer previous comment
c.start();
c.run();

	}

}
interface vechicle{
	void start();
}
interface aeroplane extends vechicle{
	void fly();
}
interface bike extends vechicle{
	void run();
}
interface cycle extends bike{
	
}
class details implements aeroplane,cycle{

	public void start() {
		System.out.println("Engine Started");
	}

	public void run() {
		System.out.println("Bike/Cycle running");
	}

	public void fly() {
		System.out.println("Aeroplane flying");
	}
	
}
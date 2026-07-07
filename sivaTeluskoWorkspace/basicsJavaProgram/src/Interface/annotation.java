package Interface;
//To supply somwe extra information to compiler or at runtime so only we are using annotation
//we are override the method M class to N Class
public class annotation {

	public static void main(String[] args) {
N n=new N();
n.show();
n.show1();
M m =new M();
m.show();
	}

}
class M{
	public void show() {
		System.out.println("In M Show");
	}
	public void show1() {
		System.out.println("In M Show");
	}
}
class N extends M{
	@Override
	public void show() {
		System.out.println("In N Show");
	}
	public void show2() {
		System.out.println("In N Show");
	}
}
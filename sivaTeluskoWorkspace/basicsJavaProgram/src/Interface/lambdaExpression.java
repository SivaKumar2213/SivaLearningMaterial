package Interface;
// a lambda expression will works with a functional interface only because
//if we two methods add and sub and it does not know which methods it should work
public class lambdaExpression {

	public static void main(String[] args) {
E e =new E() {
	public void show() {
		System.out.println("By anonymous class");
	}
	
};
e.show();

//same code vy Lambda
F f1 =i-> System.out.println("By Lambda "+i);
f1.show(5);
	}

}
interface E{
	void show();
}
interface F{
	void show(int j);
}

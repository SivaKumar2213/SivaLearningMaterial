package conditional;

public class ifElse {

	public static void main(String[] args) {
int x=8;
int y=9;
if(x>y)
	System.out.println("The x is greater :"+x);
else
	System.out.println("The y is greater :"+y);
	

	if(x>y) {
		System.out.println("The x value is  :"+x);
		System.out.println("X is greater than y");
	}else {
		System.out.println("The y value is  :"+y);
		System.out.println("Y is greater than x");
	}
}
}

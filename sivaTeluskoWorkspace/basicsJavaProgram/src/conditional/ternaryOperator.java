package conditional;

public class ternaryOperator {

	public static void main(String[] args) {
int num=10;
int result =num%2==0 ?2 : 1;
System.out.println(result);

int a=40;
int b=20;
int c=30;

int max=a>b ? a>c ? a:c :b>c ?b:c;
System.out.println(max);
	}

}

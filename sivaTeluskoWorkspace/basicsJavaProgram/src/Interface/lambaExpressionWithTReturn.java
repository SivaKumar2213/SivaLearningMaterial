package Interface;

public class lambaExpressionWithTReturn {

	public static void main(String[] args) {
add a=new add() {

	@Override
	public int add(int i, int j) {
      return i+j;		
	}
	
};
int result=a.add(5, 4);
System.out.println(result);
//Lambda Expression Way
add1 a1=(i,j) -> 5+6;		
int result1=a1.add1(5, 6);
System.out.println("By Lambda Expression Way : "+result1);
sub myscore=()->87.0;
System.out.println(myscore.myScore());

	}

}
interface add{
	int add(int i,int j);
}
interface add1{
	int add1(int i,int j);
}

interface sub{
	double myScore();
}
interface someCalc{
	void calc();
}



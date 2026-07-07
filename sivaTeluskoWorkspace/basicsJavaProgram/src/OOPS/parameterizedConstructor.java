package OOPS;
//Once parameterizedConstructor is declared we cannot use default constructor without creating it 
//If parameterizedConstructor is not declared ,automatically without creting default constructor java will map that

public class parameterizedConstructor {

	public static void main(String[] args) {
		Humandefault h=new Humandefault();
		System.out.println("The Name is : "+h.getName()+ " and the age is : "+h.getAge());
		System.out.println("--------------------------------------------------------------------------------");
		//HumanParamaterized h1=new HumanParamaterized()//Compile time error
		HumanParamaterized h2=new HumanParamaterized(22,"Siva");
		System.out.println("The Name is : "+h2.getName()+ " and the age is : "+h2.getAge());
		System.out.println("--------------------------------------------------------------------------------");
	}

}
class Humandefault{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
class HumanParamaterized{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HumanParamaterized(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
}
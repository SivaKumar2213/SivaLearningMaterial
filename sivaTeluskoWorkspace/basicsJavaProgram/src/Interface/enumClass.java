package Interface;
//The enum is a class and we cannot use extends for enum class and it extends the object class like other class along with enum class
//we can define an instance variable ,method and constructor in enum 
//the constructor will be private default because we cannot create object for enum class
//in the below code samsung,apple,vivo,oppo,nokia all are separate object
//we can set the price values by constructor and instance variable
//automatically it will connect the instance variable price with the parameterized constructor
//in the below example for nokia i didnot set any price by parameterized constructor
//whenever the parameterized constructor is declared , 
//then we need to create a default constructor it it is required,it won't create automatically
public class enumClass {

	public static void main(String[] args) {
		mobilePhones mp=mobilePhones.apple;
		System.out.println("To confirm this class super class name : "+mp.getClass().getSuperclass().getName());
	mp.setPrice(23000);//in mp we will apple object so the price of apple will change
		for(mobilePhones mp1:mobilePhones.values()) {
		System.out.println(mp1+" Price :"+mp1.getPrice());
	}
	}

}
enum mobilePhones{
	samsung(20000),apple(22000),vivo(15000),oppo(10000),nokia;
	private int price;

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		
	}
	private mobilePhones(int price) {
		this.price = price;
		System.out.println("inside parameterized constructor for object : "+this.name());
	}
	private mobilePhones() {
		price=5000;
		System.out.println("inside default constructor for object : "+this.name());
	}
}
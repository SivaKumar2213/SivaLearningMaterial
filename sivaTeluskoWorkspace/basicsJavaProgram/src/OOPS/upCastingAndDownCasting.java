package OOPS;

public class upCastingAndDownCasting {

	public static void main(String[] args) {
		parents p=new parents();
		children c=new children();
		p.showParent();
		System.out.println("----------------------------------------------");
		c.showChild();
		c.showParent();//for child all the methods in parent and child is available
		System.out.println("--------------------------------------------------------");
		parents p1=new children();//UpCasting the reference type is parent but the object is child
//eventhough the object is child and the type is parent so only parent class methods will get displayed
//because compiler,The compiler looks at the reference type (parents) to decide what methods/fields are accessible.
                //So p1 can see only what is defined in parents, not what’s new in children.
		                        
		children c2=(children)new parents();//downcasting 
		c2.showParent();
		c2.showChild();
	}

}
class parents{
	public void showParent() {
		System.out.println("Parent Details");
	}
}
class children extends parents{
public void showChild() {
	System.out.println("Children Details");
	}
}
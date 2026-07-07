package OOPS;

//Main Golden rule of polymorphism -->Reference type decides what methods you are allowed to call.
                                      //Object type decides which implementation runs.

//one thing in many forms”-->PolyMorphism
//Polymorphism allows one interface (like a method name or object reference)
//to represent different underlying forms (implementations).
//Two Types of Polymorphism
    //1)Compile-time Polymorphism or Static Polymorphism At compile time example Method Overloading
   //2)Runtime Polymorphism or Dynamic Polymorphism At runtime example Method Overriding
public class dynamicTimeDispatchorRunTimePolymorphism {

	public static void main(String[] args) {
		polyParent obj=new polyParent();
		obj.show();
		obj=new polyChild1();
          obj.show();
          obj=new polyChild2();
          obj.show();
          
        //The reference variable (obj) is of parent type → polyParent
        //The actual object (created in memory) is of child type → polyChild1 or polyChild2
        // So, the same reference variable (obj) can point to different child objects at different times.
        //That’s exactly what “poly-morphism” means:One reference, many forms (of objects)
        //What happens at runtime
              //1)When you call obj.show(), Java looks at the actual object type in memory, not the reference type.
                  //That’s why:If obj refers to polyParent → it calls polyParent.show()
        		  //If obj refers to polyChild1 → it calls polyChild1.show()
                  //If obj refers to polyChild2 → it calls polyChild2.show()
        //This is called Runtime Polymorphism or Dynamic Method Dispatch,
        //because the decision of which method to execute is made at runtime.
           
        //  obj=new polyChild3();//it will give compile time error because it does not extends the parent class
	}

}
class polyParent{
	public void show() {
		System.out.println("In PolyParent class");
	}
}
class polyChild1 extends polyParent{
	public void show() {
		System.out.println("In PolyChild1 class");
	}
	
	public void child() {
		System.out.println("In PolyChild1 class");
	}
	
}
class polyChild2 extends polyParent{
	public void show() {
		System.out.println("In PolyChild2 class");
	}
}

class polyChild3 {
	public void show() {
		System.out.println("In PolyChild3 class");
	}
}
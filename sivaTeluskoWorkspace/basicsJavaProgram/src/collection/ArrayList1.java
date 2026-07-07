package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Collection is an interface,where the SequencedCollection(Interface) Extends the Collection Interface and the List(Interface) Extends the SequencedCollection(Interface)
//ArrayList is a class where it Implements the List Interface

//If we want to work only by adding and fetching the details then we can use collection as a reference object
//where Collection does not have any index methods like list interface
//generic <> was introduced after 1.4 version
//to avoid runtime exception , and we know collection will work with object
//to specify what type of object is that
//List will allow duplicate values and maintain sequece order
public class ArrayList1 {

	public static void main(String[] args) {
Collection<Integer> c= new ArrayList<Integer>();
c.add(2);
c.add(10);
c.add(8);
c.add(22);
System.out.println(c);
for (Integer num : c) {
	System.out.println(num);
}
List<Integer> l= new ArrayList<Integer>();
l.add(4);
l.add(12);
l.add(9);
l.add(24);

System.out.println("Index by Using List : "+l.get(3));
for (Integer num : l) {
	System.out.println(num);
}
	}

}

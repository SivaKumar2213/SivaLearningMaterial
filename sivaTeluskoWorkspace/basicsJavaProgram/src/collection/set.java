package collection;
//Set is an Interface ,which has HashSet,LinkedHashSet and TreeSet 
//Collection Interface Extends Iterable Interface
//Iterable interface has one method iterator() which will return the Iterator object
//Iterator has two method hasNext and next

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
Set<Integer> s=new HashSet<Integer>();//It will not give the value in sorted wayIt Implements Set
Set<Integer> T=new TreeSet<Integer>();//It will give the value in sorted format because it Implements NavigableSet and 
                                      //Navigable Set extends SortedSet
s.add(20);
s.add(18);
s.add(45);
s.add(15);
s.add(63);

T.add(20);
T.add(18);
T.add(45);
T.add(15);
T.add(63);
Iterator i=s.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
System.out.println("-------------------------------------------------");
System.out.println("Tree Set Outputs in sorted format by default");
Iterator t=T.iterator();
while(t.hasNext()) {
	System.out.println(t.next());
}
	}

}

package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> s=new HashSet<String>(); //Generic set collection

Set<String> i=new TreeSet<String>();


s.add("Apple"); //adding elements in to set.it will not be in order we provided.as it is unordered.
s.add("Banana");
s.add("Plum");

i.add("Carrot");
i.add("Beetroot");
i.add("Onion");

System.out.println(s);
System.out.println(i);

s.addAll(i);//adding i set to s

System.out.println(s);

System.out.println(s.size());// size() is given inside print command.

System.out.println(s.isEmpty());//isEmpty() is given inside print statement.if there are no elements in set ,we get true .if there are elements we we get false.
		
System.out.println(i.contains("Chilly"));//contains() is given inside print statement.if set contains given element we will get true otherwise false

System.out.println(i.contains("Carrot"));
System.out.println(s.containsAll(i));//containsAll() i given inside print command.if s set contains all elements from i,we get true .
System.out.println(i.containsAll(s));//here i set does not have elements of s set .so we get false
s.remove("Apple");// Removing element from a set and printing 
System.out.println(s);
s.removeAll(i);//removing all elements of set i from set s and printing to verify

	System.out.println(s);
	
	s.clear();//clearing all elements in the set 
	
System.out.println(s);


	}

}

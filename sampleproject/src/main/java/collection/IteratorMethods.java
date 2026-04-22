package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> s=new LinkedList<String>();

s.add("Apple");
s.add("Banana");
s.add("Orange");
s.add("Grapes");

System.out.println(s);

Iterator<String> i= s.iterator();// i is reference for iterator. s is the reference of list and <String> is the wrapper class of the list collection.

	while(i.hasNext()) {System.out.println(i.next());}//hasNext() searches for next element in the list.next() prints the element.we use while loop for this.
	
	i.remove();//removes last element from the list.
	
	System.out.println(s);// to verify the last element is removed ,we are printing the list.
	}

}

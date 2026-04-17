package collection;

import java.util.LinkedList;
import java.util.List;

public class CollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>i=new LinkedList<Integer>();//creating a generic collection of List interface with wrapper class integer and class LinkedList

i.add(10);//add method to add elements.
i.add(20);
i.add(30);
i.add(40);

System.out.println(i);

System.out.println(i.get(1));//get method is given inside printing statement.


i.set(3, 50);//setting 3rd index element as 50.

System.out.println(i);

System.out.println(i.size());//size method is given inside print statement.
System.out.println(i.isEmpty());//isEmpty method is given inside print statement.
i.remove(2);//removing element from 2nd index.

System.out.println(i);

System.out.println(i.contains(10));//contains method is given inside print statement.
System.out.println(i.contains(60));
System.out.println(i.indexOf(50));//index of method is given inside print statement.
i.add(20);
System.out.println(i);

System.out.println(i.lastIndexOf(20));//lastIndexof method is given inside print statement.
System.out.println(i.indexOf(20));//in case if there are duplicate elements ,indexOf method gives its first occurrence index and lastIndexOf method gives last occurring index.

i.add(20);
System.out.println(i);
System.out.println(i.lastIndexOf(20));





	}

}

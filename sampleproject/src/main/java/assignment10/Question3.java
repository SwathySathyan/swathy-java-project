package assignment10;

import java.util.ArrayList;
import java.util.Iterator;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> s=new ArrayList<String>();
s.add("Sun");
s.add("Moon");
s.add("Galaxies");
s.add("Planets");

System.out.println(s);
Iterator<String> i=s.iterator();

while(i.hasNext()) {
	
	System.out.println(i.next());
	
	
}


	}

}

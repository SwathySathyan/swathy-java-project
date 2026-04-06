package sample;

public class StBld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder s=new StringBuilder("hello");
		s.reverse();
		System.out.println(s);
		
		StringBuilder s1=new StringBuilder("hello");
		s1.append(" world");
		System.out.println(s1);
		
	StringBuilder s2=new StringBuilder("hello");
	
	s2.insert(2, "world");
	System.out.println(s2);
	StringBuilder s3=new StringBuilder("hello");
	s3.delete(1, 4);
	System.out.println(s3);
	
	StringBuilder s4=new StringBuilder("hello");
	 
	s4.replace(0, 4, "world");
		
	System.out.println(s4);	
		
		
		
		
		
		
		
		
		
		
		
	}

}

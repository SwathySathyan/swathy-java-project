package sample;

public class SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer  s=new StringBuffer("hello");
		s.reverse();
		System.out.println(s);
		
		
		StringBuffer s1=new StringBuffer("hello ");
		s1.append("world");
		System.out.println(s1);
		
		
		StringBuffer s2=new StringBuffer("hello");
		s2.insert(1, "world");
		System.out.println(s2);
		
		StringBuffer s3=new StringBuffer("hello");
		s3.delete(1, 3);//inclusive of start index 1 and exclusive of end index 3.ie characters at 1 and 2nd index get deleted.
		System.out.println(s3);
		
		
		StringBuffer s4=new StringBuffer("hello");
		s4.replace(1, 3, "world");// replace inclusive of start index 1 and exclusive end index 3.ie characters at 1 and 2nd index get replaced.
		System.out.println(s4);
		
	}

}

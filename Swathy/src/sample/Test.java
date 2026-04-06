package sample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="java";
		System.out.println(s.length());// to find length
		
		
		String s1="java";
		String s2="Java";
		String s3="java";
		
		System.out.println(s1.equals(s2));// to compare string .case sensitive
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equalsIgnoreCase(s2));// to compare string.This is not case sensitive
		System.out.println(s1.equalsIgnoreCase(s3));
		
		
		System.out.println(s.toUpperCase());// To return string in upper case ie lowe case values converted to upper case.
		String s4="JAva";
		System.out.println(s4.toLowerCase());// Upper case values converted to lower case.
			
		System.out.println(s.startsWith("ja"));
		System.out.println(s.startsWith("s"));
		System.out.println(s.endsWith("a"));
		System.out.println(s.endsWith("A"));
		System.out.println(s.endsWith("j"));
		System.out.println(s.charAt(3));//String starts from 0th index
		System.out.println(s.charAt(2));
		int x=100;
		System.out.println(String.valueOf(x));
		
		
	}

}

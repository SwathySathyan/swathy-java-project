package sample;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s1="Malayalam";
		
		StringBuilder Input=new StringBuilder (s1);
		
		StringBuilder s2=Input.reverse();
		
		System.out.println("Reverse is"+" "+s2);
		
		String Reverse=s2.toString();
		
		if(s1.equalsIgnoreCase(Reverse)) {System.out.println(s1+" "+"is a palindrome");}
		else {System.out.println(s1+" "+"is not a palindrome");}
	
		
		String s3="Java";
		
		StringBuilder In=new StringBuilder(s3);
		
		StringBuilder s4=In.reverse();
		System.out.println("Reverse is"+" "+s4);
		String Rev=s4.toString();
		if(s3.equalsIgnoreCase(Rev)) {System.out.println(s3+" "+"is a palindrome");}
		else {System.out.println(s3+" "+"is not a palindrome");}
		
		
		
}
}

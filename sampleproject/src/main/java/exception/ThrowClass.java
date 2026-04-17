package exception;

public class ThrowClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age =15;
if(age>=18) {
	System.out.println("Eligible for voting");
}
else {
	
	throw new ArithmeticException("Age less than 18 so not eligible for voting");
	
}
	}

}

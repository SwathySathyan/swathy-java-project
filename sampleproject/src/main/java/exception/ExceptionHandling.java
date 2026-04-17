package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		int a=5;
		int d=5/0;
		System.out.println(d);//with out try block we get Arithmetic exception.So we give exception code inside try block 
}//try can not exist alone.it need catch or finally .

catch(ArithmeticException e){ //to catch exception 
	
	System.out.println(e);//to print the reason for exception.

}

	
	finally {
		
		System.out.println("Final Output");//finally will execute with or with out exception handling.ie even if there is not catch block ,finally block will get executed.
	}
	}

}

package exception;

public class MultipleException {

	public static void main(String[] args) {
try {		// TODO Auto-generated method stub
int a[]=new int[3];//indexes are 0,1, and 2.
a[4]=7/0;
}

 catch(ArrayIndexOutOfBoundsException e) {
	 
	 System.out.println("Array Exception");
 }

catch(ArithmeticException e) {
	System.out.println("Arithmetic Exception");//which ever exception is seen  first that will be handled first.thats why in result we are seeing only 2nd catch block.
}//in a[4]=7/0; 7/0 is seen first which causes arithmetic exception,so that is cached first.
	
	try {int b=5/0;
	System.out.println(b);
	}
	
	catch(Exception f ) {System.out.println(f);}//in case if we don't know exception type ,we can just give as 'Exception' which is a parent class for all exceptions.
	}

}

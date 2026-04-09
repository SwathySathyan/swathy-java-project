package encapsulation;

public class EncapsA {

	private int a;
	private int b;
	
	public void settest(int a,int b) {//setter method
		
		this.a=a;//this key word to avoid local variables dominating instance variables
		this.b=b;
		
	}
	
	public int gettest() { //getter method to return value of a
		
		return a;
	}
	
	
	public int gettest2() { //getter method to return value of  b
		
		return b;
	}
	
	
}

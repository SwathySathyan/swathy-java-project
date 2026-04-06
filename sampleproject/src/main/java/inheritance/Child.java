package inheritance;

public class Child extends Parent {// inheritance
	
	public int test1(int a) {
		
		return a;
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ch=new Child();// creating object for child class.

int b= ch.test1(5);//calling method in child class 

System.out.println(b);

ch.test();// calling method in parent class
	}

}

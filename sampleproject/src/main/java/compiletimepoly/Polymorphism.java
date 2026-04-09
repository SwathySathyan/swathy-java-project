package compiletimepoly;

public class Polymorphism { // Compile time polymorphism is same as method overloading.
	
	public int test(int a,int b) {
		
		
		int c=a+b;
		return c;
		
		
	}
	
	public void test() {
		
		
		
		System.out.println("Hi");
	}
	
	public char test(char f) {
		
		return f;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Polymorphism pm=new Polymorphism();
System.out.println(pm.test(68, 90));
pm.test();
System.out.println(pm.test('A'));
	}

}

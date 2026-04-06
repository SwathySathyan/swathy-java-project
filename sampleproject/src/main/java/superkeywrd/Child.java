package superkeywrd;

public class Child extends Parent{//Referring immediate parent class instance variable.

	int a=8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ch=new Child();
ch.test();
	}
public void test() {
	
	System.out.println(a);
	System.out.println(super.a);
	
}
}

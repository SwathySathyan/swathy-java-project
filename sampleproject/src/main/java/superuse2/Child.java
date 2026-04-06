package superuse2;

public class Child extends Parent{ //invoking immediate parent class method
	
	public int test(int d,int e) {
		System.out.println(super.test(5,6));
		int f=d+e;
		return f;
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ch=new Child();
System.out.println(ch.test(9, 8));
	}

}

package superuse3;

public class Child extends Parent{// invoking immediate parent class constructor
	
	public Child(int d) {
		
		super(5);
		System.out.println("Hi"+" "+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ch=new Child(10);
	}

}

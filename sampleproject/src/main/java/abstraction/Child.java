package abstraction;

public class Child extends ParentAbstract {//inheritance
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ch=new Child();//creating object for child class.upcasting may not be possible here in some methods.
	ch.demo2();//calling method of child class
	ch.demo1();//calling overridden method of abstract method in parent class.
	ch.demo();//calling instance method in parent class.
	
	
	}

	@Override
	public void demo1() {
		// TODO Auto-generated method stub
		System.out.println("Hello Child.Iam overriding ");//Overriding abstract method in parent class.
	}

	public void demo2() {
		System.out.println("Iam a method of child class");
	}
}

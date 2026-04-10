package multipleinheritance;

public class ChildForMultipleInheritance implements ParentAInterface,ParentBInterface{//inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildForMultipleInheritance ch=new ChildForMultipleInheritance();

ch.demo();
ch.demo1();
int b=ch.test(6);
System.out.println("Hi Iam a method in child class"+" "+b);
	}

	@Override
	public void demo1() {
		// TODO Auto-generated method stub
		System.out.println("Hi,Iam overriding abstract method demo1 in Parent B interface");
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("Hi,Iam overriding abstract method  demo in Parent A Interface ");
	}
public int test(int a) {
	return a;
}
}

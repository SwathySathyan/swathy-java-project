package abstraction;

public class ChildClassForInterface implements ParentInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildClassForInterface ch=new ChildClassForInterface();

ch.demo();
System.out.println("Hi,Iam overriding demo1 method in parent Interface"+" "+ch.demo1(5));
System.out.println("Hi,Iam a method in child class"+" "+ch.demo3('A'));	}

	@Override
	public void demo() {//providing essential details by overriding
		// TODO Auto-generated method stub
		System.out.println("Hi Iam overriding demo method in parent interface");
	}

	@Override
	public int demo1(int a) {//providing essential details by overriding.
		
		return a;
		// TODO Auto-generated method stub
		
	}
	
	public char demo3(char c) {
return c;}

}

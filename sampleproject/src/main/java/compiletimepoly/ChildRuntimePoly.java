package compiletimepoly;

public class ChildRuntimePoly extends ParentRuntimePoly {//Run time Polymorphism .we use inheritance here

	public void test(int a) {
		
	//	super.test(6);.here if we use super keyword then parent class will get called.
		
		
		System.out.println("Hello"+" "+a);}//here we are creating a method with same name ,same type and same  parameters in 2 different classes ie Method overriding.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildRuntimePoly ch=new ChildRuntimePoly();//creating object for child class
ch.test(5);//calling child class method

ParentRuntimePoly pt=new ChildRuntimePoly();//up casting .
pt.test(6);
	}

}

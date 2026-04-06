package hierrarchicalinheritance;

public class Son extends Father{
	
	public void test1() {
		
		System.out.println("Hi Son");
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Son sn=new Son();
sn.test1();

int i=sn.test(5, 6);
System.out.println(i);
	}

}

package multilevelinheritance;

public class Son extends Father {
	
	public void test1() {
		
		System.out.println("Good morning Sunshine");
		
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Son sn=new Son();
		int i=sn.test(5);
		
		System.out.println(i);
		sn.demo();
		sn.test1();
		
		
		// TODO Auto-generated method stub

	}

}

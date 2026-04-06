package hierrarchicalinheritance;

public class Daughter extends Father{

	public void test2() {
		
		System.out.println("Hello Daughter");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Daughter dt=new Daughter();
dt.test2();
int  s=dt.test(7, 8);

System.out.println(s);

}

}

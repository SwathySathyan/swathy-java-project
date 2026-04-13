package assignment7;

public class Divisbleby10 extends Add{

	public void div() {
		int result=super.test(5, 5);
		
		System.out.println(result);
		
		if((result%10==0))
				{
			
		System.out.println("Divisble by 10");
		
			
		}
	
		else {
			System.out.println("Not divisble by 10");
		
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Divisbleby10 dv=new Divisbleby10();
	dv.div();
}
	}



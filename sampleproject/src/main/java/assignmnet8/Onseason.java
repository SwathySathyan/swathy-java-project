package assignmnet8;

public class Onseason extends Offseason{
	
	
	public void discount() {
		super.discount();
		
		int price=1500;
		double dis=price*0.40;
		System.out.println("Discount 40% on total amount in Onseason is :"+" "+dis);
		
		
	}
public static void main(String args[]) {
	
	Onseason os=new Onseason();
	os.discount();
	
	
}
}

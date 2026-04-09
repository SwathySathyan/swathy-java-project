package aggregation;

public class Agre2 {

	int x;
	int y;
	Agre1 ref;//Aggregation .Entity reference. referring 1st class in 2nd class.
	
	public void  demo(int x,int y,Agre1 ref) {
	
		this.x=x;
		this.y=y;
		this.ref=ref;
		
		
		
		
	}
	
	public void demo2() {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(ref.a);
		System.out.println(ref.b);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Agre1 ag1=new Agre1(5,6);
Agre2 ag2=new Agre2();
ag2.demo(11, 12, ag1);
ag2.demo2();
	}

}

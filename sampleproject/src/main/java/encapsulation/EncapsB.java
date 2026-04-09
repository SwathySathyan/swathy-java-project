package encapsulation;

public class EncapsB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EncapsA en=new EncapsA();//creating parent class object
en.settest(5, 6);
System.out.println(en.gettest());// calling getter methods and printing value of a and b
System.out.println(en.gettest2());

	}

}

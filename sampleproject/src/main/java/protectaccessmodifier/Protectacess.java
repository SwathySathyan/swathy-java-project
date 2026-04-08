package protectaccessmodifier;

public class Protectacess extends Protect{ //inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Protectacess p=new Protectacess();//creating object for child class.

p.test();//calling the protected access modifier method named test from the class Protect .So protect access modifier method can be accessed in another class of same package with help of inheritance
	}

}

package privateaccessmodifier;

import protectaccessmodifier.Protect;

public class ProtectAc extends Protect{//here ProtectAc is inheriting the parent class Protect from another package protectaccessmodifier.so we have to import here.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProtectAc pc=new ProtectAc();//creating object for child class.

pc.test();//calling protected access modifier method named test from the class protectaccessmodifier.So protect access modifier method can be accessed in another class in another package but with help of inheritance.
	}

}

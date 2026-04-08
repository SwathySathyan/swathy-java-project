package privateaccessmodifier;

import defaultacessmodifier.Default;

public class Dacess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Default obj=new Default();//since Default class is in another package ,it should be imported here.
	
	//obj.test();//calling a default  test method from Default class in defaultaccessmodifier package .this can not be done.default access modifier can be accessed with in classes under same package only
	}

}

package assignment9;

public class Contractor extends Employee {

	@Override
	public void calculatesalary() {
		// TODO Auto-generated method stub
	int payment=200;
	int workinghours=4;
	int salary=payment*workinghours;
	System.out.println("Salary of a contract employee per day :"+" "+salary);
	}
public static void main(String args[]) {
	
	Contractor cr=new Contractor();
	cr.calculatesalary();
	cr.fulltimeemployee();
	
	
	
}
}

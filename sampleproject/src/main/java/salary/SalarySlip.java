package salary;

public class SalarySlip extends HraPf{
	
	double totalsalary;
	
	public void total() {
				
		 totalsalary=basicpay+hra-pf-deduction+bonus;
		 System.out.println("------ SALARY SLIP ------");
	        System.out.println("Basic Pay   : " + basicpay);
	        System.out.println("HRA (5%)    : " + hra);
	        System.out.println("PF (20%)    : " + pf);
	        System.out.println("Deduction   : " + deduction);
	        System.out.println("Bonus       : " + bonus);
	        System.out.println("-------------------------");
	        System.out.println("Total Salary: " + totalsalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalarySlip sp=new SalarySlip();
		
		sp.test();
		sp.total();
		

	}

}

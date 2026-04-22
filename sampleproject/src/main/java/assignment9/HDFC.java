package assignment9;

public class HDFC implements RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HDFC hd=new HDFC();

double rate =hd.interestRate(8);//taking 8 percentage as annual interest
System.out.println("Interest rate per month is :"+rate );

System.out.println("Maturity amount is "+" "+ hd.reccuringDeposit(10000, 12, rate));
	}

	
	@Override
	public double interestRate(double annualRate) {
		
	
		// TODO Auto-generated method stub
		return( annualRate/12)/100;//monthly interest
	}

	@Override
	public double reccuringDeposit(double p, double n,double r) {
		// TODO Auto-generated method stub
		double maturity = (p * n) + ((p * n * (n + 1)) / 2.0) * r;
		return maturity;
	}

}

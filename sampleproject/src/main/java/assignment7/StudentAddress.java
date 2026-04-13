package assignment7;//using Aggregation

public class StudentAddress {
	
	String Address;
	StudentNameRoll ref;//Entity
	
	public void address(String Address,StudentNameRoll ref) {
		
		this.Address=Address;
		this.ref=ref;
		
		
	}
	
	public void print() {
		
		
		
		System.out.println("Name :"+" "+ref.Name);
		System.out.println("Roll Number :"+" "+ref.RollNumber);
		System.out.println(Address);
		
	}
		
		
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentNameRoll std=new StudentNameRoll("Swathy Sathyan", 01);
StudentAddress sa=new  StudentAddress();


sa.address("ENRA 113,Souparnikam,DSW Road,Ollur P O,TCR-680306", std);
sa.print();
	}

}

package exception;

public class ThrowsSample {

	public static void main(String[] args) throws VotingException{ //throws key word used in main method.and we are creating a class here .Name of the class will be the name of the custom exception.
		// TODO Auto-generated method stub
int age=15;

if(age>=18) {
	
	System.out.println("Eligible for Voting");
	

	
}

else {
	
	throw new VotingException("Less than 18 so not eligible for voting");// we are creating a custom exception here.
	
}
	}

}

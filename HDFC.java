//class for HDFC bank
public class HDFC implements ATMSpecification{

	@Override
	public void displayBalance() {
	   System.out.println("BALANCE OF HDFC");
		
	}

	@Override
	public void pinGeneration() {
		 System.out.println("PIN OF HDFC");		
	}

	@Override
	public void withdrawl() {
		 System.out.println("WITHDRAWL OF HDFC");
		
	}	
}

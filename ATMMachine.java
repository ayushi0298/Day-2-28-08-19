//class for ATM Machine
public class ATMMachine {
	ATMSpecification atm;
	

	public void setATM(ATMSpecification atm) {
		this.atm = atm;
	}
	public void showBalance(){
		if(atm!=null){
			atm.displayBalance();
		}
		else{
			System.out.println("PLEASE INSERT THE ATM CARD");
		}
	}
	public void generatePin(){
		if(atm!=null){
			atm.pinGeneration();
		}
		else{
			System.out.println("PLEASE INSERT THE ATM CARD");
		}
	}
	public void showWithdrawl(){
		if(atm!=null){
			atm.withdrawl();
		}
		else{
			System.out.println("PLEASE INSERT THE ATM CARD");
		}
	}
	public static void main(String[] args) {
		ATMMachine machine= new ATMMachine();
		//machine.setATM(new HDFC());
		//machine.setATM(new SBI());
		machine.showBalance();
		machine.generatePin();
		machine.showWithdrawl();
	}

}

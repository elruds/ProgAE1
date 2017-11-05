public class CustomerAccount{

	private int balancePence;
	private String cName;
	private final double retCharge = 0.2;


	public CustomerAccount() {				//constructor

	}

	public CustomerAccount(String cName) {

	}

	public CustomerAccount(String cName, int bPnce) {	//constructor
		this.cName = cName;
		this.balancePence = bPnce;

	}




	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getCname() {
		return cName;
	}

	public double getBalance() {
		return balancePence;
	}
	
	public double getBalanceInPounds() {
		return balancePence/100.0;
	}

	public double wineTransaction(int numBottles, double priceBottle) { //method to process sale
		int totalCost = numBottles * (int)(priceBottle * 100);
		return (double) totalCost;
	}

	public void updateBalanceSale(double newCost) {
        balancePence += newCost;
        
	}
	
	public void updateBalanceReturn(double newCost) {
		double balance = (1 - retCharge) * newCost;  //20% return charge
		balancePence -= balance;
		


		
		
	}

}		

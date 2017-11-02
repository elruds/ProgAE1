public class CustomerAccount{
	
	private int balancePence;
	private String cName;
	private final double retCharge = 0.02;
	
	
	public CustomerAccount() {				//constructor
		
	}
	
	public CustomerAccount(String cName) {	//constructor
		this.cName = cName;
	}
	
	public CustomerAccount(int bPnce) {		//constructor
		this.balancePence = bPnce;
		
	 }
	public String getCname() {				//getter
		return cName;
		
	}
	
	public int getBalance() {
		return balancePence;
	}
	
	public double getRetCharge() {
		return retCharge;
	}
	
	public void setcName(String cName) { //method to return customer name		//setter
		
	}
																
	public double wineSale(int numBottles, double priceBottle) { //method to process sale
																  
		balancePence = numBottles * (int)(priceBottle * 100); 
		double totalTrans = (double)(balancePence / 100);
		return totalTrans;
	}
	
	public void updateBalance(int balancePence) {
		
	}
		
	
	public double wineReturn(double totalTrans) { //method to process return
		
		return totalTrans;
	}
	
}		

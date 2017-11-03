public class CustomerAccount{
	
	private int balancePence;
	private String cName;
	private final double retCharge = 0.2;
	
	
	public CustomerAccount() {				//constructor
		
	}
	
	public CustomerAccount(String cName) {
		
	}
	
	public CustomerAccount(String cName, int bPnce, double retCharge) {	//constructor
		this.cName = cName;
		this.balancePence = bPnce;
		
	}
	
		
	 
	
	public void setcName(String cName) { //method to set customer name		
		
	}
	
	public String getCname() {				
		return cName;
	}
	
	public int setBalance() {			
		return balancePence;
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

public class CustomerAccount{
	
	private int balancePence;
	private String cName;
	private final double retCharge = 0.02;
	
	public CustomerAccount() {
	}
	
	public CustomerAccount(int bPnce, String cName) {
		this.balancePence = bPnce;
		this.cName = cName;
	}
		
	public CustomerAccount(int numBottles, double priceBottle)	{
	}
	
	 public int getBpnce() {
		 return balancePence;
	 }
	public String getCname() {
		return cName;
		
	}
	
	public void setcName(String custName) {this.cName = custName;} //method to return 
																	//customer name
	
	public double salePence(int numBottles, double priceBottle) { //method to process sale
																  
		int balancePence = numBottles * (int)(priceBottle * 100); {this.balancePence = balancePence;}
		double totalTrans = (double)(balancePence / 100);
		return totalTrans;
	}
	
	
}		

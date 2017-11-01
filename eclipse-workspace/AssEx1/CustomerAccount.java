public class CustomerAccount{
	
	private int bPounds;
	private int bPence;
	private String cName;
	private final double retCharge = 0.02;
	
	public CustomerAccount() {
	}
	
	public CustomerAccount(int bPnds, int bPnce, String cName) {
		this.bPounds = bPnds;
		this.bPence = bPnce;
		this.cName = cName;
	}
		
	public CustomerAccount(int numBottles, double priceBottle)	{
	}
	
	public int getBpnds() {
		return bPounds;
	}
	 public int getBpnce() {
		 return bPence;
	 }
	public String getCname() {
		return cName;
		
	}
	
	public void setcName(String custName) {this.cName = custName;}
	
	public void setbPence(int numBottles, double priceBottle) {
		
		int totalPence = numBottles * (int)(priceBottle * 100);
		
	}
	
	
}		

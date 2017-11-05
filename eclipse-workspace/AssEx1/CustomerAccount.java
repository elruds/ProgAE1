public class CustomerAccount{
	
	private int balancePence;
	private String cName;
	private final double retCharge = 0.2;
	
	
	public CustomerAccount(Wine w) {				//constructor
		
	}
	
	public CustomerAccount(LWMGUI view) {
		
		
	}
	
//	
//	public CustomerAccount(String cName) {
//		
//	}
	
	public CustomerAccount(String cName, int bPnce, double retCharge) {	//constructor
		this.cName = cName;
		this.balancePence = bPnce;
		
	}
	
	
	public String getCname() {				
		return cName;
	}
	
	public int getbPnce() {
		return balancePence;
	}
	
																
	public double wineSale(Wine w) { //method to process sale
		
		int totalPriceWine = w.getNumBottles() * (int)(w.getPriceBottle()* 100);
		return totalPriceWine;
//		balancePence += transaction;
//		double balance = (double)(balancePence / 100);
//		return balance;
	}
	
	public void updateBalance(Wine w) {
		
		balancePence += this.wineSale(w);
	}
	
	
	public double wineReturn(double totalTrans) { //method to process return
		
		return totalTrans;
	}
	
}		

public class Wine {

	private String wineName = "";
	private double priceBottle = 0;
	private int numBottles = 0;
	
	public Wine() {
		
	}

	public Wine (String wN, double pB, int nB) {
		this.wineName = wN;
		this.priceBottle = pB;
		this.numBottles = nB;
	}
	
	public String getWineName() {
		return wineName;
	}
	
	public double getPriceBottle() {
		return priceBottle;
	}

	public int getNumBottles() {
		return numBottles;
	}
	
	public void setWineName(String getWineName) {this.wineName = getWineName;}
	
	public void setPriceBottle(double getPriceBottle) {this.priceBottle = getPriceBottle;}
	
	public void setNumBottles(int num) {this.numBottles = num;} 
		
	public void resetFields() {
		
		this.setWineName("");
		this.setPriceBottle(0);
		this.setNumBottles(0);
	}
	}
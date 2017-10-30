
public class Wine {

	private String wineName = "";
	private double priceBottle = 0;
	private int numBottles = 0;
	

	public Wine (String wN) {
		wineName = wN;
	}
	
	public Wine (double pB) {
		priceBottle = pB;
	}

	public Wine(int nB) {
		numBottles = nB;
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
	
	public void setWineName(String getName) {this.wineName = getName;}
	
	public void setPriceBottle(double getPriceOne) {this.priceBottle = getPriceOne;}
	
	public void setNumBottles(int num) {this.numBottles = num;} 
		
	}


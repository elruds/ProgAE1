
public class Wine {

	private String wineName = "";
	private double priceBottle = 0;
	private int numBottles = 0;
	private LWMGUI viewObject;
	private LWMGUI controllerObject;
	
	public Wine (String wN, double pB, int nB) {
		wineName = wN;
		priceBottle = pB;
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
}
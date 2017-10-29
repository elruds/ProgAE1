
public class Wine {

	private String wineName = "";
	private double priceBottle = 0;
	private int numBottles = 0;
	private LWMGUI viewObject;
	private LWMGUI controllerObject;
	
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

	public void numBottles(int num) {
		
	}
}
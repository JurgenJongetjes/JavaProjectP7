package vendingMachine;

public class GeldSysteem {
	private double geld = 5.00;

	public double getGeld() {
		return geld;
	}

	public void setGeld(double geld) {
		this.geld = geld;
	}
	
	public void geldBijvulllen(double geld) {
		this.geld += geld;
	}
	
	public void geldAfHalen(double geld) {
		this.geld = this.geld - geld;
	}

}

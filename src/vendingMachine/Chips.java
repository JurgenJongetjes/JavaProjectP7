package vendingMachine;

public class Chips extends Product {
	
	protected String gewicht = "200gram";

	public Chips(String naam, double prijs, int voorraad) {
		super(naam, prijs, voorraad);
		System.out.println("Chippies");
	}
	
	//Override zodat Chips ook gewicht meeneemt
	@Override
	public String toString() {
		return "Product: " + naam + ", prijs: " + prijs + ", gewicht: " + gewicht + ", voorraad: " + voorraad + ".";
	}

	public String getGewicht() {
		return gewicht;
	}

	public void setGewicht(String gewicht) {
		this.gewicht = gewicht;
	}

}

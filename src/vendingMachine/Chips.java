package vendingMachine;

public class Chips extends Product {
	
	protected String gewicht;

	public Chips(String naam, double prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.naam = "Chips Zakje";
		this.prijs = 1.75;
		this.voorraad = 12;
		this.gewicht = "200gram";
		System.out.println("Stopt Chimpies in de automaat");
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

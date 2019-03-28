package vendingMachine;
//import vendingMachine.VendingMachine;

public class Snicker extends Product {
	
//	VendingMachine vendingmachine = new VendingMachine();

	public Snicker(String naam, double prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.naam = "Snicker";
		this.prijs = 1.25;
		this.voorraad = 10;
		System.out.println("Stopt Snickertje in de automaat");
//		Snicker snicker = new Snicker("dab", 1.25, 14);
//		System.out.println();
	}
	
}

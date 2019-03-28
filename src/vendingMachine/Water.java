package vendingMachine;

public class Water extends Product {

	public Water(String naam, double prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.naam = "Water";
		this.prijs = 1.00;
		this.voorraad = 18;
		System.out.println("water aangemaakt");
	}
}

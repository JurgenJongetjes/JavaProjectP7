package vendingMachine;

public class BroodjeGezond extends Product{
	public BroodjeGezond(String naam, double prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.naam = "BroodjeGezond";
		this.prijs = 1.85;
		this.voorraad = 8;
		System.out.println("Stopt BroodjeGezond in de automaat");
	}

}

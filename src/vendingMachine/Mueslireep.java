package vendingMachine;

public class Mueslireep extends Product{
	public Mueslireep(String naam, double prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.naam = "Meuslireep";
		this.prijs = 1.15;
		this.voorraad = 14;
		System.out.println("Stopt Meuslireep in de automaat");
	}

}

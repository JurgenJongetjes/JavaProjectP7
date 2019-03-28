package vendingMachine;

public class Appel extends Product{
	public Appel(String naam, double prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.naam = "Appel";
		this.prijs = 1.05;
		this.voorraad = 13;
		System.out.println("Stopt Appel in de automaat");
	}

}

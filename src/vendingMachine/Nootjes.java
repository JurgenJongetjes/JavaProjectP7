package vendingMachine;

public class Nootjes extends Product{
	public Nootjes(String naam, double prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.naam = "Nootjes";
		this.prijs = 1.65;
		this.voorraad = 10;
		System.out.println("Stopt Nootjes in de automaat");
	}

}

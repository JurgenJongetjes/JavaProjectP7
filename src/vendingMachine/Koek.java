package vendingMachine;

public class Koek extends Product{
	public Koek(String naam, double prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.naam = "Koek";
		this.prijs = 1.49;
		this.voorraad = 16;
		System.out.println("Stopt Koenkie in de automaat");
	}

}


	
	

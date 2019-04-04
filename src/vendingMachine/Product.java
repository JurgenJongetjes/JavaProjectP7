package vendingMachine;

//Parent van alle snacks

public class Product {
	
	//Algemene eigenschappen van alle snacks
	protected String naam;
	protected double prijs;
	protected int voorraad;
	
	public Product(String naam, double prijs, int voorraad) {
		System.out.println("Maak product aan");
		this.setNaam(naam);
		this.setPrijs(prijs);
		this.setVoorraad(voorraad);
	}
	
	//bijvullen functie
	public void bijvullen(int aantal) {
		voorraad = voorraad + aantal;
		System.out.println("Het product: "+ naam + " is bijgevuld met " + aantal + " producten (totaal: " + voorraad + ")" );
	}
	
	//uithalen functie
	public void uithalen() {
		if(voorraad > 0) {
		voorraad = voorraad - 1;
		System.out.println("één "+ naam + " is er uit gehaaldt producten (totaal: " + voorraad + ")");
		}else {
			System.out.println("error: de voorraad kan niet onder 0");
		}
	}

	/**
	 * @return the naam
	 */
	public String getNaam() {
		return naam;
	}

	/**
	 * @param naam the naam to set
	 */
	public void setNaam(String naam) {
		this.naam = naam;
	}

	/**
	 * @return the prijs
	 */
	public double getPrijs() {
		return prijs;
	}

	/**
	 * @param prijs the prijs to set
	 */
	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	/**
	 * @return the voorraad
	 */
	public int getVoorraad() {
		return voorraad;
	}

	/**
	 * @param voorraad the voorraad to set
	 */
	public void setVoorraad(int voorraad) {
		this.voorraad = voorraad;
	}
	
	@Override
	public String toString() {
		return "Product: " + naam + ", prijs: " + prijs + ", voorraad: " + voorraad + ".";
	}

}

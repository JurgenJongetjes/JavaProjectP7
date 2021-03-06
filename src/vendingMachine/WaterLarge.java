package vendingMachine;

public class WaterLarge extends Water {
	
	protected String inhoud = "";

	public WaterLarge(String naam, double prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.inhoud = "66 Cl";
		this.prijs = 1.50;
		this.voorraad = 6;
		System.out.println("Stopt groote watertjes in de automaat");
	}
	
	//Override zodat Chips ook gewicht meeneemt
		@Override
		public String toString() {
			return "Product: " + naam + ", prijs: " + prijs + ", inhoud: " + inhoud + ", voorraad: " + voorraad + ".";
		}

}

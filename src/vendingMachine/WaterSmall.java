package vendingMachine;

public class WaterSmall extends Water {
	
	protected String inhoud = "";

	public WaterSmall(String naam, double prijs, int voorraad) {
		super(naam, prijs, voorraad);
		this.inhoud = "33 Cl";
		this.voorraad = 8;
		System.out.println("Stopt kleine watertjes in de automaat");
	}
	
	//Override zodat Chips ook gewicht meeneemt
		@Override
		public String toString() {
			return "Product: " + naam + ", prijs: " + prijs + ", inhoud: " + inhoud + ", voorraad: " + voorraad + ".";
		}

}

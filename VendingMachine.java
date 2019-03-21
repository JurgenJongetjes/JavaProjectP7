package vendingMachine;

import java.util.ArrayList;

public class VendingMachine {

	String Voorraad = "";

	public ArrayList<Product> list;
	public ArrayList<String> productList;

	public VendingMachine() {
		System.out.println("Maak een Vending Machine");

		list = new ArrayList<Product>();

		// Set eigenschappen Snicker
		Snicker snicker = new Snicker("Snicker", 1.75, 12);
		list.add(snicker);

		Chips chips = new Chips("Chips", 2.50, 10);
		list.add(chips);

		printVoorraad();

	}

	public void printVoorraad() {
		for (Product product : list) {
			System.out.println(product.toString());
		}
	}

	// public String printVoorraad() {
	// ArrayList<String> productList = new ArrayList<String>();
	// for (Product product : list) {
	// //Stop uitkomst in een lijst
	// productList.add(product.toString());
	// //Zet lijst in een herbruikbare String
	// Voorraad = productList.toString();
	// }
	// //Return Voorraad String
	// return Voorraad;
	// }

}

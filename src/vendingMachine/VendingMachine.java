package vendingMachine;

import java.util.ArrayList;

public class VendingMachine {
	GeldSysteem geldsysteem = new GeldSysteem();
	
	String Voorraad = "";
	
	public ArrayList<Product> list;
	public ArrayList<String> productList;
	
	public VendingMachine() {
		System.out.println("Maak de Vending Machine");
		
		list = new ArrayList<Product>();
		
		//Set eigenschappen Snicker 0
		Snicker snicker = new Snicker("", 0, 0);
		list.add(snicker);
		
		//Set eigenschappen Chips 1
		Chips chips = new Chips("", 0, 0);
		list.add(chips);
		
		//Set eigenschappen Koek 2
		Koek koekje = new Koek("", 0, 0);
		list.add(koekje);
		
		//Set eigenschappen Meuslireep 3
		Mueslireep mueslireep = new Mueslireep("", 0, 0);
		list.add(mueslireep);
		
		//Set eigenschappen Nootjes 4
		Nootjes nootjes = new Nootjes("", 0, 0);
		list.add(nootjes);
		
		//Set eigenschappen Appel 5
		Appel appel = new Appel("", 0, 0);
		list.add(appel);
		
		//Set eigenschappen BroodjeGezond 6
		BroodjeGezond broodjegezond = new BroodjeGezond("", 0, 0);
		list.add(broodjegezond);

		//set eingenschappen waterSmall 7
		WaterSmall waterSmall = new WaterSmall("", 0, 0);
		list.add(waterSmall);
		
		//set eigenschappen waterLarge 8
		WaterLarge waterLarge = new WaterLarge("", 0, 0);
		list.add(waterLarge);
		
		printVoorraad();
		
	}
	
	// Return ArrayList zodat opnieuw kan gebruiken
	public ArrayList<Product> getList() {
	       return list;
	}
	
	public void printVoorraad() {
		for (Product product : list) {
			System.out.println(product.toString());
		}
	}
	
	//format methode
	public String format(double dubbel) {
		return String.format("%1$,.2f", dubbel);
	}
	
	
//	public String printVoorraad() {
//		ArrayList<String> productList = new ArrayList<String>();
//		for (Product product : list) {
//			//Stop uitkomst in een lijst
//			productList.add(product.toString());
//			//Zet lijst in een herbruikbare String
//			Voorraad = productList.toString();
//		}
//		//Return Voorraad String
//		return Voorraad;
//	}

}

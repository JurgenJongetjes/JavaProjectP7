package vendingMachine;

import java.util.ArrayList;

public class VendingMachine {
	
	String Voorraad = "";
	
	public ArrayList<Product> list;
	public ArrayList<String> productList;
	
	public VendingMachine() {
		System.out.println("Maak de Vending Machine");
		
		list = new ArrayList<Product>();
		
		//Set eigenschappen Snicker
		Snicker snicker = new Snicker("", 0, 0);
		list.add(snicker);
		
		//Set eigenschappen Chips
		Chips chips = new Chips("", 0, 0);
		list.add(chips);
		
		//Set eigenschappen Koek
		Koek koekje = new Koek("", 0, 0);
		list.add(koekje);
		
		//Set eigenschappen Meuslireep
		Mueslireep mueslireep = new Mueslireep("", 0, 0);
		list.add(mueslireep);
		
		//Set eigenschappen Nootjes
		Nootjes nootjes = new Nootjes("", 0, 0);
		list.add(nootjes);
		
		//Set eigenschappen Appel
		Appel appel = new Appel("", 0, 0);
		list.add(appel);
		
		//Set eigenschappen BroodjeGezond
		BroodjeGezond broodjegezond = new BroodjeGezond("", 0, 0);
		list.add(broodjegezond);
		
		printVoorraad();
		
	}
	
	// Returm ArrayList zodat opnieuw kan gebruiken
	public ArrayList<Product> getList() {
	       return list;
	}
	
	public void printVoorraad() {
		for (Product product : list) {
			System.out.println(product.toString());
		}
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

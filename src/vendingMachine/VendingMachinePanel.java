package vendingMachine;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VendingMachinePanel extends JPanel {

	public VendingMachinePanel() {

		// Maak styling aan voor JPanel
		System.out.println("Maak VendingMachinePanel aan");
		this.setBackground(Color.LIGHT_GRAY);

		// VendingMachine object maken
		VendingMachine vendingmachine = new VendingMachine();

		// Label maken
		JLabel snickersinfo = new JLabel("voorraad: " + vendingmachine.list.get(0).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(0).getPrijs()));
		JLabel chipsinfo = new JLabel("voorraad: " + vendingmachine.list.get(1).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(1).getPrijs()));
		JLabel koekinfo = new JLabel("voorraad: " + vendingmachine.list.get(2).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(2).getPrijs()));
		JLabel meuslireepinfo = new JLabel("voorraad: " + vendingmachine.list.get(3).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(3).getPrijs()));
		JLabel nootjesinfo = new JLabel("voorraad: " + vendingmachine.list.get(4).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(4).getPrijs()));
		JLabel appelinfo = new JLabel("voorraad: " + vendingmachine.list.get(5).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(5).getPrijs()));
		JLabel broodjegezondinfo = new JLabel("voorraad: " + vendingmachine.list.get(6).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(6).getPrijs()));
		JLabel waterSmallinfo = new JLabel("voorraad: " + vendingmachine.list.get(7).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(7).getPrijs()));
		JLabel waterLargeinfo = new JLabel("voorraad: " + vendingmachine.list.get(8).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(8).getPrijs()));
		JLabel geld = new JLabel("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));

		// Button maken
		JButton button0 = new JButton("Snicker");
		JButton button1 = new JButton("Chips");
		JButton button2 = new JButton("Koek");
		JButton button3 = new JButton("Meuslireep");
		JButton button4 = new JButton("Nootjes");
		JButton button5 = new JButton("Appel");
		JButton button6 = new JButton("BroodjeGezond");
		JButton button7 = new JButton("waterSmall");
		JButton button8 = new JButton("waterLarge");
		JButton geldterug = new JButton("Geld terug");

		// dingen toevoegen aan paneel
		add(button0);
		add(snickersinfo);
		add(button1);
		add(chipsinfo);
		add(button2);
		add(koekinfo);
		add(button3);
		add(meuslireepinfo);
		add(button4);
		add(nootjesinfo);
		add(button5);
		add(appelinfo);
		add(button6);
		add(broodjegezondinfo);
		add(button7);
		add(waterSmallinfo);
		add(button8);
		add(waterLargeinfo);
		add(geld);
		add(geldterug);

		button0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// checken of het product geen voorraad van 0 heeft
				if (vendingmachine.list.get(0).getVoorraad() == 0) {
					System.out.println("Dit product is op");
					button0.setBackground(Color.RED);
				} else {
					// checken of je genoeg geld hebt.
					if (vendingmachine.list.get(0).getPrijs() <= vendingmachine.geldsysteem.getGeld()) {
						// product er uit halen
						vendingmachine.list.get(0).uithalen();
						// geld er af halen
						vendingmachine.geldsysteem.geldAfHalen(vendingmachine.list.get(0).getPrijs());
						// labels refreshen
						geld.setText("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
						snickersinfo.setText("vooraad: " + vendingmachine.list.get(0).getVoorraad() + " prijs: €"
								+ vendingmachine.list.get(0).getPrijs());
					}
				}
			}
		});

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vendingmachine.list.get(1).getVoorraad() == 0) {
					System.out.println("Dit product is op");
					button1.setBackground(Color.RED);
				} else {
					if (vendingmachine.list.get(1).getPrijs() <= vendingmachine.geldsysteem.getGeld()) {
						vendingmachine.list.get(1).uithalen();
						chipsinfo.setText("vooraad: " + vendingmachine.list.get(1).getVoorraad() + " prijs: €"
								+ vendingmachine.list.get(1).getPrijs());
						vendingmachine.geldsysteem.geldAfHalen(vendingmachine.list.get(1).getPrijs());
						geld.setText("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
					}
				}
			}
		});

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vendingmachine.list.get(2).getVoorraad() == 0) {
					System.out.println("Dit product is op");
					button2.setBackground(Color.RED);
				} else {
					if (vendingmachine.list.get(2).getPrijs() <= vendingmachine.geldsysteem.getGeld()) {
						vendingmachine.list.get(2).uithalen();
						koekinfo.setText("vooraad: " + vendingmachine.list.get(2).getVoorraad() + " prijs: €"
								+ vendingmachine.list.get(2).getPrijs());
						vendingmachine.geldsysteem.geldAfHalen(vendingmachine.list.get(2).getPrijs());
						geld.setText("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
					}
				}
			}
		});

		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vendingmachine.list.get(3).getVoorraad() == 0) {
					System.out.println("Dit product is op");
					button3.setBackground(Color.RED);
				} else {
					if (vendingmachine.list.get(3).getPrijs() <= vendingmachine.geldsysteem.getGeld()) {
						vendingmachine.list.get(3).uithalen();
						meuslireepinfo.setText("vooraad: " + vendingmachine.list.get(3).getVoorraad() + " prijs: €"
								+ vendingmachine.list.get(3).getPrijs());
						vendingmachine.geldsysteem.geldAfHalen(vendingmachine.list.get(3).getPrijs());
						geld.setText("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
					}
				}
			}
		});

		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vendingmachine.list.get(4).getVoorraad() == 0) {
					System.out.println("Dit product is op");
					button4.setBackground(Color.RED);
				} else {
					if (vendingmachine.list.get(4).getPrijs() <= vendingmachine.geldsysteem.getGeld()) {
						vendingmachine.list.get(4).uithalen();
						nootjesinfo.setText("vooraad: " + vendingmachine.list.get(4).getVoorraad() + " prijs: €"
								+ vendingmachine.list.get(4).getPrijs());
						vendingmachine.geldsysteem.geldAfHalen(vendingmachine.list.get(4).getPrijs());
						geld.setText("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
					}
				}
			}
		});

		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vendingmachine.list.get(5).getVoorraad() == 0) {
					System.out.println("Dit product is op");
					button5.setBackground(Color.RED);
				} else {
					if (vendingmachine.list.get(5).getPrijs() <= vendingmachine.geldsysteem.getGeld()) {
						vendingmachine.list.get(5).uithalen();
						appelinfo.setText("vooraad: " + vendingmachine.list.get(5).getVoorraad() + " prijs: €"
								+ vendingmachine.list.get(5).getPrijs());
						vendingmachine.geldsysteem.geldAfHalen(vendingmachine.list.get(5).getPrijs());
						geld.setText("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
					}
				}
			}
		});

		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vendingmachine.list.get(6).getVoorraad() == 0) {
					System.out.println("Dit product is op");
					button6.setBackground(Color.RED);
				} else {
					if (vendingmachine.list.get(6).getPrijs() <= vendingmachine.geldsysteem.getGeld()) {
						vendingmachine.list.get(6).uithalen();
						broodjegezondinfo.setText("vooraad: " + vendingmachine.list.get(6).getVoorraad() + " prijs: €"
								+ vendingmachine.list.get(6).getPrijs());
						vendingmachine.geldsysteem.geldAfHalen(vendingmachine.list.get(6).getPrijs());
						geld.setText("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
					}
				}
			}
		});

		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vendingmachine.list.get(6).getVoorraad() == 0) {
					System.out.println("Dit product is op");
					button7.setBackground(Color.RED);
				} else {
					if (vendingmachine.list.get(7).getPrijs() <= vendingmachine.geldsysteem.getGeld()) {
						vendingmachine.list.get(7).uithalen();
						waterSmallinfo.setText("vooraad: " + vendingmachine.list.get(7).getVoorraad() + " prijs: €"
								+ vendingmachine.list.get(7).getPrijs());
						vendingmachine.geldsysteem.geldAfHalen(vendingmachine.list.get(7).getPrijs());
						geld.setText("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
					}	
				}
			}
		});

		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vendingmachine.list.get(0).getVoorraad() == 0) {
					System.out.println("Dit product is op");
					button8.setBackground(Color.RED);
				} else {
					if (vendingmachine.list.get(8).getPrijs() <= vendingmachine.geldsysteem.getGeld()) {
						vendingmachine.list.get(8).uithalen();
						waterLargeinfo.setText("vooraad: " + vendingmachine.list.get(8).getVoorraad() + " prijs: €"
								+ vendingmachine.list.get(8).getPrijs());
						vendingmachine.geldsysteem.geldAfHalen(vendingmachine.list.get(8).getPrijs());
						geld.setText("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
					}	
				}
			}
		});

		// geldterug knop
		geldterug.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// slaat het geld op in een string
				String geldstring = String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld());
				// haal al het geld er uit
				vendingmachine.geldsysteem.setGeld(0.00);
				// zeg in de concole hoe veel geld er uit is gehaald
				System.out.println("Er is " + geldstring + " uit de vending machine gehaald");
				// geld label refreshed
				geld.setText("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
			}
		});
	}
}

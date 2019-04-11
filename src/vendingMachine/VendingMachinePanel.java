package vendingMachine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
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
		snickersinfo.setForeground(Color.WHITE);
        snickersinfo.setPreferredSize(new Dimension(200, 30));
        snickersinfo.setFont(new Font("Arial", Font.BOLD, 13));
        
		JLabel chipsinfo = new JLabel("voorraad: " + vendingmachine.list.get(1).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(1).getPrijs()));
		chipsinfo.setForeground(Color.WHITE);
        chipsinfo.setPreferredSize(new Dimension(200, 30));
        chipsinfo.setFont(new Font("Arial", Font.BOLD, 13));
        
		JLabel koekinfo = new JLabel("voorraad: " + vendingmachine.list.get(2).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(2).getPrijs()));
		koekinfo.setForeground(Color.WHITE);
		koekinfo.setPreferredSize(new Dimension(200, 30));
        koekinfo.setFont(new Font("Arial", Font.BOLD, 13));
        
		JLabel meuslireepinfo = new JLabel("voorraad: " + vendingmachine.list.get(3).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(3).getPrijs()));
		meuslireepinfo.setForeground(Color.WHITE);
        meuslireepinfo.setPreferredSize(new Dimension(200, 30));
        meuslireepinfo.setFont(new Font("Arial", Font.BOLD, 13));
        
		JLabel nootjesinfo = new JLabel("voorraad: " + vendingmachine.list.get(4).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(4).getPrijs()));
		nootjesinfo.setForeground(Color.WHITE);
        nootjesinfo.setPreferredSize(new Dimension(200, 30));
        nootjesinfo.setFont(new Font("Arial", Font.BOLD, 13));
        
		JLabel appelinfo = new JLabel("voorraad: " + vendingmachine.list.get(5).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(5).getPrijs()));
		appelinfo.setForeground(Color.WHITE);
        appelinfo.setPreferredSize(new Dimension(200, 30));
        appelinfo.setFont(new Font("Arial", Font.BOLD, 13));
        
		JLabel broodjegezondinfo = new JLabel("voorraad: " + vendingmachine.list.get(6).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(6).getPrijs()));
		broodjegezondinfo.setForeground(Color.WHITE);
        broodjegezondinfo.setPreferredSize(new Dimension(200, 30));
        broodjegezondinfo.setFont(new Font("Arial", Font.BOLD, 13));
        
		JLabel waterSmallinfo = new JLabel("voorraad: " + vendingmachine.list.get(7).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(7).getPrijs()));
		waterSmallinfo.setForeground(Color.WHITE);
        waterSmallinfo.setPreferredSize(new Dimension(200, 30));
        waterSmallinfo.setFont(new Font("Arial", Font.BOLD, 13));
        
		JLabel waterLargeinfo = new JLabel("voorraad: " + vendingmachine.list.get(8).getVoorraad() + " prijs: €"
				+ vendingmachine.format(vendingmachine.list.get(8).getPrijs()));
		waterLargeinfo.setForeground(Color.WHITE);
        waterLargeinfo.setPreferredSize(new Dimension(200, 30));
        waterLargeinfo.setFont(new Font("Arial", Font.BOLD, 13));
        
		JLabel geld = new JLabel("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
		geld.setForeground(Color.WHITE);
        geld.setPreferredSize(new Dimension(200, 30));
        geld.setFont(new Font("Arial", Font.BOLD, 13));

		// Button maken
		JButton button0 = new JButton("Snicker");
		button0.setBackground(Color.GRAY);
        button0.setForeground(Color.WHITE);
        button0.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK));
        button0.setPreferredSize(new Dimension(100, 30));
        
		JButton button1 = new JButton("Chips");
		button1.setBackground(Color.GRAY);
        button1.setForeground(Color.WHITE);
        button1.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK));
        button1.setPreferredSize(new Dimension(100, 30));
        
		JButton button2 = new JButton("Koek");
		button2.setBackground(Color.GRAY);
        button2.setForeground(Color.WHITE);
        button2.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK));
        button2.setPreferredSize(new Dimension(100, 30));
        
		JButton button3 = new JButton("Meuslireep");
		button3.setBackground(Color.GRAY);
        button3.setForeground(Color.WHITE);
        button3.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK));
        button3.setPreferredSize(new Dimension(100, 30));
        
		JButton button4 = new JButton("Nootjes");
		button4.setBackground(Color.GRAY);
        button4.setForeground(Color.WHITE);
        button4.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK));
        button4.setPreferredSize(new Dimension(100, 30));
        
		JButton button5 = new JButton("Appel");
		button5.setBackground(Color.GRAY);
        button5.setForeground(Color.WHITE);
        button5.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK));
        button5.setPreferredSize(new Dimension(100, 30));
        
		JButton button6 = new JButton("BroodjeGezond");
		button6.setBackground(Color.GRAY);
        button6.setForeground(Color.WHITE);
        button6.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK));
        button6.setPreferredSize(new Dimension(100, 30));
        
		JButton button7 = new JButton("waterSmall");
		button7.setBackground(Color.GRAY);
        button7.setForeground(Color.WHITE);
        button7.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK));
        button7.setPreferredSize(new Dimension(100, 30));
        
		JButton button8 = new JButton("waterLarge");
		button8.setBackground(Color.GRAY);
        button8.setForeground(Color.WHITE);
        button8.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK));
        button8.setPreferredSize(new Dimension(100, 30));
        
		JButton geldterug = new JButton("Geld terug");
		geld.setForeground(Color.WHITE);
        geld.setPreferredSize(new Dimension(100, 30));
        geld.setFont(new Font("Arial", Font.BOLD, 13));

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
						snickersinfo.setText("voorraad: " + vendingmachine.list.get(0).getVoorraad() + " prijs: €"
								+ vendingmachine.format(vendingmachine.list.get(0).getPrijs()));
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
						chipsinfo.setText("voorraad: " + vendingmachine.list.get(1).getVoorraad() + " prijs: €"
								+ vendingmachine.format(vendingmachine.list.get(1).getPrijs()));
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
						koekinfo.setText("voorraad: " + vendingmachine.list.get(2).getVoorraad() + " prijs: €"
								+ vendingmachine.format(vendingmachine.list.get(2).getPrijs()));
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
						meuslireepinfo.setText("voorraad: " + vendingmachine.list.get(3).getVoorraad() + " prijs: €"
								+ vendingmachine.format(vendingmachine.list.get(3).getPrijs()));
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
						nootjesinfo.setText("voorraad: " + vendingmachine.list.get(4).getVoorraad() + " prijs: €"
								+ vendingmachine.format(vendingmachine.list.get(4).getPrijs()));
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
						appelinfo.setText("voorraad: " + vendingmachine.list.get(5).getVoorraad() + " prijs: €"
								+ vendingmachine.format(vendingmachine.list.get(5).getPrijs()));
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
						broodjegezondinfo.setText("voorraad: " + vendingmachine.list.get(6).getVoorraad() + " prijs: €"
								+ vendingmachine.format(vendingmachine.list.get(6).getPrijs()));
						vendingmachine.geldsysteem.geldAfHalen(vendingmachine.list.get(6).getPrijs());
						geld.setText("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
					}
				}
			}
		});

		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vendingmachine.list.get(7).getVoorraad() == 0) {
					System.out.println("Dit product is op");
					button7.setBackground(Color.RED);
				} else {
					if (vendingmachine.list.get(7).getPrijs() <= vendingmachine.geldsysteem.getGeld()) {
						vendingmachine.list.get(7).uithalen();
						waterSmallinfo.setText("voorraad: " + vendingmachine.list.get(7).getVoorraad() + " prijs: €"
								+ vendingmachine.format(vendingmachine.list.get(7).getPrijs()));
						vendingmachine.geldsysteem.geldAfHalen(vendingmachine.list.get(7).getPrijs());
						geld.setText("geld: " + String.format("%1$,.2f", vendingmachine.geldsysteem.getGeld()));
					}	
				}
			}
		});

		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vendingmachine.list.get(8).getVoorraad() == 0) {
					System.out.println("Dit product is op");
					button8.setBackground(Color.RED);
				} else {
					if (vendingmachine.list.get(8).getPrijs() <= vendingmachine.geldsysteem.getGeld()) {
						vendingmachine.list.get(8).uithalen();
						waterLargeinfo.setText("voorraad: " + vendingmachine.list.get(8).getVoorraad() + " prijs: €"
								+ vendingmachine.format(vendingmachine.list.get(8).getPrijs()));
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

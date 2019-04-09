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

		/* Product snicker = new Snicker("", 0, 0); */

		// Label maken
		JLabel snickersinfo = new JLabel("vooraad: " + vendingmachine.list.get(0).getVoorraad() + " prijs: €" + vendingmachine.list.get(0).getPrijs());
		JLabel chipsinfo = new JLabel("vooraad: " + vendingmachine.list.get(1).getVoorraad() + " prijs: €" + vendingmachine.list.get(1).getPrijs());
		JLabel koekinfo = new JLabel("vooraad: " + vendingmachine.list.get(2).getVoorraad() + " prijs: €" + vendingmachine.list.get(2).getPrijs());
		JLabel meuslireepinfo = new JLabel("vooraad: " + vendingmachine.list.get(3).getVoorraad() + " prijs: €" + vendingmachine.list.get(3).getPrijs());
		JLabel nootjesinfo = new JLabel("vooraad: " + vendingmachine.list.get(4).getVoorraad() + " prijs: €" + vendingmachine.list.get(4).getPrijs());
		JLabel appelinfo = new JLabel("vooraad: " + vendingmachine.list.get(5).getVoorraad() + " prijs: €" + vendingmachine.list.get(5).getPrijs());
		JLabel broodjegezondinfo = new JLabel("vooraad: " + vendingmachine.list.get(6).getVoorraad() + " prijs: €" + vendingmachine.list.get(6).getPrijs());
		JLabel waterSmallinfo = new JLabel("vooraad: " + vendingmachine.list.get(7).getVoorraad() + " prijs: €" + vendingmachine.list.get(7).getPrijs());
		JLabel waterLargeinfo = new JLabel("vooraad: " + vendingmachine.list.get(8).getVoorraad() + " prijs: €" + vendingmachine.list.get(8).getPrijs());

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
		
		//dingen toevoegen aan paneel
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

		button0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(0).uithalen();
				snickersinfo.setText("vooraad: " + vendingmachine.list.get(0).getVoorraad() + " prijs: €" + vendingmachine.list.get(0).getPrijs());
			}
		});

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(1).uithalen();
				chipsinfo.setText("vooraad: " + vendingmachine.list.get(1).getVoorraad() + " prijs: €" + vendingmachine.list.get(1).getPrijs());
			}
		});

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(2).uithalen();
				koekinfo.setText("vooraad: " + vendingmachine.list.get(2).getVoorraad() + " prijs: €" + vendingmachine.list.get(2).getPrijs());
			}
		});

		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(3).uithalen();
				meuslireepinfo.setText("vooraad: " + vendingmachine.list.get(3).getVoorraad() + " prijs: €" + vendingmachine.list.get(3).getPrijs());
			}
		});

		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(4).uithalen();
				nootjesinfo.setText("vooraad: " + vendingmachine.list.get(4).getVoorraad() + " prijs: €" + vendingmachine.list.get(4).getPrijs());
			}
		});

		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(5).uithalen();
				appelinfo.setText("vooraad: " + vendingmachine.list.get(5).getVoorraad() + " prijs: €" + vendingmachine.list.get(5).getPrijs());
			}
		});

		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(6).uithalen();
				broodjegezondinfo.setText("vooraad: " + vendingmachine.list.get(6).getVoorraad() + " prijs: €" + vendingmachine.list.get(6).getPrijs());
			}
		});

		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(7).uithalen();
				waterSmallinfo.setText("vooraad: " + vendingmachine.list.get(7).getVoorraad() + " prijs: €" + vendingmachine.list.get(7).getPrijs());
			}
		});
		
		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(8).uithalen();
				waterLargeinfo.setText("vooraad: " + vendingmachine.list.get(8).getVoorraad() + " prijs: €" + vendingmachine.list.get(8).getPrijs());
			}
		});

	}

}

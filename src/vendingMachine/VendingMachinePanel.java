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
		System.out.println("DABS");
		this.setBackground(Color.LIGHT_GRAY);

		// VendingMachine object maken
		VendingMachine vendingmachine = new VendingMachine();

		/* Product snicker = new Snicker("", 0, 0); */

		// Label maken
		add(new JLabel("Vending Machine"));
		JLabel snickersinfo = new JLabel("vooraad: " + vendingmachine.list.get(0).getVoorraad() + " prijs: €" + vendingmachine.list.get(0).getPrijs());
		JLabel chipsinfo = new JLabel("vooraad: " + vendingmachine.list.get(1).getVoorraad() + " prijs: €" + vendingmachine.list.get(1).getPrijs());
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
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);

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
			}
		});

		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(3).uithalen();
			}
		});

		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(4).uithalen();
			}
		});

		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(5).uithalen();
			}
		});

		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(6).uithalen();
			}
		});

		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(7).uithalen();
			}
		});
		
		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vendingmachine.list.get(8).uithalen();
			}
		});

	}

}

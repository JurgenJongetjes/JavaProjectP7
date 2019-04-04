package vendingMachine;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JPanel;

public class VendingMachinePanel extends JPanel {
	
	public VendingMachinePanel() {
		
		//Maak styling aan voor JPanel
		System.out.println("Maak VendingMachinePanel aan");
		System.out.println("DABS");
		this.setBackground(Color.LIGHT_GRAY);
		
		//VendingMachine object maken
		VendingMachine vendingmachine = new VendingMachine();
		
		Product snicker = new Snicker("", 0, 0);
		
		//Label maken
		add(new JLabel("Vending Machine"));
		
		//Button maken
		JButton button = new JButton("Snicker");
		add(button);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int Voorraad = snicker.getVoorraad();
				--Voorraad;
				System.out.println("Click");
				System.out.println(Voorraad);
			}
		});
		
	}

}

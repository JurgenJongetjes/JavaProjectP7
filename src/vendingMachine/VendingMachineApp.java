package vendingMachine;

import javax.swing.JFrame;

public class VendingMachineApp {

	public static void main(String[] args) {
		
		System.out.println("Start VendingMachineApp");
		
		JFrame frame = new JFrame("FRAME");
		frame.setSize(600, 800);
		frame.setTitle("Vending Machine");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new VendingMachinePanel());
		frame.setVisible(true);

	}

}

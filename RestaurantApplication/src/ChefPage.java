import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;

public class ChefPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChefPage window = new ChefPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChefPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnChefRole = new JTextPane();
		txtpnChefRole.setText("Chef Role");
		txtpnChefRole.setEditable(false);
		txtpnChefRole.setBackground(SystemColor.menu);
		txtpnChefRole.setBounds(40, 11, 101, 22);
		frame.getContentPane().add(txtpnChefRole);
		
		JButton btnNewButton = new JButton("Change Menu");
		btnNewButton.setBounds(40, 156, 164, 52);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPlaceOrders = new JButton("Place Orders");
		btnPlaceOrders.setBounds(226, 156, 164, 52);
		frame.getContentPane().add(btnPlaceOrders);
		
		JButton btnNewButton_1 = new JButton("Log Out");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(40, 219, 164, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}

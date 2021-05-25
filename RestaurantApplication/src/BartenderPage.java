import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class BartenderPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BartenderPage window = new BartenderPage();
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
	public BartenderPage() {
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
		
		JButton btnNewButton = new JButton("Change Menu");
		btnNewButton.setBounds(40, 153, 164, 52);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPlaceOrders = new JButton("Place Orders");
		btnPlaceOrders.setBounds(228, 153, 164, 52);
		frame.getContentPane().add(btnPlaceOrders);
		
		JButton btnNewButton_1 = new JButton("Log Out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(40, 216, 164, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextPane txtpnBartenderRole = new JTextPane();
		txtpnBartenderRole.setEditable(false);
		txtpnBartenderRole.setText("Bartender Role");
		txtpnBartenderRole.setBackground(SystemColor.menu);
		txtpnBartenderRole.setBounds(40, 11, 101, 22);
		frame.getContentPane().add(txtpnBartenderRole);
	}
}

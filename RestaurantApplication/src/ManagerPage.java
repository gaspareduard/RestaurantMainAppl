import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class ManagerPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerPage window = new ManagerPage();
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
	public ManagerPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Check Inventory");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Insert my action
			}
		});
		btnNewButton.setBounds(40, 153, 164, 52);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Log Out");
		btnNewButton_1.setBackground(SystemColor.window);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(40, 216, 164, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextPane txtrManagerRole = new JTextPane();
		txtrManagerRole.setEditable(false);
		txtrManagerRole.setBackground(SystemColor.menu);
		txtrManagerRole.setText("Manager Role");
		txtrManagerRole.setBounds(40, 11, 101, 22);
		frame.getContentPane().add(txtrManagerRole);
	}
}

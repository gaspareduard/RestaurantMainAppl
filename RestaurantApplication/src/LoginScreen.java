import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginScreen {

	private JFrame frame;
	private JTextPane txtLogin;
	private JTextPane txtUsername;
	private JTextPane txtPassword;
	private JPasswordField passwordField;
	private JTextField idField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen window = new LoginScreen();
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
	public LoginScreen() {
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
		
		txtLogin = new JTextPane();
		txtLogin.setBackground(SystemColor.menu);
		txtLogin.setBounds(213, 33, 72, 33);
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtLogin.setText("LOGIN");
		txtLogin.setEditable(false);
		frame.getContentPane().add(txtLogin);
		
		txtUsername = new JTextPane();
		txtUsername.setBackground(SystemColor.menu);
		txtUsername.setText("Username");
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUsername.setEditable(false);
		txtUsername.setBounds(31, 76, 85, 31);
		frame.getContentPane().add(txtUsername);
		
		txtPassword = new JTextPane();
		txtPassword.setBackground(SystemColor.menu);
		txtPassword.setText("Password");
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPassword.setEditable(false);
		txtPassword.setBounds(35, 129, 81, 24);
		frame.getContentPane().add(txtPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(126, 130, 259, 24);
		frame.getContentPane().add(passwordField);
		
		idField = new JTextField();
		idField.setBounds(126, 80, 259, 24);
		frame.getContentPane().add(idField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(132, 183, 112, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegisterPage newRegister = new RegisterPage();
				newRegister.main(null);

				frame.setVisible(false);
			}
		});
		btnRegister.setBounds(262, 183, 112, 38);
		frame.getContentPane().add(btnRegister);
	}
}

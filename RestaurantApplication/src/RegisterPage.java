import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JTextArea;

public class RegisterPage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextArea WarningSignalUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage window = new RegisterPage();
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
	public RegisterPage() {
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
		
		JTextPane txtUsername = new JTextPane();
		txtUsername.setText("Username");
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUsername.setEditable(false);
		txtUsername.setBackground(SystemColor.menu);
		txtUsername.setBounds(10, 55, 85, 31);
		frame.getContentPane().add(txtUsername);
		
		textField = new JTextField();
		textField.setBounds(105, 55, 259, 24);
		frame.getContentPane().add(textField);
		
		JTextPane txtPassword = new JTextPane();
		txtPassword.setText("Password");
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPassword.setEditable(false);
		txtPassword.setBackground(SystemColor.menu);
		txtPassword.setBounds(14, 97, 81, 24);
		frame.getContentPane().add(txtPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(105, 97, 259, 24);
		frame.getContentPane().add(passwordField);
		
		JTextPane txtpnRegister = new JTextPane();
		txtpnRegister.setText("Register");
		txtpnRegister.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtpnRegister.setEditable(false);
		txtpnRegister.setBackground(SystemColor.menu);
		txtpnRegister.setBounds(174, 11, 85, 33);
		frame.getContentPane().add(txtpnRegister);
		
		JButton btnRegister = new JButton("Register");

		btnRegister.setBounds(268, 187, 112, 38);
		frame.getContentPane().add(btnRegister);
		
		JTextPane txtpnConfirmpassword = new JTextPane();
		txtpnConfirmpassword.setText("Confirm Password");
		txtpnConfirmpassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnConfirmpassword.setEditable(false);
		txtpnConfirmpassword.setBackground(SystemColor.menu);
		txtpnConfirmpassword.setBounds(14, 132, 81, 48);
		frame.getContentPane().add(txtpnConfirmpassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(105, 152, 259, 24);
		frame.getContentPane().add(passwordField_1);
		
		JList list = new JList();
		list.setBackground(SystemColor.menu);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Manager", "Chef", "Bartender"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(24, 187, 154, 63);
		frame.getContentPane().add(list);
		
		WarningSignalUsername = new JTextArea();
		WarningSignalUsername.setFont(new Font("Monospaced", Font.PLAIN, 24));
		WarningSignalUsername.setForeground(SystemColor.windowText);
		WarningSignalUsername.setEditable(false);
		WarningSignalUsername.setText("***");
		WarningSignalUsername.setBackground(SystemColor.menu);
		WarningSignalUsername.setBounds(367, 54, 50, 31);
		frame.getContentPane().add(WarningSignalUsername);
		WarningSignalUsername.setColumns(10);
		WarningSignalUsername.setVisible(false);
		
		JTextPane WarningSignalPassword1 = new JTextPane();
		WarningSignalPassword1.setEditable(false);
		WarningSignalPassword1.setFont(new Font("Monospaced", Font.PLAIN, 24));
		WarningSignalPassword1.setText("***");
		WarningSignalPassword1.setBackground(SystemColor.menu);
		WarningSignalPassword1.setBounds(366, 94, 49, 31);
		frame.getContentPane().add(WarningSignalPassword1);
		WarningSignalPassword1.setVisible(false);
		
		JTextPane WarningSignalPassword2 = new JTextPane();
		WarningSignalPassword2.setEditable(false);
		WarningSignalPassword2.setText("***");
		WarningSignalPassword2.setFont(new Font("Monospaced", Font.PLAIN, 24));
		WarningSignalPassword2.setBackground(SystemColor.menu);
		WarningSignalPassword2.setBounds(366, 149, 47, 31);
		frame.getContentPane().add(WarningSignalPassword2);
		WarningSignalPassword2.setVisible(false);
		
		
		//starts as if fields are correctly written
		int fan=1; 

		
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().length()  == 0) {
					WarningSignalUsername.setVisible(true);
					int fan=0;
				}
				else
					WarningSignalUsername.setVisible(false);
				
				if(passwordField.getPassword().length == 0) {
					WarningSignalPassword1.setVisible(true);
					int fan=0;
				}
				else
					WarningSignalPassword1.setVisible(false);

				
				if(passwordField_1.getPassword().length == 0) {
					WarningSignalPassword2.setVisible(true);
					int fan=0;
				}
				else
					WarningSignalPassword2.setVisible(false);
				
				if( (passwordField_1.getPassword().length != 0) && (passwordField.getPassword().length != 0) ){
					if( passwordField_1.getPassword()==passwordField.getPassword() ) {
						// GOOD CASE
					}
				}
				
				if(fan==0) {
					//RETRY
					
				}else {
					//REGISTER
					
				}
				
			}
		});

	}
}

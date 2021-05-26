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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterPage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextArea WarningSignalUsername;
	/**
	 * @wbp.nonvisual location=232,339
	 */


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
		frame.setLocationByPlatform(true);
		frame.setBounds(100, 100, 602, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtUsername = new JTextPane();
		txtUsername.setBounds(61, 169, 85, 31);
		txtUsername.setText("Username");
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUsername.setEditable(false);
		txtUsername.setBackground(SystemColor.menu);
		frame.getContentPane().add(txtUsername);
		
		textField = new JTextField();
		textField.setBounds(158, 169, 259, 24);
		frame.getContentPane().add(textField);
		
		JTextPane txtPassword = new JTextPane();
		txtPassword.setBounds(61, 272, 81, 24);
		txtPassword.setText("Password");
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPassword.setEditable(false);
		txtPassword.setBackground(SystemColor.menu);
		frame.getContentPane().add(txtPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 272, 259, 24);
		frame.getContentPane().add(passwordField);
		
		JTextPane txtpnRegister = new JTextPane();
		txtpnRegister.setBounds(234, 56, 85, 33);
		txtpnRegister.setText("Register");
		txtpnRegister.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtpnRegister.setEditable(false);
		txtpnRegister.setBackground(SystemColor.menu);
		frame.getContentPane().add(txtpnRegister);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(442, 460, 112, 38);
		frame.getContentPane().add(btnRegister);
		
		JTextPane txtpnConfirmpassword = new JTextPane();
		txtpnConfirmpassword.setBounds(61, 320, 81, 48);
		txtpnConfirmpassword.setText("Confirm Password");
		txtpnConfirmpassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnConfirmpassword.setEditable(false);
		txtpnConfirmpassword.setBackground(SystemColor.menu);
		frame.getContentPane().add(txtpnConfirmpassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(158, 326, 259, 24);
		frame.getContentPane().add(passwordField_1);
		
		JList list = new JList();

		list.setBounds(71, 379, 71, 59);
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
		int index = list.getSelectedIndex();
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frame.getContentPane().add(list);
		
		WarningSignalUsername = new JTextArea();
		WarningSignalUsername.setBounds(427, 164, 50, 31);
		WarningSignalUsername.setFont(new Font("Monospaced", Font.PLAIN, 24));
		WarningSignalUsername.setForeground(SystemColor.windowText);
		WarningSignalUsername.setEditable(false);
		WarningSignalUsername.setText("***");
		WarningSignalUsername.setBackground(SystemColor.menu);
		frame.getContentPane().add(WarningSignalUsername);
		WarningSignalUsername.setColumns(10);
		WarningSignalUsername.setVisible(false);
		
		JTextPane WarningSignalPassword1 = new JTextPane();
		WarningSignalPassword1.setBounds(425, 268, 49, 31);
		WarningSignalPassword1.setEditable(false);
		WarningSignalPassword1.setFont(new Font("Monospaced", Font.PLAIN, 24));
		WarningSignalPassword1.setText("***");
		WarningSignalPassword1.setBackground(SystemColor.menu);
		frame.getContentPane().add(WarningSignalPassword1);
		WarningSignalPassword1.setVisible(false);
		
		JTextPane WarningSignalPassword2 = new JTextPane();
		WarningSignalPassword2.setBounds(427, 326, 47, 31);
		WarningSignalPassword2.setEditable(false);
		WarningSignalPassword2.setText("***");
		WarningSignalPassword2.setFont(new Font("Monospaced", Font.PLAIN, 24));
		WarningSignalPassword2.setBackground(SystemColor.menu);
		frame.getContentPane().add(WarningSignalPassword2);
		
		Label textField_1 = new Label();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		textField_1.setBackground(SystemColor.menu);
		textField_1.setText("NO SELECTED ROLE !!!");
		textField_1.setBounds(10, 444, 296, 37);
		textField_1.setVisible(false);
		frame.getContentPane().add(textField_1);
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
				
				if( (index <1 ) || (index>3) ) {
					int fan=0;
					textField_1.setVisible(true);
				}
				
				if( fan==1 ){
					if( passwordField_1.getPassword()==passwordField.getPassword() ) {
						// GOOD CASE ------- Register
					}
					else {
						// BAD CASE------ Passwords don't match
					}
				}
				
			}
		});

	}
}

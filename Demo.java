import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;

public class Demo {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo window = new Demo();
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
	public Demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 1237, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(306, 98, 131, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(250, 139, 112, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(250, 179, 88, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(393, 144, 112, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(393, 184, 112, 25);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UserName = textField.getText();
				String Password = textField_1.getText();
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
					String query = "Insert into login values('" + UserName + "', '" + Password + "' )";
					 java.sql.Statement sta = connection.createStatement();
					 int x = sta.executeUpdate(query);
					 if(x == 0) {
						 JOptionPane.showMessageDialog(btnNewButton, "This is already exists");
					 }else {
						 JOptionPane.showMessageDialog(btnNewButton, "Welcome," + UserName + "Your data is saved");
					 }
					connection.close();
				}catch(Exception exception) {
					exception.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(306, 226, 108, 21);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("img_1");
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/icon/front.jpg")));
		
		lblNewLabel_3.setBounds(-164, -146, 1444, 931);
		frame.getContentPane().add(lblNewLabel_3);
	}
}

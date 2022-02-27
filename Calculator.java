import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 647, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(127, 68, 130, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(482, 68, 113, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 67, 107, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Second Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(352, 66, 120, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n,m,c;
				n=Integer.parseInt(textField.getText());
				m=Integer.parseInt(textField_1.getText());
				c= n+m;
				lblNewLabel_2.setText(Integer.toString(c));
			}
		});
		btnNewButton.setBounds(10, 164, 107, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Substraction");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n,m,c;
				n=Integer.parseInt(textField.getText());
				m=Integer.parseInt(textField_1.getText());
				c= n-m;
				lblNewLabel_2.setText(Integer.toString(c));
			}
		});
		btnNewButton_1.setBounds(10, 216, 107, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("multiplication");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n,m,c;
				n=Integer.parseInt(textField.getText());
				m=Integer.parseInt(textField_1.getText());
				c= n*m;
				lblNewLabel_2.setText(Integer.toString(c));
			}
		});
		btnNewButton_2.setBounds(10, 269, 107, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Divison");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n,m,c;
				n=Integer.parseInt(textField.getText());
				m=Integer.parseInt(textField_1.getText());
				c= n/m;
				lblNewLabel_2.setText(Integer.toString(c));
			}
		});
		btnNewButton_3.setBounds(10, 315, 107, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		lblNewLabel_2 = new JLabel("Your Answer");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(395, 234, 120, 21);
		frame.getContentPane().add(lblNewLabel_2);
	}

}

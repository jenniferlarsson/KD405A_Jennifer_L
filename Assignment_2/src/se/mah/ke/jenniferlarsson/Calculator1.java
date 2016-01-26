package se.mah.ke.jenniferlarsson;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator1 frame = new Calculator1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		calculator myCalculator = new calculator();
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("7");
			myCalculator.numberButtonPressed(7);
			}
		});
		button.setBounds(19, 116, 73, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("8");
			myCalculator.numberButtonPressed(8);
			}
		});
		button_1.setBounds(93, 116, 73, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("9");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("9");
			myCalculator.numberButtonPressed(9);
			}
		});
		button_2.setBounds(169, 116, 73, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("6");
			myCalculator.numberButtonPressed(6);
			}
		});
		button_3.setBounds(19, 157, 73, 29);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("5");
			myCalculator.numberButtonPressed(5);
			}
		});
		button_4.setBounds(93, 157, 73, 29);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("4");
			myCalculator.numberButtonPressed(4);
			}
		});
		button_5.setBounds(169, 157, 73, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("3");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("3");
			myCalculator.numberButtonPressed(3);
			}
		});
		button_6.setBounds(19, 201, 73, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("2");
			myCalculator.numberButtonPressed(2);
			}
		});
		button_7.setBounds(93, 201, 73, 29);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("1");
			myCalculator.numberButtonPressed(1);
			}
		});
		button_8.setBounds(169, 198, 73, 29);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				myCalculator.numberButtonPressed(0);
				
			}
		});
		button_9.setBounds(19, 243, 73, 29);
		contentPane.add(button_9);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				myCalculator.clear();
			}
		});
		btnC.setBounds(169, 242, 73, 29);
		contentPane.add(btnC);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("x");
			myCalculator.mult();
			}
		});
		btnX.setBounds(249, 116, 73, 29);
		contentPane.add(btnX);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("-");
				myCalculator.minus();
			}
		});
		button_11.setBounds(249, 157, 73, 29);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("+");
			myCalculator.plus();
			}
		});
		button_12.setBounds(249, 201, 73, 29);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("=");
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		button_13.setBounds(249, 243, 73, 29);
		contentPane.add(button_13);
		
		textField = new JTextField();
		textField.setBounds(19, 6, 303, 96);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

package se.mah.ke.jenniferlarsson;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumanDogsGUI extends JFrame {

	private JPanel contentPane;
	private JTextField humanName;
	private JTextField dogName;
	private Human myHuman = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanDogsGUI frame = new HumanDogsGUI();
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
	public HumanDogsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Info");
		lblNewLabel.setBounds(47, 177, 61, 16);
		contentPane.add(lblNewLabel);
		
		JTextArea errorMessage = new JTextArea();
		errorMessage.setBounds(47, 294, 370, 66);
		contentPane.add(errorMessage);
		
		JLabel lblNewLabel_1 = new JLabel("Error Message");
		lblNewLabel_1.setBounds(47, 273, 130, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Humans and Dogs");
		lblNewLabel_2.setBounds(178, 26, 145, 16);
		contentPane.add(lblNewLabel_2);
		
		JTextArea infoArea = new JTextArea();
		infoArea.setBounds(47, 206, 370, 55);
		contentPane.add(infoArea);
		
		JButton newHumanButton = new JButton("New Human");
		newHumanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(humanName.getText().length() >= Constants.MIN_LETTER){
						myHuman = new Human(humanName.getText());
						errorMessage.setText("");
					}else {
						errorMessage.setText("Namnet måste ha minst tre bokstäver");
					}
					
				}
			
		});
		newHumanButton.setBounds(337, 82, 117, 29);
		contentPane.add(newHumanButton);
		
		JButton buyDogButton = new JButton("Buy Dog ");
		buyDogButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (myHuman != null) {
					myHuman.buyDog(new Dog(dogName.getText()));
				} else {
					errorMessage.setText("Hunden måste ha en ägare!");
				}
			}
		});
		buyDogButton.setBounds(337, 123, 117, 29);
		contentPane.add(buyDogButton);
		
		JButton printInfoButton = new JButton("Print Info");
		printInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoArea.setText(myHuman.getInfo());
			}
		});
		printInfoButton.setBounds(337, 164, 117, 29);
		contentPane.add(printInfoButton);
		
		humanName = new JTextField();
		humanName.setBounds(47, 82, 130, 26);
		contentPane.add(humanName);
		humanName.setColumns(10);
		
		dogName = new JTextField();
		dogName.setColumns(10);
		dogName.setBounds(47, 123, 130, 26);
		contentPane.add(dogName);
		

	}
}

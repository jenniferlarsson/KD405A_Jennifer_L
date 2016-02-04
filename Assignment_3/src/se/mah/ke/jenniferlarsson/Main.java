package se.mah.ke.jenniferlarsson;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private ArrayList<Bike> bikes = new ArrayList<Bike>();
	private BikeStore bikeStore = new BikeStore();
	private JTextField textFieldColor;
	private JTextField textFieldSize;
	private JTextField textFieldPrice;
	private JButton btnAdd;
	private JTextField txtColor;
	private JTextField txtSize;
	private JTextField txtPrice;
	private JTextArea allBikesTextArea;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		allBikesTextArea = new JTextArea();
		allBikesTextArea.setEditable(false);
		scrollPane.setViewportView(allBikesTextArea);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		textFieldColor = new JTextField();
		textFieldColor.setBounds(82, 6, 130, 26);
		panel.add(textFieldColor);
		textFieldColor.setColumns(10);
		
		textFieldSize = new JTextField();
		textFieldSize.setBounds(82, 36, 130, 26);
		panel.add(textFieldSize);
		textFieldSize.setColumns(10);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setBounds(82, 69, 130, 26);
		panel.add(textFieldPrice);
		textFieldPrice.setColumns(10);
		textFieldPrice.setText("0");

		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//bikestore.addBike(textfält1.value(), size, price)
				bikeStore.addBike(textFieldColor.getText(), Integer.parseInt(textFieldSize.getText()), Integer.parseInt(textFieldPrice.getText()));
				//setTextInStoraFältet(bikeStore.getAllBikes())
				allBikesTextArea.setText(bikeStore.getAllBikes());
				//småTextfält.clear()
				textFieldColor.setText("");
				textFieldSize.setText("");
				textFieldPrice.setText("");
			}
		});
		btnAdd.setBounds(82, 185, 75, 29);
		btnAdd.setVerticalAlignment(SwingConstants.BOTTOM);
		panel.add(btnAdd);
		
		txtColor = new JTextField();
		txtColor.setEditable(false);
		txtColor.setText("Color");
		txtColor.setBounds(0, 6, 70, 26);
		panel.add(txtColor);
		txtColor.setColumns(10);
		
		txtSize = new JTextField();
		txtSize.setText("Size");
		txtSize.setEditable(false);
		txtSize.setBounds(0, 36, 70, 26);
		panel.add(txtSize);
		txtSize.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setEditable(false);
		txtPrice.setText("Price");
		txtPrice.setBounds(0, 69, 70, 26);
		panel.add(txtPrice);
		txtPrice.setColumns(10);
		
		
		bikes.add(new Bike("blue", 10, 200));
		bikes.add(new Bike("red", 20, 300));
		bikes.add(new Bike("yellow", 12, 400));
		bikes.add(new Bike("green", 9, 500));
		bikes.add(new Bike("black", 15, 600));
		bikes.add(new Bike("white", 27, 700));
		bikes.add(new Bike("pink", 18, 800));
		bikes.add(new Bike("orange", 22, 900));
		bikes.add(new Bike("violet", 24, 200));
		bikes.add(new Bike("cerise", 25, 300));
		
		for (int i = 0; i < bikes.size(); i ++) {
			String printString = "bike " + (i + 1) + " är storlek " + bikes.get(i).getSize() + " och är färgen " + bikes.get(i).getColor() + " och kostar " + bikes.get(i).getPrice() +  "\n";
			System.out.println(printString);
		}	
	}

}

package se.mah.ke.jenniferlarsson;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private House[] myHouses;
	private ArrayList<House> neighborhood = new ArrayList<House>();



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);

		scrollPane.setViewportView(textArea);
		
		House house1 = new House(1988, 190);
		House house2 = new House(1991, 170);
		House house3 = new House(2004, 700);
		
		String house1string = "ett hus som är " + house1.getSize() + " kvadratmeter stort och byggdes " + house1.getYearBuilt() + "\n";
		String house2string = "ett hus som är " + house2.getSize() + " kvadratmeter stort och byggdes " + house2.getYearBuilt() + "\n";
		String house3string = "ett hus som är " + house3.getSize() + " kvadratmeter stort och byggdes " + house3.getYearBuilt() + "\n";
		
		textArea.append("uppgift 1.2 \n");
		textArea.append(house1string);
		textArea.append(house2string);
		textArea.append(house3string);
		
		System.out.println(house1string);
		System.out.println(house2string);
		System.out.println(house3string);

		myHouses = new House[10];
		 		
		myHouses[0] = new House(2014,53);
		myHouses[1] = new House(1997,130);
		myHouses[2] = new House(1830,200);
		myHouses[3] = new House(1910,67);
		myHouses[4] = new House(2000,150);
		myHouses[5] = new House(2014,120);
		myHouses[6] = new House(1880,220);
		myHouses[7] = new House(1900,99);
		myHouses[8] = new House(1960,400);
		myHouses[9] = new House(2012,137);
		
		String printString;
		textArea.append("uppgift 1.3 \n");

		
		for(int i = 0; i < 10; i++){
			printString = "ett hus som är " + myHouses[i].getSize() + " kvadratmeter stort och byggdes " + myHouses[i].getYearBuilt() + "\n";
			System.out.println(printString);
			textArea.append(printString);
 		}
		
		
		textArea.append("uppgift 1.4 \n");

		Random rand = new Random();

		for(int i = 0; i < 100; i++){
			int size = rand.nextInt((1000 - 10) + 1) + 10;
			int year = rand.nextInt((2015 - 1800) + 1) + 1800;
			
			neighborhood.add(new House(year, size));
		}
		
		for(House hus: neighborhood){
			printString = "ett hus som är " + hus.getSize() + " kvadratmeter stort och byggdes " + hus.getYearBuilt() + "\n";
			System.out.println(printString);
			textArea.append(printString);
		}
	}
}

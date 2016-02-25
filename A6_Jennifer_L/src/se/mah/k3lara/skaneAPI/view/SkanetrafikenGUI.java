package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class SkanetrafikenGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private JTextArea resultsArea;
	private JTextField textFieldFrom;
	private JTextField textFieldTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkanetrafikenGUI frame = new SkanetrafikenGUI();
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
	public SkanetrafikenGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		searchField = new JTextField();
		searchField.setBounds(91, 6, 130, 26);
		panel.add(searchField);
		searchField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 136, 371, 185);
		panel.add(scrollPane);
		
		resultsArea = new JTextArea();
		scrollPane.setViewportView(resultsArea);
				
		JButton searchButton = new JButton("Sök");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultsArea.setText("searching...");
				
				new GetStationsThread().start();
			}
		});
		searchButton.setBounds(226, 5, 117, 29);
		panel.add(searchButton);
		
		textFieldFrom = new JTextField();
		textFieldFrom.setBounds(91, 60, 130, 26);
		panel.add(textFieldFrom);
		textFieldFrom.setColumns(10);
		
		textFieldTo = new JTextField();
		textFieldTo.setBounds(91, 98, 130, 26);
		panel.add(textFieldTo);
		textFieldTo.setColumns(10);
		
		JButton btnSearchJourney = new JButton("Sök Resa");
		btnSearchJourney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultsArea.setText("searching...");

				new GetJourneysThread().start();
			}
		});
		btnSearchJourney.setBounds(233, 98, 117, 29);
		panel.add(btnSearchJourney);
	}
	
	private class GetStationsThread extends Thread {
		
		@Override
		public void run(){
			String searchString = searchField.getText();
			ArrayList<Station> searchStations = new ArrayList<Station>(); 
			searchStations.addAll(Parser.getStationsFromURL(searchString));
			resultsArea.setText("");
			for (Station s: searchStations){
				resultsArea.append(s.getStationName() + " number: " + s.getStationNbr() + " lat. " + s.getLatitude() + " long: " + s.getLongitude() + "\n");
			}
		}
		
	}
	
	private class GetJourneysThread extends Thread {
		
		@Override
		public void run(){
		
			String from = textFieldFrom.getText();
			String to = textFieldTo.getText();
			String searchURL = Constants.getURL(from, to, 1);
			
			Journeys journeys = Parser.getJourneys(searchURL);
			resultsArea.setText("");
			for (Journey journey : journeys.getJourneys()) {
				resultsArea.append("Journey: \n");
				resultsArea.append(journey.getStartStation()+ " - " + journey.getEndStation().toString() + "\n");
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
				resultsArea.append(" Departs " + time +" that is in "+journey.getTimeToDeparture() + " minutes. And it is "+journey.getDepTimeDeviation() +" min late \n");
				resultsArea.append("The Line is: " + journey.getLineOnFirstJourney() + " and it's a " + journey.getLineTypeName() + "\n");
				resultsArea.append("There is " + journey.getNoOfChanges() + " changes on your trip through " + journey.getNoOfZones() + " zones. \n");
				resultsArea.append("Your trip will take " + journey.getTravelMinutes() + " minutes. It's will arrive about " + journey.getArrTimeDeviation() + " minutes late. \n");
			}
		}
	}
	
}

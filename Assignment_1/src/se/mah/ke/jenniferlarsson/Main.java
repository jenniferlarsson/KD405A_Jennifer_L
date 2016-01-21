package se.mah.ke.jenniferlarsson;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtBertNilsson;
	private JTextField textField;
	private JTextField txtMunkhttegatan;
	private JTextField textField_1;
	private JTextField txtBerraalltomfiskse;
	private JTextField txtBerrapng;

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
	  DefaultTableModel model = new DefaultTableModel(new Object[][] {
	      { "Bert Nilsson" }, { "Jennifer Larsson" }, { "Lars Jennifersson" },
	      { "Berit Bengtsson" }, { "Mona-Lisa Målarberg" }, {"Johanno Knatsson"} },
	      new Object[] { "Medlemmar"});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 375);
		setBounds(100, 100, 655, 394);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		menuBar.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("/Users/jela/Desktop/friskis och svettis.jpg"));
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmPrint = new JMenuItem("Skriv Ut");
		mnArkiv.add(mntmPrint);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny Medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta Medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hjälp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hjälp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om Programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		table = new JTable(model);
		table.setToolTipText("Alla Medlemmar");
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNamn = new JLabel("Namn");
		gbc_lblNamn.gridx = 1;
		lblNamn.setBounds(0, 0, 0, 0);
		panel.add(lblNamn);
		
		txtBertNilsson = new JTextField();
		txtBertNilsson.setBounds(0, 0, 0, 0);
		txtBertNilsson.setText("Bert Nilsson");
		panel.add(txtBertNilsson);
		txtBertNilsson.setColumns(10);
		
		JLabel lblPersonnr = new JLabel("Personnr");
		lblPersonnr.setBounds(34, 0, 55, 13);
		panel.add(lblPersonnr);
		
		textField = new JTextField();
		textField.setBounds(138, 0, 146, 18);
		textField.setText("7212231653");
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(34, 28, 43, 16);
		panel.add(lblAdress);
		
		txtMunkhttegatan = new JTextField();
		txtMunkhttegatan.setBounds(138, 23, 146, 26);
		txtMunkhttegatan.setText("Munkhättegatan 32");
		panel.add(txtMunkhttegatan);
		txtMunkhttegatan.setColumns(10);
		
		JLabel lblTelefonnummer = new JLabel("Telefonnummer");
		lblTelefonnummer.setBounds(34, 59, 99, 16);
		panel.add(lblTelefonnummer);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 54, 146, 26);
		textField_1.setText("040-231213");
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(34, 90, 34, 16);
		panel.add(lblEmail);
		
		txtBerraalltomfiskse = new JTextField();
		txtBerraalltomfiskse.setBounds(138, 85, 146, 26);
		txtBerraalltomfiskse.setText("berra@alltomfisk.se");
		panel.add(txtBerraalltomfiskse);
		txtBerraalltomfiskse.setColumns(10);
		
		JLabel lblBild = new JLabel("Bild");
		lblBild.setBounds(34, 121, 23, 16);
		panel.add(lblBild);
		
		txtBerrapng = new JTextField();
		txtBerrapng.setBounds(138, 116, 146, 26);
		txtBerrapng.setText("berra.png");
		panel.add(txtBerrapng);
		txtBerrapng.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(172, 199, 78, 37);
		panel.add(btnSpara);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/jela/Desktop/berrabild.jpg"));
		lblNewLabel.setBounds(27, 149, 84, 95);
		panel.add(lblNewLabel);
	}
}

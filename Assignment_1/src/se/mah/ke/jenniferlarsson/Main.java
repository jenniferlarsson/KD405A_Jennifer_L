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
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
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
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{34, 99, 146, 0};
		gbl_panel.rowHeights = new int[]{26, 26, 26, 26, 26, 26, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNamn = new JLabel("Namn");
		GridBagConstraints gbc_lblNamn = new GridBagConstraints();
		gbc_lblNamn.anchor = GridBagConstraints.WEST;
		gbc_lblNamn.insets = new Insets(0, 0, 5, 5);
		gbc_lblNamn.gridx = 1;
		gbc_lblNamn.gridy = 0;
		panel.add(lblNamn, gbc_lblNamn);
		
		txtBertNilsson = new JTextField();
		txtBertNilsson.setText("Bert Nilsson");
		GridBagConstraints gbc_txtBertNilsson = new GridBagConstraints();
		gbc_txtBertNilsson.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtBertNilsson.insets = new Insets(0, 0, 5, 0);
		gbc_txtBertNilsson.gridx = 2;
		gbc_txtBertNilsson.gridy = 0;
		panel.add(txtBertNilsson, gbc_txtBertNilsson);
		txtBertNilsson.setColumns(10);
		
		JLabel lblPersonnr = new JLabel("Personnr");
		GridBagConstraints gbc_lblPersonnr = new GridBagConstraints();
		gbc_lblPersonnr.anchor = GridBagConstraints.WEST;
		gbc_lblPersonnr.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonnr.gridx = 1;
		gbc_lblPersonnr.gridy = 1;
		panel.add(lblPersonnr, gbc_lblPersonnr);
		
		textField = new JTextField();
		textField.setText("7212231653");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblAdress = new JLabel("Adress");
		GridBagConstraints gbc_lblAdress = new GridBagConstraints();
		gbc_lblAdress.anchor = GridBagConstraints.WEST;
		gbc_lblAdress.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdress.gridx = 1;
		gbc_lblAdress.gridy = 2;
		panel.add(lblAdress, gbc_lblAdress);
		
		txtMunkhttegatan = new JTextField();
		txtMunkhttegatan.setText("Munkhättegatan 32");
		GridBagConstraints gbc_txtMunkhttegatan = new GridBagConstraints();
		gbc_txtMunkhttegatan.anchor = GridBagConstraints.NORTH;
		gbc_txtMunkhttegatan.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMunkhttegatan.insets = new Insets(0, 0, 5, 0);
		gbc_txtMunkhttegatan.gridx = 2;
		gbc_txtMunkhttegatan.gridy = 2;
		panel.add(txtMunkhttegatan, gbc_txtMunkhttegatan);
		txtMunkhttegatan.setColumns(10);
		
		JLabel lblTelefonnummer = new JLabel("Telefonnummer");
		GridBagConstraints gbc_lblTelefonnummer = new GridBagConstraints();
		gbc_lblTelefonnummer.anchor = GridBagConstraints.WEST;
		gbc_lblTelefonnummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefonnummer.gridx = 1;
		gbc_lblTelefonnummer.gridy = 3;
		panel.add(lblTelefonnummer, gbc_lblTelefonnummer);
		
		textField_1 = new JTextField();
		textField_1.setText("040-231213");
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 3;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 4;
		panel.add(lblEmail, gbc_lblEmail);
		
		txtBerraalltomfiskse = new JTextField();
		txtBerraalltomfiskse.setText("berra@alltomfisk.se");
		GridBagConstraints gbc_txtBerraalltomfiskse = new GridBagConstraints();
		gbc_txtBerraalltomfiskse.anchor = GridBagConstraints.NORTH;
		gbc_txtBerraalltomfiskse.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBerraalltomfiskse.insets = new Insets(0, 0, 5, 0);
		gbc_txtBerraalltomfiskse.gridx = 2;
		gbc_txtBerraalltomfiskse.gridy = 4;
		panel.add(txtBerraalltomfiskse, gbc_txtBerraalltomfiskse);
		txtBerraalltomfiskse.setColumns(10);
		
		JLabel lblBild = new JLabel("Bild");
		GridBagConstraints gbc_lblBild = new GridBagConstraints();
		gbc_lblBild.anchor = GridBagConstraints.WEST;
		gbc_lblBild.insets = new Insets(0, 0, 5, 5);
		gbc_lblBild.gridx = 1;
		gbc_lblBild.gridy = 5;
		panel.add(lblBild, gbc_lblBild);
		
		txtBerrapng = new JTextField();
		txtBerrapng.setText("berra.png");
		GridBagConstraints gbc_txtBerrapng = new GridBagConstraints();
		gbc_txtBerrapng.insets = new Insets(0, 0, 5, 0);
		gbc_txtBerrapng.anchor = GridBagConstraints.NORTH;
		gbc_txtBerrapng.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBerrapng.gridx = 2;
		gbc_txtBerrapng.gridy = 5;
		panel.add(txtBerrapng, gbc_txtBerrapng);
		txtBerrapng.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		GridBagConstraints gbc_btnSpara = new GridBagConstraints();
		gbc_btnSpara.gridx = 2;
		gbc_btnSpara.gridy = 9;
		panel.add(btnSpara, gbc_btnSpara);
	}

}

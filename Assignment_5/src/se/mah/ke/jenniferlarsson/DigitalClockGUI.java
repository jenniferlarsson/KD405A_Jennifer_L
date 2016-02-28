package se.mah.ke.jenniferlarsson;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	
	private ClockLogic clockLogic;
	private JTextField textFieldMinutes;
	private JTextField txtFieldHour;
	private JLabel lblCurrentTime = new JLabel("Time");
	private JLabel lblAlarmTime = new JLabel("No alarm set");
	private JLabel lblNewLabel = new JLabel("");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DigitalClockGUI.class.getResource("/resources/clocklogic.png")));
		setTitle("Digital clock with alarm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		clockLogic= new ClockLogic(this);
		
		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hour = Integer.parseInt(txtFieldHour.getText());
				int minutes = Integer.parseInt(textFieldMinutes.getText());
				clockLogic.setAlarm(hour, minutes);
				lblAlarmTime.setText("Alarm at: " + hour + ":" + minutes);
				
			}
		});
		btnSetAlarm.setBounds(248, 221, 117, 29);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clockLogic.clearAlarm();
				lblAlarmTime.setText(" No alarm");
			}
		});
		btnClearAlarm.setBounds(377, 221, 117, 29);
		contentPane.add(btnClearAlarm);
		
		textFieldMinutes = new JTextField();
		textFieldMinutes.setBounds(183, 220, 60, 29);
		contentPane.add(textFieldMinutes);
		textFieldMinutes.setColumns(10);
		
		txtFieldHour = new JTextField();
		txtFieldHour.setColumns(10);
		txtFieldHour.setBounds(43, 220, 60, 29);
		contentPane.add(txtFieldHour);
		
		lblCurrentTime.setBounds(393, 19, 101, 36);
		contentPane.add(lblCurrentTime);
		
		lblAlarmTime.setBounds(393, 77, 101, 36);
		contentPane.add(lblAlarmTime);
		
		JLabel lblNewLabel_1 = new JLabel("Hour");
		lblNewLabel_1.setBounds(6, 226, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setBounds(133, 226, 61, 16);
		contentPane.add(lblMinutes);
		
		lblNewLabel.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/resources/1363846.jpg")));
		lblNewLabel.setBounds(0, 0, 519, 277);
		contentPane.add(lblNewLabel);
	}
	public void setTimeOnLabel(String time) {
		lblCurrentTime.setText(time);
	}
	
	public void activateAlarm (boolean activate){
		if(activate){
			Toolkit.getDefaultToolkit().beep();
			lblNewLabel.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/resources/vulkan.jpg")));

		} else {
			lblNewLabel.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/resources/1363846.jpg")));
		}
		
	}
}



import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main extends JFrame {

	private JPanel contentPane;
	private ArrayList<Animal> animals = new ArrayList<Animal>();

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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		Cat cat = new Cat("Lynx Lynx", 2, 7);
		cat.setFriendlyName("Q");
		
		animals.add(new Dog("Canis latrans", 3, true, "Hugo"));
		animals.add(new Dog("Canis latrans", 5, false, "Bertil"));
		animals.add(new Dog("Canis latrans", 8, false));
		animals.add(new Dog("Canis latrans", 10, true));
		animals.add(new Dog("Canis latrans", 7, false, "Bettan"));
		animals.add(cat);
		animals.add(new Cat("Lynx Lynx", 2, 7));
		animals.add(new Cat("Lynx Lynx", 5, 8));
		animals.add(new Cat("Lynx Lynx", 8, 10));
		animals.add(new Cat("Lynx Lynx", 9, 11));
		animals.add(new Snake("Python regius",true));
		animals.add(new Snake("Python regius",false));
		animals.add(new Snake("Python regius",false));
		animals.add(new Snake("Python regius",true));
		
		
		
		for (int i = 0; i < animals.size(); i ++) {
			System.out.println(animals.get(i).getInfo());
			textArea.append(animals.get(i).getInfo());
			textArea.append("\n");
		}
	}

}

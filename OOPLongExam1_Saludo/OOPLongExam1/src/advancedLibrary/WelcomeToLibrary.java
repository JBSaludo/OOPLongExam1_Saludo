package advancedLibrary;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Defines the WelcometoLibrary class
public class WelcomeToLibrary extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	//Main method
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Creates a new WelcomeToLibrary object and display it
					WelcomeToLibrary messageFrame = new WelcomeToLibrary();
					messageFrame.setVisible(true);
					messageFrame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//Constructor for the WelcomeToLibrary class
	public WelcomeToLibrary() {
		//Sets the properties of the JFrame
		setResizable(false);
		setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 242);
		//Creates a new JPanel and set its properties
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Creates a new JPanel and set its properties
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 203);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Creates a new JLabel and set its properties
		JLabel messageLabel = new JLabel("Welcome to Library System!");
		messageLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		messageLabel.setBounds(80, 70, 331, 34);
		panel.add(messageLabel);
		
		//Creates a new JButton and set its properties
		JButton backButton = new JButton("Continue");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn LogIn = new LogIn();
				LogIn.setVisible(true);
				dispose();
			}
		});
		
		//Sets the position of the backButton
		backButton.setBounds(170, 141, 89, 23);
		panel.add(backButton);
		
	}
}
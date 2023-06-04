package advancedLibrary;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import personalPortfolio.MyWorksPage;

//Defines the LogIn class
public class LogIn extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	//Main method
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Creates a new instance of the LogIn class and set it to visible
					LogIn ligInFrame = new LogIn();
					ligInFrame.setVisible(true);
					ligInFrame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//Constructor for the LogIn class
	public LogIn() {
		//Sets some basic properties of the frame
		setResizable(false);
		setTitle("Library Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		//Creates a new JPanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Adds a label to the panel
		JLabel libraryManagementLabel = new JLabel("Library Management - JavaTpoint");
		libraryManagementLabel.setForeground(new Color(128, 128, 128));
		libraryManagementLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		libraryManagementLabel.setBounds(66, 54, 317, 49);
		panel.add(libraryManagementLabel);
		
		//Adds a button for the admin log-in to the panel
		JButton adminLogInButton = new JButton("Admin Log-in");
		adminLogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogIn adLogIn = new AdminLogIn(); 
				adLogIn.setVisible(true);
				dispose();
				
			}
		});
		
		//Adds a button for the librarian log-in to the panel
		adminLogInButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		adminLogInButton.setBounds(151, 113, 122, 49);
		panel.add(adminLogInButton);
		
		JButton librarianLogInButton = new JButton("Librarian Log-in");
		librarianLogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Creates a new instance of the LibrarianLogIn class and set it to visible, then dispose of this frame
				LibrarianLogIn libLogIn = new LibrarianLogIn();
				libLogIn.setVisible(true);
				dispose();
			}
		});
		
		//Sets the font style, size, and position of the panel
		librarianLogInButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		librarianLogInButton.setBounds(151, 181, 122, 49);
		panel.add(librarianLogInButton);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				MyWorksPage MyWorksPage = new MyWorksPage();
  				MyWorksPage.setVisible(true);
  				dispose();
  				}
  			});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(339, 10, 85, 21);
		panel.add(btnNewButton);
		
	}
}
package advancedLibrary;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//AdminLogin class inherits from the JFrame class and serves as the main frame for the admin login screen
public class AdminLogIn extends JFrame {
	
	//Declares the class variables
	private JPanel contentPane;
	private JTextField usernameTextField;
	private JPasswordField adminPasswordField;

	/**
	 * Launch the application.
	 */
	//This is the main method that is executed when the program is launched
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Instance of the AdminLogIn class is made, and its visibility is set to true
					AdminLogIn adminLogInFrame = new AdminLogIn();
					adminLogInFrame.setVisible(true);
					adminLogInFrame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//This is the constructor for the AdminLogIn class, which creates and initializes the GUI components
	public AdminLogIn() {
		setResizable(false);
		setTitle("Admin Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Panel to hold the GUI components
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Creates a label for the title of the page and set its properties
		JLabel adminLogInTitleLabel = new JLabel("Admin Login");
		adminLogInTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		adminLogInTitleLabel.setBounds(115, 31, 210, 48);
		panel.add(adminLogInTitleLabel);
		
		//Creates labels for the username and password fields and set their properties
		JLabel adminUsernameLabel = new JLabel("Username:");
		adminUsernameLabel.setBounds(75, 106, 68, 14);
		panel.add(adminUsernameLabel);
		
		JLabel adminPasswordLabel_1 = new JLabel("Password:");
		adminPasswordLabel_1.setBounds(75, 133, 68, 14);
		panel.add(adminPasswordLabel_1);
		
		//Creates a text field for the username and set its properties
		usernameTextField = new JTextField();
		usernameTextField.setText("");
		usernameTextField.setBounds(139, 103, 215, 20);
		panel.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		adminPasswordField = new JPasswordField();
		adminPasswordField.setEchoChar('*');
		adminPasswordField.setBounds(139, 131, 215, 20);
		panel.add(adminPasswordField);
		
		//Creates a back button to return to the previous page and set its properties
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn LogIn = new LogIn();
				LogIn.setVisible(true);
				dispose();
			}
		});
		
		//Sets the size and position of the backButton button and adding it to the panel
		backButton.setBounds(100, 204, 89, 23);
		panel.add(backButton);
		
		//Creates a logIn button and defining its action listener to handle user input
		JButton logInButton = new JButton("Log-in");
		logInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Retrieves the username and password from their respective text fields
				String adminUser = usernameTextField.getText();
				String adminPassword = adminPasswordField.getText();
				
				//Checks if the username and password match any of the valid admin credentials
				if(adminUser.equals("Admin_01") && adminPassword.equals("AdminOne") || 
				   adminUser.equals("Admin_02") && adminPassword.equals("AdminTwo") || 
				   adminUser.equals("Admin_03") && adminPassword.equals("AdminThree")) 
				{
					//Displays a success message and navigating to the welcome page if the login was successful
					int success = JOptionPane.showConfirmDialog(null,"SUCCESSFULLY LOGIN","", JOptionPane.OK_CANCEL_OPTION);
					if(success == JOptionPane.OK_OPTION) {
						WelcomeToLibrary welcomeMessage = new WelcomeToLibrary();
						welcomeMessage.setVisible(true);
						dispose();
					}
				}
				//Checks if the username is incorrect
				else if(!(adminUser.equals("Admin_01")) && adminPassword.equals("AdminOne") ||
						!(adminUser.equals("Admin_02")) && adminPassword.equals("AdminTwo") ||
						!(adminUser.equals("Admin_03")) && adminPassword.equals("AdminThree")) 
				{
					//Displays an error message and navigating back to the login page if the username is incorrect
					int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME INCORRECT","", JOptionPane.CLOSED_OPTION);
					if(Incorrect == JOptionPane.OK_OPTION) {
						AdminLogIn adLogIn = new AdminLogIn(); 
						adLogIn.setVisible(true);
						dispose();
					}
				}
				// Checks if the password is incorrect
				else if(adminUser.equals("Admin_01") && !(adminPassword.equals("AdminOne")) ||
						adminUser.equals("Admin_02") && !(adminPassword.equals("AdminTwo")) ||
						adminUser.equals("Admin_03") && !(adminPassword.equals("AdminThree"))) 
				{
					//Displays an error message and navigating back to the login page if the password is incorrect
					int Incorrect = JOptionPane.showConfirmDialog(null,"INCORRECT PASSWORD","", JOptionPane.CLOSED_OPTION);
					if(Incorrect == JOptionPane.OK_OPTION) {
						AdminLogIn adLogIn = new AdminLogIn(); 
						adLogIn.setVisible(true);
						dispose();
					}
				}
				//Checks if both the username and password are incorrect
				else if(!(adminUser.equals("Admin_01")) && !(adminPassword.equals("AdminOne")) ||
						!(adminUser.equals("Admin_02")) && !(adminPassword.equals("AdminTwo")) ||
						!(adminUser.equals("Admin_03")) && !(adminPassword.equals("AdminThree"))) 
				{
					//Displays an error message and navigating back to the login page if both the username and password are incorrect
					int Incorrect = JOptionPane.showConfirmDialog(null,"INCORRECT USERNAME and PASSWORD","", JOptionPane.CLOSED_OPTION);
					if(Incorrect == JOptionPane.OK_OPTION) {
						AdminLogIn adLogIn = new AdminLogIn(); 
						adLogIn.setVisible(true);
						dispose();
						
					}
				}
			}
		});
		
		//Sets the size and position of the logInButton
		logInButton.setBounds(236, 204, 89, 23);
		panel.add(logInButton);
		
	}
}

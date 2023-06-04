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

public class LibrarianLogIn extends JFrame {
	
	private JPanel contentPane;
	private JTextField librarianUsernameTextField;
	private JPasswordField librarianPasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogIn frame = new LibrarianLogIn();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LibrarianLogIn() {
		setResizable(false);
		setTitle("Librarian Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel librarianTitleLabel = new JLabel("Librarian Login");
		librarianTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		librarianTitleLabel.setBounds(100, 37, 247, 37);
		panel.add(librarianTitleLabel);
		
		JLabel librarianUsernameLabel = new JLabel("Username:");
		librarianUsernameLabel.setBounds(74, 105, 75, 14);
		panel.add(librarianUsernameLabel);
		
		JLabel librarianPasswordLabel = new JLabel("Password:");
		librarianPasswordLabel.setBounds(74, 141, 75, 14);
		panel.add(librarianPasswordLabel);
		
		librarianUsernameTextField = new JTextField();
		librarianUsernameTextField.setText("Enter your Username.");
		librarianUsernameTextField.setBounds(147, 102, 213, 20);
		panel.add(librarianUsernameTextField);
		librarianUsernameTextField.setColumns(10);
		
		librarianPasswordField = new JPasswordField();
		librarianPasswordField.setEchoChar('*');
		librarianPasswordField.setBounds(147, 138, 213, 20);
		panel.add(librarianPasswordField);
		
		JButton librarianBackButton = new JButton("Back");
		librarianBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn LogIn = new LogIn();
				LogIn.setVisible(true);
				dispose();
			}
		});
		
		librarianBackButton.setBounds(88, 209, 89, 23);
		panel.add(librarianBackButton);
		
		JButton librarianLogInButton = new JButton("Log-in");
		librarianLogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String libUsername = librarianUsernameTextField.getText();
				String libPassword = librarianPasswordField.getText();
				
				if(libUsername.equals("Librarian_01") && libPassword.equals("LibOne") ||
			       libUsername.equals("Librarian_02") && libPassword.equals("LibTwo") ||
			       libUsername.equals("Librarian_03") && libPassword.equals("LibThree")) 
				{
					
						int success = JOptionPane.showConfirmDialog(null,"SUCCESSFULLY LOGIN","", JOptionPane.OK_CANCEL_OPTION);
						if(success == JOptionPane.OK_OPTION) {
							BookList bookList = new BookList();
							bookList.setVisible(true);
							dispose();
						}		
						
				}
				else if(!(libUsername.equals("Librarian_01")) && libPassword.equals("LibOne") ||
					    !(libUsername.equals("Librarian_02")) && libPassword.equals("LibTwo") ||
					    !(libUsername.equals("Librarian_03")) && libPassword.equals("LibThree")) 
				{
					    
							int Incorrect = JOptionPane.showConfirmDialog(null,"USERNAME INCORRECT","", JOptionPane.CLOSED_OPTION);
							if(Incorrect == JOptionPane.OK_OPTION) {
								LibrarianLogIn libLogIn = new LibrarianLogIn();
								libLogIn.setVisible(true);
								dispose();
							}
				}
				else if(libUsername.equals("Librarian_01") && !(libPassword.equals("LibOne")) ||
						libUsername.equals("Librarian_02") && !(libPassword.equals("LibTwo")) ||
					    libUsername.equals("Librarian_03") && !(libPassword.equals("LibThree"))) 
				{	
					
							int Incorrect = JOptionPane.showConfirmDialog(null,"INCORRECT PASSWORD","", JOptionPane.CLOSED_OPTION);
								if(Incorrect == JOptionPane.OK_OPTION) {
									LibrarianLogIn libLogIn = new LibrarianLogIn();
									libLogIn.setVisible(true);
									dispose();
						}
					
				}
				else if(!(libUsername.equals("Librarian_01")) && !(libPassword.equals("LibOne")) ||
						!(libUsername.equals("Librarian_02")) && !(libPassword.equals("LibTwo")) ||
					    !(libUsername.equals("Librarian_03")) && !(libPassword.equals("LibThree"))) 
				{
					int Incorrect = JOptionPane.showConfirmDialog(null,"INCORRECT USERNAME and PASSWORD","", JOptionPane.CLOSED_OPTION);
					if(Incorrect == JOptionPane.OK_OPTION) {
						LibrarianLogIn libLogIn = new LibrarianLogIn();
						libLogIn.setVisible(true);
						dispose();
						
					}
				}
			
			}		
		});
		
		librarianLogInButton.setBounds(245, 209, 89, 23);
		panel.add(librarianLogInButton);
		
	}
}
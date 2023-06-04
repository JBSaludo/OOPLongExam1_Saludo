package advancedLibrary;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import personalPortfolio.MyWorksPage;

import java.awt.Color;

//Booklist class inherits from the JFrame class and serves as the main frame for the book list screen
public class BookList extends JFrame {
	
	//Initializes variables and JLabels
	private JPanel contentPane;
	private JTextField inputTextField;
	static int book1Copy = 2;
	static int book2Copy = 3;
	static int book3Copy = 4;

	static JLabel bookOneCopy = new JLabel();
	static JLabel bookTwoCopy = new JLabel();
	static JLabel bookThreeCopy = new JLabel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Creates instance of the BookList class and make it visible
					BookList frame = new BookList();
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
	//Constructor for the BookList class
	public BookList() {
		//Sets some basic properties of the frame
		setTitle("List of Books");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 302);
		setLocationRelativeTo(null);
		//Creates a new JPanel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 662, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Sets the number of book copies and add them to the panel
		bookOneCopy.setText(Integer.toString(book1Copy));
		bookOneCopy.setBounds(515, 97, 46, 14);
		bookOneCopy.setVisible(true);
		panel.add(bookOneCopy);

		bookTwoCopy.setText(Integer.toString(book2Copy));
		bookTwoCopy.setBounds(515, 122, 46, 14);
		bookTwoCopy.setVisible(true);
		panel.add(bookTwoCopy);

		bookThreeCopy.setText(Integer.toString(book3Copy));
		bookThreeCopy.setBounds(515, 147, 46, 14);
		bookThreeCopy.setVisible(true);
		panel.add(bookThreeCopy);
		
		//Adds labels, buttons, and their properties to the panel
		JLabel listOfBooksTitleLabel = new JLabel("List of Books");
		listOfBooksTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		listOfBooksTitleLabel.setBounds(235, 21, 202, 43);
		panel.add(listOfBooksTitleLabel);

		JLabel book1Label = new JLabel("[0] : System Analysis 2012 by Gary B. Shelly.");
		book1Label.setBounds(41, 97, 268, 14);
		panel.add(book1Label);

		JLabel chooseLabel = new JLabel("Please choose number to rent a book.");
		chooseLabel.setBounds(41, 75, 251, 14);
		panel.add(chooseLabel);

		JLabel book2Label = new JLabel("[1] : Android Application 2014 by Corine Hoisington.");
		book2Label.setBounds(41, 122, 329, 14);
		panel.add(book2Label);

		JLabel book3Label = new JLabel("[2] : Programming Concepts and Logic Formulation 2015 by Rosauro E. Manuel.");
		book3Label.setBounds(41, 147, 484, 14);
		panel.add(book3Label);
		
		//Creates a button to go back to the librarian login page
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianLogIn libLogIn = new LibrarianLogIn();
				libLogIn.setVisible(true);
				dispose();
			}
		});
		
		//Sets up an action listener for the back button
		backButton.setBounds(202, 216, 89, 23);
		panel.add(backButton);
		
		//Creates a button to submit the user's input
		JButton submitButton = new JButton("Submit");
		//Sets up an action listener for the submit button
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Creates an ArrayList to hold the available books
				ArrayList<Books> book = new ArrayList<>();
				
				//Creates three instances of the Books class and add them to the ArrayList
				Books bookNum1 = new Books();
				bookNum1.title = "System Analysis and Design";
				bookNum1.author = "Gary B. Shelly";

				Books bookNum2 = new Books();
				bookNum2.title = "Android Application";
				bookNum2.author = "Corine Hoisington";

				Books bookNum3 = new Books();
				bookNum3.title = "Programming Concepts and Logic Formulation";
				bookNum3.author = "Rosauro E. Manuel";

				book.add(bookNum1);
				book.add(bookNum2);
				book.add(bookNum3);

				try {
					//Parse the user's input as an integer
					int choice = Integer.parseInt(inputTextField.getText());
					//Gets the book that corresponds to the user's input
					Books theBook = book.get(choice);
					
					//Checks if there are no copies of the chosen book left
					if (choice == 0 && book1Copy < 1) {
						JOptionPane.showConfirmDialog(null, "No copies available.", "", JOptionPane.CLOSED_OPTION);
					} else if (choice == 1 && book2Copy < 1) {
						JOptionPane.showConfirmDialog(null, "No copies available.", "", JOptionPane.CLOSED_OPTION);
					} else if (choice == 2 && book3Copy < 1) {
						JOptionPane.showConfirmDialog(null, "No copies available.", "", JOptionPane.CLOSED_OPTION);
					}
					
					//If there are copies of the chosen book left, continue
					if (choice == 0 && book1Copy >= 1) {
						//Asks the user if they want to rent the book
						int chooseOkay = JOptionPane.showConfirmDialog(null,"You choose: " + book.get(choice).getTitle(), "", JOptionPane.CLOSED_OPTION);
						book1Copy -= 1;
						bookOneCopy.setText(Integer.toString(book1Copy));
						if (chooseOkay == JOptionPane.OK_OPTION) {
							//If the user chooses to rent the book again, set the page to be visible again
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "Ask",JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								setVisible(true);
							} else {
								dispose();
								LogIn LogIn = new LogIn();
								LogIn.setVisible(true);
							}
						}
						//Checks if user chose the second book and there is at least one copy available
					} else if (choice == 1 && book2Copy >= 1) {
						int chooseOkay = JOptionPane.showConfirmDialog(null,"You choose: " + book.get(choice).getTitle(), "", JOptionPane.CLOSED_OPTION);
						book2Copy -= 1;
						bookTwoCopy.setText(Integer.toString(book2Copy));
						if (chooseOkay == JOptionPane.OK_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "Ask",JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								setVisible(true);
							} else {
								dispose();
								LogIn LogIn = new LogIn();
								LogIn.setVisible(true);
							}
						}
					//Checks if user chose the third book and there is at least one copy available
					} else if (choice == 2 && book3Copy >= 1) {

						int chooseOkay = JOptionPane.showConfirmDialog(null,"You choose: " + book.get(choice).getTitle(), "", JOptionPane.CLOSED_OPTION);

						book3Copy -= 1;
						bookThreeCopy.setText(Integer.toString(book3Copy));

						if (chooseOkay == JOptionPane.OK_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "Ask",
									JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								setVisible(true);
							} else {
								dispose();
								LogIn LogIn = new LogIn();
								LogIn.setVisible(true);
							}
						}
					}
				//Catch for errors
				} catch (NumberFormatException ex) {
					int choice = JOptionPane.showConfirmDialog(null, "INPUT MUST BE IN THE CHOICES, TRY AGAIN!", "", JOptionPane.CLOSED_OPTION);
					if (choice == JOptionPane.OK_OPTION) {
						dispose();
						BookList booksList = new BookList();
						booksList.setVisible(true);
					}
				} catch (IndexOutOfBoundsException ex) {
					int choice = JOptionPane.showConfirmDialog(null, "INDEX DOES NOT EXIST, TRY AGAIN!", "", JOptionPane.CLOSED_OPTION);
					if (choice == JOptionPane.OK_OPTION) {
						dispose();
						BookList booksList = new BookList();
						booksList.setVisible(true);
					}
				}
			}

		});
		
		//Button for to submit user input
		submitButton.setBounds(381, 216, 89, 23);
		panel.add(submitButton);
		
		//Text field for user input
		inputTextField = new JTextField();
		inputTextField.setText("Enter number.");
		inputTextField.setBounds(202, 172, 268, 20);
		panel.add(inputTextField);
		inputTextField.setColumns(10);
		
		//Label for available copies
		JLabel CopiesLabel = new JLabel("Available copies:");
		CopiesLabel.setBounds(480, 75, 103, 14);
		panel.add(CopiesLabel);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				MyWorksPage MyWorksPage = new MyWorksPage();
  				MyWorksPage.setVisible(true);
  				dispose();
  				}
  			});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(567, 10, 85, 21);
		panel.add(btnNewButton);
		
	}
}
